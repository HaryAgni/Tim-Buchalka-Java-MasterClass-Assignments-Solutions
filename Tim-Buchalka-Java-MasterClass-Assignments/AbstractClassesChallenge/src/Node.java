public class Node extends ListItems{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItems next() {
        return this.rightLink;
    }

    @Override
    ListItems setNext(ListItems items) {
        this.rightLink =items;
        return this.rightLink;
    }

    @Override
    ListItems previous() {
        return this.leftLink;
    }

    @Override
    ListItems setPrevious(ListItems items) {
        this.leftLink =items;
        return this.leftLink;
    }


    @Override
    int compareTo(ListItems item) {
        if (item!=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else return -1;
    }
}
