public class ListElement {
  private ListElement next;
  //private ListElement previous;
  private int data;

  public ListElement ()
  {
    this.data = 0;
    this.next = null;
    //this.previous = null ;
  }

  public setData(int data)
  {
    this.data=data;
  }
  public getData()
  {
    return this.data;
  }
}
