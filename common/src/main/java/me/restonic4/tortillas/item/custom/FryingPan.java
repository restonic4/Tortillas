package me.restonic4.tortillas.item.custom;

import me.restonic4.tortillas.Tortillas;
import me.restonic4.tortillas.sound.SoundRegister;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FryingPan extends SwordItem {
    public FryingPan(Tier tier, int i, float f, Properties properties) {
        super(tier, i, f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.level.playSound(null, pAttacker.getX(), pAttacker.getY(), pAttacker.getZ(), SoundRegister.FRYING_PAN.get().get(), SoundSource.PLAYERS, 1.0F, Tortillas.getRandomFloat(0.75f,1.25f));

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
