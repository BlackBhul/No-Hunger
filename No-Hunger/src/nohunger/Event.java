package nohunger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Event implements Listener {
	
	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent event)
	{
	   event.setCancelled(true);
	}

}
