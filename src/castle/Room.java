package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room)
    {
    	exits.put(dir, room);
    }
    
    public String getExitDesc()
    {
    	StringBuffer str= new StringBuffer();
    	for (String dir: exits.keySet())
    	{
    		str.append(dir);
    		str.append(" ");
    	}
    	return str.toString();
    }
    
    public Room getExit(String dir)
    {
    	
    	return exits.get(dir);
    }
    
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }

    @Override
    public String toString()
    {
        return description;
    }
}
