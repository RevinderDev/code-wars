import java.util.List;
import java.util.ArrayList;


// TODO: complete this object/class

public class PaginationHelper<I> {

  private List<I> data;
  private int itemsPerPage;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    data = new ArrayList<>(collection);
  }

  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return data.size();
  }

  /**
   * returns the number of pages
   */
  public int pageCount() {
    return Math.round((data.size() / itemsPerPage) + 1);
  }

  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    int zeroBasedCount = pageCount() - 1;
    if(zeroBasedCount < pageIndex)
      return -1;
    else if(zeroBasedCount == pageIndex)
      return data.size() % itemsPerPage;
    else
      return itemsPerPage;
  }

  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if(data.size() < itemIndex || data.size() == 0 || itemIndex < 0)
      return -1;
    else
      return itemIndex / itemsPerPage;
  }
}
