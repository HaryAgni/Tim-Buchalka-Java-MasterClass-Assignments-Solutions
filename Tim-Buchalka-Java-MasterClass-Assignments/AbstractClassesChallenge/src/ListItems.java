public abstract class ListItems {
    protected ListItems rightLink = null;
    protected ListItems leftLink = null;
    protected Object value;

    public ListItems(Object value) {
        this.value = value;
    }
    abstract ListItems next();
    abstract ListItems setNext(ListItems items);
    abstract ListItems previous();
    abstract ListItems setPrevious(ListItems items);
    abstract int compareTo(ListItems item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}