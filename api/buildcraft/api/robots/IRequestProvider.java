/**
 * Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * The BuildCraft API is distributed under the terms of the MIT License.
 * Please check the contents of the license, which should be located
 * as "LICENSE.API" in the BuildCraft source code distribution.
 */
package buildcraft.api.robots;

import net.minecraft.item.ItemStack;


public interface IRequestProvider {
	/**
	 * Return the total number of request slots available from this provider.
	 */
	int getRequestsCount();

	/**
	 * Return the stack requested in the slot. Returns null if there's no
	 * request in that slot/
	 */
	ItemStack getRequest(int slot);

	/**
	 * Provide a stack to fulfill request in the slot. Return the stack minus
	 * items that have been taken.
	 */
	ItemStack offerItem(int slot, ItemStack stack);
}
