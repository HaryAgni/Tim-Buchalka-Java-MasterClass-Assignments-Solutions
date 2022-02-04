public class MyLinkedList implements NodeList {
    private ListItems root = null;

    public MyLinkedList(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItems newItems) {
        if(this.root == null){
            this.root =newItems;
            return true;
        }
        ListItems currentItem = this.root;
        while ((currentItem!=null)){
            int comparison =(currentItem.compareTo(newItems));
            if (comparison<0){
                if (currentItem.next()!=null){
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(newItems).setPrevious(currentItem.previous());
                    return true;
                }
            }
            else if (comparison>0){
                if (currentItem.previous()!=null){
                    currentItem.previous().setNext(newItems).setPrevious(currentItem.previous());
                    newItems.setNext(currentItem).setPrevious(newItems);
                }
                else {
                    newItems.setNext(this.root).setPrevious(newItems);
                    this.root = newItems;
                }
                return true;
            }
            else {
                System.out.println(newItems.getValue()+" is already present, not added. ");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItems items) {
        if (items!=null){
            System.out.println("Deleting item "+items.getValue());
        }
        ListItems currentItem = this.root;
        while (currentItem!= null){
            int comparison = currentItem.compareTo(items);
            if (comparison ==0){
                if (currentItem == this.root){
                    this.root = currentItem.next();
                }
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() !=null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if (comparison<0){
                currentItem = currentItem.next();
            }
            else return false;
        }
        return false;
    }

    @Override
    public void traverse(ListItems root) {
        if(root ==null){
            System.out.println("The list is empty");
        }
        else {
            while (root!=null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
