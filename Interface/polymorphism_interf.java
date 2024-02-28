package Interface;
interface camera{
    void take_photo();
    void take_video();
}
interface show_map{
    void set_route();
    void show_distance();
}


class smart_phone implements camera,show_map{
    public void take_photo(){
        System.out.println("photo took.");
    }
    
    public void take_video(){
        System.out.println("Taking the video");
    }
    public void set_route(){
        System.out.println("Route set");
    }
    public void show_distance(){
        System.out.println("Distance showed");
    }
}

public class polymorphism_interf {
    public static void main(String[] args) {
        // THis is only to access the camera
        camera c=new smart_phone();
        c.take_photo();
        c.take_video();
         // This is to access only map
        show_map m=new smart_phone();
        m.set_route();
        m.show_distance();
    }
    
}
