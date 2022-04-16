/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.avmoga.dpixel.items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.avmoga.dpixel.Dungeon;
import com.avmoga.dpixel.actors.hero.Hero;
import com.avmoga.dpixel.actors.mobs.npcs.Wandmaker.Rotberry;
import com.avmoga.dpixel.items.armor.Armor;
import com.avmoga.dpixel.items.armor.ClothArmor;
import com.avmoga.dpixel.items.armor.LeatherArmor;
import com.avmoga.dpixel.items.armor.MailArmor;
import com.avmoga.dpixel.items.armor.PlateArmor;
import com.avmoga.dpixel.items.armor.ScaleArmor;
import com.avmoga.dpixel.items.artifacts.AlchemistsToolkit;
import com.avmoga.dpixel.items.artifacts.AresChains;
import com.avmoga.dpixel.items.artifacts.Artifact;
import com.avmoga.dpixel.items.artifacts.CapeOfThorns;
import com.avmoga.dpixel.items.artifacts.ChaliceOfBlood;
import com.avmoga.dpixel.items.artifacts.CloakOfShadows;
import com.avmoga.dpixel.items.artifacts.CommRelay;
import com.avmoga.dpixel.items.artifacts.DriedRose;
import com.avmoga.dpixel.items.artifacts.HornOfPlenty;
import com.avmoga.dpixel.items.artifacts.MasterThievesArmband;
import com.avmoga.dpixel.items.artifacts.MysticBranch;
import com.avmoga.dpixel.items.artifacts.RingOfDisintegration;
import com.avmoga.dpixel.items.artifacts.SandalsOfNature;
import com.avmoga.dpixel.items.artifacts.TalismanOfForesight;
import com.avmoga.dpixel.items.artifacts.TimekeepersHourglass;
import com.avmoga.dpixel.items.artifacts.UnstableSpellbook;
import com.avmoga.dpixel.items.artifacts.WraithAmulet;
import com.avmoga.dpixel.items.bags.Bag;
import com.avmoga.dpixel.items.food.Blackberry;
import com.avmoga.dpixel.items.food.BlueMilk;
import com.avmoga.dpixel.items.food.Blueberry;
import com.avmoga.dpixel.items.food.Cloudberry;
import com.avmoga.dpixel.items.food.DeathCap;
import com.avmoga.dpixel.items.food.Earthstar;
import com.avmoga.dpixel.items.food.Food;
import com.avmoga.dpixel.items.food.GoldenJelly;
import com.avmoga.dpixel.items.food.JackOLantern;
import com.avmoga.dpixel.items.food.Moonberry;
import com.avmoga.dpixel.items.food.MysteryMeat;
import com.avmoga.dpixel.items.food.Nut;
import com.avmoga.dpixel.items.food.Pasty;
import com.avmoga.dpixel.items.food.PixieParasol;
import com.avmoga.dpixel.items.potions.Potion;
import com.avmoga.dpixel.items.potions.PotionOfExperience;
import com.avmoga.dpixel.items.potions.PotionOfFrost;
import com.avmoga.dpixel.items.potions.PotionOfHealing;
import com.avmoga.dpixel.items.potions.PotionOfInvisibility;
import com.avmoga.dpixel.items.potions.PotionOfLevitation;
import com.avmoga.dpixel.items.potions.PotionOfLiquidFlame;
import com.avmoga.dpixel.items.potions.PotionOfMending;
import com.avmoga.dpixel.items.potions.PotionOfMight;
import com.avmoga.dpixel.items.potions.PotionOfMindVision;
import com.avmoga.dpixel.items.potions.PotionOfOverHealing;
import com.avmoga.dpixel.items.potions.PotionOfParalyticGas;
import com.avmoga.dpixel.items.potions.PotionOfPurity;
import com.avmoga.dpixel.items.potions.PotionOfStrength;
import com.avmoga.dpixel.items.potions.PotionOfToxicGas;
import com.avmoga.dpixel.items.rings.Ring;
import com.avmoga.dpixel.items.rings.RingOfAccuracy;
import com.avmoga.dpixel.items.rings.RingOfElements;
import com.avmoga.dpixel.items.rings.RingOfEvasion;
import com.avmoga.dpixel.items.rings.RingOfForce;
import com.avmoga.dpixel.items.rings.RingOfFuror;
import com.avmoga.dpixel.items.rings.RingOfHaste;
import com.avmoga.dpixel.items.rings.RingOfMagic;
import com.avmoga.dpixel.items.rings.RingOfMight;
import com.avmoga.dpixel.items.rings.RingOfSharpshooting;
import com.avmoga.dpixel.items.rings.RingOfTenacity;
import com.avmoga.dpixel.items.rings.RingOfWealth;
import com.avmoga.dpixel.items.scrolls.Scroll;
import com.avmoga.dpixel.items.scrolls.ScrollOfIdentify;
import com.avmoga.dpixel.items.scrolls.ScrollOfLullaby;
import com.avmoga.dpixel.items.scrolls.ScrollOfMagicMapping;
import com.avmoga.dpixel.items.scrolls.ScrollOfMagicalInfusion;
import com.avmoga.dpixel.items.scrolls.ScrollOfMirrorImage;
import com.avmoga.dpixel.items.scrolls.ScrollOfPsionicBlast;
import com.avmoga.dpixel.items.scrolls.ScrollOfRage;
import com.avmoga.dpixel.items.scrolls.ScrollOfRecharging;
import com.avmoga.dpixel.items.scrolls.ScrollOfRegrowth;
import com.avmoga.dpixel.items.scrolls.ScrollOfRemoveCurse;
import com.avmoga.dpixel.items.scrolls.ScrollOfTeleportation;
import com.avmoga.dpixel.items.scrolls.ScrollOfTerror;
import com.avmoga.dpixel.items.scrolls.ScrollOfUpgrade;
import com.avmoga.dpixel.items.wands.Wand;
import com.avmoga.dpixel.items.wands.WandOfAmok;
import com.avmoga.dpixel.items.wands.WandOfAvalanche;
import com.avmoga.dpixel.items.wands.WandOfBlink;
import com.avmoga.dpixel.items.wands.WandOfDisintegration;
import com.avmoga.dpixel.items.wands.WandOfFirebolt;
import com.avmoga.dpixel.items.wands.WandOfFlock;
import com.avmoga.dpixel.items.wands.WandOfLightning;
import com.avmoga.dpixel.items.wands.WandOfMagicMissile;
import com.avmoga.dpixel.items.wands.WandOfPoison;
import com.avmoga.dpixel.items.wands.WandOfRegrowth;
import com.avmoga.dpixel.items.wands.WandOfSlowness;
import com.avmoga.dpixel.items.wands.WandOfTelekinesis;
import com.avmoga.dpixel.items.wands.WandOfTeleportation;
import com.avmoga.dpixel.items.weapon.Weapon;
import com.avmoga.dpixel.items.weapon.melee.BattleAxe;
import com.avmoga.dpixel.items.weapon.melee.Dagger;
import com.avmoga.dpixel.items.weapon.melee.Glaive;
import com.avmoga.dpixel.items.weapon.melee.Knuckles;
import com.avmoga.dpixel.items.weapon.melee.Longsword;
import com.avmoga.dpixel.items.weapon.melee.Mace;
import com.avmoga.dpixel.items.weapon.melee.Quarterstaff;
import com.avmoga.dpixel.items.weapon.melee.ShortSword;
import com.avmoga.dpixel.items.weapon.melee.Spear;
import com.avmoga.dpixel.items.weapon.melee.Spork;
import com.avmoga.dpixel.items.weapon.melee.Sword;
import com.avmoga.dpixel.items.weapon.melee.WarHammer;
import com.avmoga.dpixel.items.weapon.missiles.Boomerang;
import com.avmoga.dpixel.items.weapon.missiles.CurareDart;
import com.avmoga.dpixel.items.weapon.missiles.Dart;
import com.avmoga.dpixel.items.weapon.missiles.IncendiaryDart;
import com.avmoga.dpixel.items.weapon.missiles.Javelin;
import com.avmoga.dpixel.items.weapon.missiles.Shuriken;
import com.avmoga.dpixel.items.weapon.missiles.Tamahawk;
import com.avmoga.dpixel.plants.BlandfruitBush;
import com.avmoga.dpixel.plants.Blindweed;
import com.avmoga.dpixel.plants.Dewcatcher;
import com.avmoga.dpixel.plants.Dreamfoil;
import com.avmoga.dpixel.plants.Earthroot;
import com.avmoga.dpixel.plants.Fadeleaf;
import com.avmoga.dpixel.plants.Firebloom;
import com.avmoga.dpixel.plants.Flytrap;
import com.avmoga.dpixel.plants.Icecap;
import com.avmoga.dpixel.plants.Phaseshift;
import com.avmoga.dpixel.plants.Plant;
import com.avmoga.dpixel.plants.Sorrowmoss;
import com.avmoga.dpixel.plants.Starflower;
import com.avmoga.dpixel.plants.Stormvine;
import com.avmoga.dpixel.plants.Sungrass;
import com.watabou.utils.Bundle;
import com.watabou.utils.Random;

public class Generator {

	public static enum Category {
		WEAPON(150, Weapon.class), ARMOR(100, Armor.class), POTION(500,
				Potion.class), SCROLL(400, Scroll.class), WAND(40, Wand.class), RING(
				15, Ring.class), ARTIFACT(20, Artifact.class), SEED(0,
				Plant.Seed.class), SEED2(0,	Plant.Seed.class), SEEDRICH(0,	Plant.Seed.class),
				FOOD(0, Food.class), GOLD(500, Gold.class), BERRY(50, Food.class), MUSHROOM(0, Food.class);

		public Class<?>[] classes;
		public float[] probs;

		public float prob;
		public Class<? extends Item> superClass;

		private Category(float prob, Class<? extends Item> superClass) {
			this.prob = prob;
			this.superClass = superClass;
		}

		public static int order(Item item) {
			for (int i = 0; i < values().length; i++) {
				if (values()[i].superClass.isInstance(item)) {
					return i;
				}
			}

			return item instanceof Bag ? Integer.MAX_VALUE
					: Integer.MAX_VALUE - 1;
		}
	};

	private static HashMap<Category, Float> categoryProbs = new HashMap<Generator.Category, Float>();

	static {

		Category.GOLD.classes = new Class<?>[] { Gold.class };
		Category.GOLD.probs = new float[] { 1 };

		Category.SCROLL.classes = new Class<?>[] { ScrollOfIdentify.class,
				ScrollOfTeleportation.class, ScrollOfRemoveCurse.class,
				ScrollOfUpgrade.class, ScrollOfRecharging.class,
				ScrollOfMagicMapping.class, ScrollOfRage.class,
				ScrollOfTerror.class, ScrollOfLullaby.class,
				ScrollOfMagicalInfusion.class, ScrollOfPsionicBlast.class,
				ScrollOfMirrorImage.class, ScrollOfRegrowth.class };
		Category.SCROLL.probs = new float[] { 30, 10, 15, 0, 10, 20, 10, 8, 8,
				0, 3, 6, 0 };

		Category.POTION.classes = new Class<?>[] { PotionOfHealing.class,
				PotionOfExperience.class, PotionOfToxicGas.class,
				PotionOfParalyticGas.class, PotionOfLiquidFlame.class,
				PotionOfLevitation.class, PotionOfStrength.class,
				PotionOfMindVision.class, PotionOfPurity.class,
				PotionOfInvisibility.class, PotionOfMight.class,
				PotionOfFrost.class, PotionOfMending.class,
				PotionOfOverHealing.class};
		Category.POTION.probs = new float[] { 45, 4, 15, 10, 15, 10, 0, 20, 12,
				10, 0, 10, 10, 4};

		Category.WAND.classes = new Class<?>[] { WandOfTeleportation.class,
				WandOfSlowness.class, WandOfFirebolt.class,
				WandOfRegrowth.class, WandOfPoison.class, WandOfBlink.class,
				WandOfLightning.class, WandOfAmok.class,
				WandOfTelekinesis.class, WandOfFlock.class,
				WandOfMagicMissile.class, WandOfDisintegration.class,
				WandOfAvalanche.class };
		Category.WAND.probs = new float[] { 10, 10, 15, 6, 10, 11, 15, 10, 6,
				10, 0, 5, 5 };

		Category.WEAPON.classes = new Class<?>[] { Dagger.class,
				Knuckles.class, Quarterstaff.class, Spear.class, Mace.class,
				Sword.class, Longsword.class, BattleAxe.class, WarHammer.class,
				Glaive.class, ShortSword.class, Dart.class, Javelin.class,
				IncendiaryDart.class, CurareDart.class, Shuriken.class,
				Boomerang.class, Tamahawk.class, Spork.class };
		Category.WEAPON.probs = new float[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
				0, 1, 1, 1, 1, 0, 1, 0 };

		Category.ARMOR.classes = new Class<?>[] { ClothArmor.class,
				LeatherArmor.class, MailArmor.class, ScaleArmor.class,
				PlateArmor.class };
		Category.ARMOR.probs = new float[] { 1, 1, 1, 1, 1 };

		Category.FOOD.classes = new Class<?>[] { Food.class, Pasty.class,
				MysteryMeat.class };
		Category.FOOD.probs = new float[] { 4, 1, 0 };

		Category.RING.classes = new Class<?>[] { RingOfAccuracy.class,
				RingOfEvasion.class, RingOfElements.class, RingOfForce.class,
				RingOfFuror.class, RingOfHaste.class, RingOfMagic.class,
				RingOfMight.class, RingOfSharpshooting.class,
				RingOfTenacity.class, RingOfWealth.class };
		Category.RING.probs = new float[] { 10, 10, 10, 10, 10, 10, 2, 10, 10, 10, 0 };

		Category.ARTIFACT.classes = new Class<?>[] { CapeOfThorns.class,
				ChaliceOfBlood.class, CloakOfShadows.class, HornOfPlenty.class,
				MasterThievesArmband.class, SandalsOfNature.class,
				TalismanOfForesight.class, TimekeepersHourglass.class,
				UnstableSpellbook.class, AlchemistsToolkit.class,
				DriedRose.class, CommRelay.class, MysticBranch.class,
				AresChains.class, WraithAmulet.class, RingOfDisintegration.class// starts with no chance of spawning, chance is
								// set directly after beating ghost quest.
		};
		Category.ARTIFACT.probs = new float[] { 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };

		Category.SEED.classes = new Class<?>[] { 
				Firebloom.Seed.class, Icecap.Seed.class, Sorrowmoss.Seed.class, Blindweed.Seed.class, Sungrass.Seed.class,
				Earthroot.Seed.class, Fadeleaf.Seed.class, Rotberry.Seed.class, BlandfruitBush.Seed.class, Dreamfoil.Seed.class,
				Stormvine.Seed.class, Nut.class, Blackberry.class, Blueberry.class, Cloudberry.class,
				Moonberry.class, Starflower.Seed.class, Phaseshift.Seed.class, Flytrap.Seed.class, Dewcatcher.Seed.class};
		
		Category.SEED.probs = new float[] { 12, 12, 12, 12, 12,
				                            12, 12, 0, 2, 12,
				                            12, 48, 20, 4, 16,
				                            2, 1, 1, 4, 8};
		
		
		Category.SEED2.classes = new Class<?>[] { Firebloom.Seed.class,
				Icecap.Seed.class, Sorrowmoss.Seed.class, Blindweed.Seed.class,
				Sungrass.Seed.class, Earthroot.Seed.class, Fadeleaf.Seed.class,
				Rotberry.Seed.class, BlandfruitBush.Seed.class,
				Dreamfoil.Seed.class, Stormvine.Seed.class,
				Starflower.Seed.class, Phaseshift.Seed.class, Flytrap.Seed.class,
				Dewcatcher.Seed.class};
		
		Category.SEED2.probs = new float[] { 12, 12, 12, 12, 12, 12, 12, 0, 4, 12, 12, 2, 2, 6, 8};
		
		Category.SEEDRICH.classes = new Class<?>[] { Firebloom.Seed.class,
				Icecap.Seed.class, Sorrowmoss.Seed.class, Blindweed.Seed.class,
				Sungrass.Seed.class, Earthroot.Seed.class, Fadeleaf.Seed.class,
				Rotberry.Seed.class, BlandfruitBush.Seed.class,
				Dreamfoil.Seed.class, Stormvine.Seed.class,
				Starflower.Seed.class, Phaseshift.Seed.class, Flytrap.Seed.class,
				Dewcatcher.Seed.class};
		
		Category.SEEDRICH.probs = new float[] { 1, 1, 1, 1, 2, 1, 1, 0, 4, 1, 1, 4, 4, 8, 6};
		
		Category.BERRY.classes = new Class<?>[] {Blackberry.class, Blueberry.class, Cloudberry.class, Moonberry.class};
		Category.BERRY.probs = new float[] {8,2,2,1};	
		
		Category.MUSHROOM.classes = new Class<?>[] {BlueMilk.class, DeathCap.class, Earthstar.class, JackOLantern.class, PixieParasol.class, GoldenJelly.class};
		Category.MUSHROOM.probs = new float[] {2,2,2,2,2,2};
		
	}

	public static void reset() {
		for (Category cat : Category.values()) {
			categoryProbs.put(cat, cat.prob);
		}
	}

	public static Item random() {
		return random(Random.chances(categoryProbs));
	}

	public static Item random(Category cat) {
		try {

			categoryProbs.put(cat, categoryProbs.get(cat) / 2);

			switch (cat) {
			case ARMOR:
				return randomArmor();
			case WEAPON:
				return randomWeapon();
			case ARTIFACT:
				Item item = randomArtifact();
				// if we're out of artifacts, return a ring instead.
				return item != null ? item : random(Category.RING);
			default:
				return ((Item) cat.classes[Random.chances(cat.probs)]
						.newInstance()).random();
			}

		} catch (Exception e) {

			return null;

		}
	}

	public static Item random(Class<? extends Item> cl) {
		try {

			return ((Item) cl.newInstance()).random();

		} catch (Exception e) {

			return null;

		}
	}

	public static Armor randomArmor() {
		int curStr = Hero.STARTING_STR
				+ Dungeon.limitedDrops.strengthPotions.count;

		return randomArmor(curStr);
	}

	public static Armor randomArmor(int targetStr) {

		Category cat = Category.ARMOR;

		try {
			Armor a1 = (Armor) cat.classes[Random.chances(cat.probs)]
					.newInstance();
			Armor a2 = (Armor) cat.classes[Random.chances(cat.probs)]
					.newInstance();

			a1.random();
			a2.random();

			return Math.abs(targetStr - a1.STR) < Math.abs(targetStr - a2.STR) ? a1
					: a2;
		} catch (Exception e) {
			return null;
		}
	}

	public static Weapon randomWeapon() {
		int curStr = Hero.STARTING_STR
				+ Dungeon.limitedDrops.strengthPotions.count;

		return randomWeapon(curStr);
	}

	public static Weapon randomWeapon(int targetStr) {

		try {
			Category cat = Category.WEAPON;

			Weapon w1 = (Weapon) cat.classes[Random.chances(cat.probs)]
					.newInstance();
			Weapon w2 = (Weapon) cat.classes[Random.chances(cat.probs)]
					.newInstance();

			w1.random();
			w2.random();

			return Math.abs(targetStr - w1.STR) < Math.abs(targetStr - w2.STR) ? w1
					: w2;
		} catch (Exception e) {
			return null;
		}
	}

	// enforces uniqueness of artifacts throughout a run.
	public static Artifact randomArtifact() {

		try {
			Category cat = Category.ARTIFACT;
			int i = Random.chances(cat.probs);

			// if no artifacts are left, return null
			if (i == -1) {
				return null;
			}

			Artifact artifact = (Artifact) cat.classes[i].newInstance();

			// remove the chance of spawning this artifact.
			cat.probs[i] = 0;
			spawnedArtifacts.add(cat.classes[i].getSimpleName());

			artifact.random();

			return artifact;

		} catch (Exception e) {
			return null;
		}
	}

	public static boolean removeArtifact(Artifact artifact) {
		if (spawnedArtifacts.contains(artifact.getClass().getSimpleName()))
			return false;

		Category cat = Category.ARTIFACT;
		for (int i = 0; i < cat.classes.length; i++)
			if (cat.classes[i].equals(artifact.getClass())) {
				if (cat.probs[i] == 1) {
					cat.probs[i] = 0;
					spawnedArtifacts.add(artifact.getClass().getSimpleName());
					return true;
				} else
					return false;
			}

		return false;
	}

	// resets artifact probabilities, for new dungeons
	public static void initArtifacts() {
		Category.ARTIFACT.probs = new float[] { 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		spawnedArtifacts = new ArrayList<String>();
	}

	private static ArrayList<String> spawnedArtifacts = new ArrayList<String>();

	private static final String ARTIFACTS = "artifacts";

	// used to store information on which artifacts have been spawned.
	public static void storeInBundle(Bundle bundle) {
		bundle.put(ARTIFACTS,
				spawnedArtifacts.toArray(new String[spawnedArtifacts.size()]));
	}

	public static void restoreFromBundle(Bundle bundle) {
		initArtifacts();

		if (bundle.contains(ARTIFACTS)) {
			Collections.addAll(spawnedArtifacts,
					bundle.getStringArray(ARTIFACTS));
			Category cat = Category.ARTIFACT;

			for (String artifact : spawnedArtifacts)
				for (int i = 0; i < cat.classes.length; i++)
					if (cat.classes[i].getSimpleName().equals(artifact))
						cat.probs[i] = 0;
		}
	}
}
