package com.bioxx.tfc.api.Interfaces;

import com.bioxx.tfc.api.Metal;

import net.minecraft.item.ItemStack;

public interface ISmeltable 
{
	public Metal getMetalType(ItemStack is);
	
	/**
	 * @return Percent of a full Unshaped Mold 0-100. Beyond 100 will give more than one mold worth of metal.
	 */
	public short getMetalReturnAmount(ItemStack is);
	
	public boolean isSmeltable(ItemStack is);
	
	public EnumTier getSmeltTier(ItemStack is);
	
	public enum EnumTier
	{
		TierI(1),TierII(2),TierIII(3),TierIV(4), TierV(5), TierVI(6), TierVII(7), TierVIII(8), TierIX(9), TierX(10);
		
		public int tier;
		
		EnumTier(int t)
		{
			tier = t;
		}
	}
}
