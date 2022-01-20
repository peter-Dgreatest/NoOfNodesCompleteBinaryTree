public class ProgramFOrOlogn {


    static int getrightHeight(Node node, int cnt){
        Node right = node.right;
        if(right!=null){
            cnt++;
            return getrightHeight(right,cnt);
        }
        return cnt;
    }

    static int getleftHeight(Node node, int cnt){
        Node left = node.left;
        if(left!=null){
            cnt++;
            return getleftHeight(left,cnt);
        }
        return cnt;
    }

    static int getCounts(Node node){
        int rntcnt = getrightHeight(node,0);
        int lftcnt = getleftHeight(node,0);

        if(rntcnt==lftcnt){
            if(rntcnt==0)
                return 1;
            return (int) ((Math.pow(2,rntcnt)*2)-1);
        }
        else
            return 1+getCounts(node.right)+ getCounts(node.left);
    }

    public static void main(String[] args) {
        System.out.println(1 << 4);

        System.out.println ((Math.pow(2,2)*2)-1);
//
//        Node node1 = new Node(1);
//        node1.left = new Node(2);
//        node1.right = new Node(3);
//
//        node1.left.left = new Node(4);
//        node1.left.right = new Node(5);
//
//
//        node1.right.left = new Node(6);
//        node1.right.right = new Node(7);
//
//        node1.left.left.left = new Node(8);
//        node1.left.left.right = new Node(9);
//        node1.left.right.left = new Node(10);
//        node1.left.right.right = new Node(11);
//
//
//        node1.right.left.left = new Node(12);
//        node1.right.left.right = new Node(13);
//        node1.right.right.left = new Node(14);
//        node1.right.right.right = new Node(15);
//
//        // node1.right.right.right.right = new Node(6);
//
//        System.out.println(getCounts(node1));
    }
}
