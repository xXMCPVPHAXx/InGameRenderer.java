//Vorraussetzung ist natürlich dass du einen Ingamernderer besitzt ;)
		  
		  //Ping Check!
		  int ping;
		  try
		  {
			  ping = mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()).getResponseTime();
		  }
		  catch (Exception ex)
		  {
			  ping = 0;
		  }
		  
		  //Server Version Check!
		  String serververion;
		  try
		  {
			  serververion = mc.getCurrentServerData().gameVersion;
		  }
		  catch (Exception ex)
		  {
			  serververion = "Vanilla";
		  }
		  
		  //Renderer
		  float scale = 1.1F;
		  GL11.glScalef(scale, scale, scale);
		  drawString(fr, "§7FPS:§f " + Minecraft.getDebugFPS(), 3, 23, 1677215);
		  drawString(fr, "§7Ping: §f"+ ping, 55, 23, 1677215);
		  drawString(fr, "§7Server: §f" + serververion, 3, 35, 1677215);
		  GL11.glScalef(1.0F / scale, 1.0F /scale, 1.0F / scale);
