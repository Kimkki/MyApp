
package photomgnapp;

public class Album {
    private final String name;
    private final String condition;
    private final PhotoManager manager;
    
    
    //constructor 
    public Album(String name, String condition, PhotoManager manager){
    this.name = name;
    this.condition = condition;
    this.manager = manager;
    }
    
    
    public String getName(){
    return name;
    }
    
    public String getCondition(){
    return condition;
    }
    
    public PhotoManager getPhotoManager(){
    return manager;
    }
    
//    public LinkedList<Photo> getPhotos(){
//    return 
//    }
}
