import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;

public class LoopInspector {

  public int loopSize(Node node) {
      Set<Node> nodeSet = new LinkedHashSet<Node>();
      while(true)
      {
        if(!nodeSet.add(node))
           break;
        node = node.getNext();
      }
      ArrayList<Node> nodeArray = new ArrayList<>(nodeSet);
      return nodeArray.size() - nodeArray.indexOf(node);
  }

}