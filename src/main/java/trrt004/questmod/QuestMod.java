package trrt004.questmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import trrt004.questmod.item.ModItems;

public class QuestMod implements ModInitializer {
	public static final String MOD_ID = "questmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}