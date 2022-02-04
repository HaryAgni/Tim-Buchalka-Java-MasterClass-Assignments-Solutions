public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "3 4 5 1 7 9 2 6 8 ";
        String[] data = stringData.split(" ");
        for (String s : data){
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
    }

















}
