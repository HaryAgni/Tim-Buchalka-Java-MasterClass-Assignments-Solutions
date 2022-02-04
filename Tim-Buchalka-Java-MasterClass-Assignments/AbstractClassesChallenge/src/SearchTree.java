public class SearchTree implements NodeList{
    private ListItems root = null;

    public SearchTree(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItems newItems) {
        if (this.root ==null){
            this.root = newItems;
            return true;
        }
        ListItems currentItem =this.root;
        while (currentItem!=null){
            int comparison = currentItem.compareTo(newItems);
            if (comparison<0){
                if (currentItem.next()!=null){
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(newItems);
                    return true;
                }
            }else if (comparison>0){
                if (currentItem.previous()!=null){
                   currentItem = currentItem.previous();
                }else {
                    currentItem.setPrevious(newItems);
                    return true;
                }
            }
            else {
                System.out.println(newItems.getValue()+" is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItems items) {
        if (items!= null){
            System.out.println("Deleting Item "+ items.getValue());
        }
        ListItems currentItem = this.root;
        ListItems parentItem = currentItem;
        while (currentItem!=null){
            int comparison = currentItem.compareTo(items);
            if (comparison<0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if (comparison>0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }
    private void performRemoval(ListItems items, ListItems parent){
        if (items.next()==null){
            if (parent.next()==items){
                parent.setNext(items.previous());
            }
            else if (parent.previous()==items){
                parent.setPrevious(items.previous());
            }
            else {
                this.root = items.previous();
            }
        }
        else if (items.previous()==null){
            if (parent.next()==items){
                parent.setNext(items.next());
            }
            else if (parent.previous()==items){
                parent.setPrevious(items.next());
            }
            else {
                this.root = items.next();
            }
        }
        else {
            ListItems current = items.next();
            ListItems leftMostParent = items;
            while (current.previous()!=null){
                leftMostParent = current;
                current = current.previous();
            }
            items.setValue(current.getValue());
            if (leftMostParent==items){
                items.setNext(current.next());
            }
            else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }















































    @Override
    public void traverse(ListItems root) {
        if (root!=null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }




















    }
}
