    /*
    * Open InventoryEffectRenderer.java (CTRL+SHIFT+T to find it easier.)
    * Navigate to updateActivePotionEffects()
    * 
    * Replace: this.guiLeft = 160 + (this.width - this.xSize - 200) / 2;
    * With: this.guiLeft = (this.width - this.xSize) / 2;
    * 
    * Example down below.
    */
    
    protected void updateActivePotionEffects()
    {
        if (!this.mc.thePlayer.getActivePotionEffects().isEmpty())
        {
        	// Uncomment the line below to allow the inventory to shift.
          //this.guiLeft = 160 + (this.width - this.xSize - 200) / 2;
        	
        	this.guiLeft = (this.width - this.xSize) / 2;
        	this.hasActivePotionEffects = true;
        }
        else
        {
          this.guiLeft = (this.width - this.xSize) / 2;
          this.hasActivePotionEffects = false;
        }
    }
