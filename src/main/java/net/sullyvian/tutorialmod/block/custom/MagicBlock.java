package net.sullyvian.tutorialmod.block.custom;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
// import net.sullyvian.tutorialmod.item.ModItems;
import net.sullyvian.tutorialmod.util.ModTags;

public class MagicBlock extends Block {

    public MagicBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity) {
            // if ((itemEntity.getStack().getItem() == ModItems.RAW_PINK_GARNET)) {
            if (isValidItem(itemEntity.getStack())) {
                int itemCount = itemEntity.getStack().getCount();
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemCount));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    private boolean isValidItem(ItemStack stack) {
        return stack.isIn(ModTags.Items.TRANSFORMABLE_ITEMS);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType options) {
        // add tooltip, se lang folder for the tooltip's content
        tooltip.add(Text.translatable("tooltip.tutorialmod.magic_block.tooltip"));
        // for multiline tooltip, just add a new tooltip
        super.appendTooltip(stack, context, tooltip, options);
    }

}
