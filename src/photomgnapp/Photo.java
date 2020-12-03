
package photomgnapp;

import java.util.LinkedList;

public class Photo {
private final String path;
private final LinkedList<String> tags;


//constructor
public Photo(String path, LinkedList<String> tags){
this.path = path;
this.tags = tags;

}

public String getPath(){
return path;
}

public LinkedList<String> getTags(){
return tags;
}

}
