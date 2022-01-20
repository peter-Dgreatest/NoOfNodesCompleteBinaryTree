import java.util.ArrayList;

public class ProgramBFS {

    static int getNumberOfNodes(Node node){
        ArrayList<Node> nodesarr;
        nodesarr= new ArrayList<>();

        if(node==null)
            return 0;

        nodesarr.add(node);

        int nodeslength=1;
        boolean lastNodeSet =false;

        int order=2;

        while(nodesarr.size()>0){
            int cnt=nodesarr.size()-1;

            ArrayList nodesarr2= new ArrayList<>();
          //  if(order!=2)
                nodeslength = (int) (2*(Math.pow(2,(order-1)))-1);
            //else
              //  nodeslength = 3;
            while(cnt>=0) {
                Node nn = nodesarr.get(cnt);
                Node right = nn.right;
                Node left = nn.left;
                if (right == null || left==null)
                    lastNodeSet = true;
//                if (lastNode) {
//                    if (nn == null) {
//                        nodeslength--;
//                        if (left == null) {
//                            nodeslength--;
//                        } else {
//                            nodesarr2 = new ArrayList<>();
//                            break;
//                        }
//                    } else {
//                        nodesarr2 = new ArrayList<>();
//                        break;
//                    }
//                } else {
//                }
                if(lastNodeSet){
                    if(right==null)
                        nodeslength--;
                    if(left==null)
                        nodeslength--;
                }else {
                    nodesarr2.add(right);
                    nodesarr2.add(left);
                }
                nodesarr.remove(cnt);
                cnt--;
            }
            order++;
            nodesarr= nodesarr2;
        }
        return nodeslength;
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);

        node1.left.left = new Node(4);
        node1.left.right = new Node(5);


        node1.right.left = new Node(6);
        node1.right.right = new Node(7);

        node1.left.left.left = new Node(8);
        node1.left.left.right = new Node(9);
        node1.left.right.left = new Node(10);
        node1.left.right.right = new Node(11);


        node1.right.left.left = new Node(12);
        node1.right.left.right = new Node(13);
        node1.right.right.left = new Node(14);
        node1.right.right.right = new Node(15);

       // node1.right.right.right.right = new Node(6);

        System.out.println(getNumberOfNodes(node1));
    }
}



class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

