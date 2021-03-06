/*
 * This file is part of aion-lightning <aion-lightning.com>.
 *
 *  aion-lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-lightning.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.model;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum TribeClass {
	PC(true),
	LIGHT_SUR_MOB,
	LIGHT_LICH,
	GENERAL(true),
	GUARD(Race.ELYOS, true),
	DUMMY,
	DUMMY2,
	PC_DARK(true),
	DARK_SUR_MOB,
	DARK_LICH,
	FIELD_OBJECT_ALL,
	GENERAL_DARK(true),
	GUARD_DARK(Race.ASMODIANS, true),
	PC_DRAGON(true),
	GENERAL_DRAGON(true),
	GUARD_DRAGON(Race.DRAGON, true),
	MONSTER(true),
	POLYMORPHPARROT,
	PET,
	PET_DARK,
	AGGRESSIVESINGLEMONSTER,
	AGGRESSIVESUPPORTMONSTER,
	FRILLFAIMAMCOUPLE,
	SPAKY,
	FUNGUS,
	MUTA,
	ORC,
	GOBLIN,
	POLYMORPHFUNGY,
	QUESTGUARD_DARK,
	FUNGY,
	BRAX,
	HIPPOLIZARD,
	FRILLFAIMAMBABY,
	FRILLFAIMAMMOM,
	FETHLOT,
	GARGOYLE,
	MINX,
	ZAIF,
	TOG,
	GUARD_D1NOATTACK,
	ZAIF_ATOG,
	TOG_AZAIF,
	ZAIF_AMINX,
	MINX_HZAIF,
	MERDION,
	GUARDIAN,
	DARU,
	LUPYLLINI,
	MOSBEARBABY,
	MOSBEARFATHER,
	SOULEDSTONE,
	SOULEDSTONE_MINI,
	MINX_HKALNIF,
	KALNIF_AMINX,
	KALNIF_ATOG,
	TOG_AKALNIF,
	FARMER_HKERUBIM_LF1,
	KERUBIM_AFARMER_LF1,
	GUARD_LIGHT_AKERUBIM_LF1(Race.ELYOS),
	D1_HKERUBIM_LF1,
	KERUBIM_AD1_LF1,
	BROWNIE,
	KRALL,
	BROWNIECOWARD,
	BROWNIEGUARD,
	BROWNIEFELLER_HZAIF_LF1,
	ZAIF_ABROWNIEFELLER_LF1,
	KRALLMASTER,
	KRALL_TRAINING,
	KRALLWIZARDCY,
	CYCLOPSBOSS,
	TARGETBASFELT_DF1,
	SPRIGG_HROBBERALDER_DF1,
	ROBBERALDER_ASPRIGG_DF1,
	SPRIGGREFUSE_DF1,
	ARCHERYBASFELT_ATARGETBASFELT_DF1,
	ARCHERYBASFELT_ATARGETBASFELT_LF1,
	ARCHERYBASFELT2_ATARGETBASFELT2_DF1,
	TARGETBASFELT2_DF1,
	ARCHERYBASFELT2_ATARGETBASFELT2_LF1,
	GUARD_FTARGETBASFELT_DF1,
	GUARD_FTARGETBASFELT_LF1,
	LYCAN,
	LYCAN_MAGE,
	LYCAN_PET,
	LYCAN_HUNTER,
	RATMANWORKER,
	LYCANMASTER,
	TOWERMAN,
	LYCAN_AGUARD_DARK_DF1,
	LYCAN_TRAINING,
	GUARD_DARK_ALYCANARATMAN_DF1(Race.ASMODIANS),
	LYCAN_PET_TRAINING,
	LYCAN_SUM,
	LYCANDF2MASTER,
	LYCANDF2SLAVE1,
	LYCANDF2SLAVE2,
	RATMAN,
	SAMM,
	RATMAN_AGUARD_DARK_DF1,
	RATMANDFWORKER,
	UNDEADGRADIATOR_DF1,
	GUARD_LIGHTMA(Race.ELYOS),
	GUARD_DARKMA(Race.ASMODIANS),
	GUARD_DRAGONMA(Race.DRAGON),
	NEUT,
	NEUTQUEEN,
	NEUTBUG,
	AGGRESSIVE_LIGHT,
	AGGRESSIVE_DARK,
	AGGRESSIVE_DRAGON,
	ABDRAGON_AABDARK,
	ABDARK_AABDRAGON,
	OCTASIDEBABY,
	GUARD_DARKAENEMY(Race.ASMODIANS),
	ENEMY_AGUARD_DARK,
	GRIFFO,
	GRIFFON,
	SHELLIZARDMOM,
	SHELLIZARDBABY,
	MANDURITWEAK,
	CHERUBIM2ND,
	LEHPAR,
	LEHPAR_AGUARDDARK,
	LEHPAR_APRETOR,
	GUARDDARK_ALEHPAR(Race.ASMODIANS),
	AGGRESSIVE1_AAGGRESSIVE2,
	AGGRESSIVE2_AAGGRESSIVE1,
	PRETOR_ALEHPAR,
	FIREELBOSS,
	FIREEL1,
	FIREEL2,
	FIREEL3,
	AIRELBOSS,
	AIREL1,
	AIREL2,
	AIREL3,
	ETTIN,
	L_DRGUARD_ADRAGGMOB1,
	DRAGGMOB_ADRGUARD1,
	DARU_HZAIF,
	ZAIF_ADARU,
	MUTA_HOCTASIDE,
	OCTASIDE_AMUTA,
	LIZARDMAN,
	ATAURIC,
	AHELLHOUND,
	APRETOR,
	GHOSTLIGHT,
	GHOSTDARK,
	BMLGUARDIAN,
	BMDGUARDIAN,
	GMASTER,
	GSLAVE,
	ELEMENTAL_FIRE,
	ELEMENTAL_EARTH,
	ELEMENTAL_AIR,
	ELEMENTAL_WATER,
	BAT_FAMILY_ELITE,
	SUCCUBUS_ELITE,
	SAM_ELITE,
	GARGOYLE_ELITE,
	MAIDENGOLEM_ELITE,
	AGGRESSIVE_LIGHT_HSPECTRE,
	SPECTRE_AALIGHTDARK,
	AGGRESSIVE_DARK_HSPECTRE,
	DRAMA_EVE_NONPC_A,
	DRAMA_EVE_NONPC_B,
	DRAMA_KIMEIA_NPC,
	DRAMA_KIMEIA_MOB,
	DRAMA_EVE_NONPC_DARKA,
	DRAMA_EVE_NONPC_DARKB,
	DRAMA_KIMEIA_DARKNPC,
	XIPETO,
	XIPETOBABY,
	TAURIC,
	CRESTLICH,
	NNAGA,
	NLIZARDMAN,
	NLIZARDRAISER,
	NLIZARDPET,
	NLIZARDPRIEST,
	NNAGA_PRIEST,
	NNAGA_ELEMENTALIST,
	NNAGA_PRIESTBOSS,
	XDRAKAN,
	XDRAKAN_ELEMENTALIST,
	XDRAKAN_PRIEST,
	DRAGON,
	NNAGA_SERVANT,
	NNAGA_ELEMENTAL,
	NLIZARDMAN2,
	NNAGA_BOSS_SERVANT,
	SEIREN_MASTER,
	SEIREN_SNAKE,
	SEIREN,
	GENERAL_ADADR,
	F4RAID,
	GENERALDA_ALIDR,
	GENERALDR_ALIDA,
	LIZARDMAN_BOMB,
	BOMB_LIZARDMAN,
	LIZARDMAN_KB,
	DRAKEPURPLE_MASTER,
	DRAKEPURPLE_SLAVE,
	DRAKY_BOMB_MASTER,
	DRAKY_BOMB_EX,
	FIREFUNGY,
	NOFIGHT,
	FIELD_OBJECT_LIGHT(true),
	DRAKANDF3BOSS,
	DRAKANDF3SLAVE,
	CONSIADE,
	CONSIADE_SUM,
	PARENTSMONSTER,
	CHILDMONSTER,
	TEST_LIGHT_ADARK,
	TEST_LIGHT_ADRAGON,
	TEST_LIGHT_AETC,
	TEST_DARK_ALIGHT,
	TEST_DARK_ADRAGON,
	TEST_DARK_AETC,
	TEST_DRAGON_ALIGHT,
	TEST_DRAGON_ADARK,
	TEST_DRAGON_AETC,
	TEST_ETC_ALIGHT,
	TEST_ETC_ADARK,
	TEST_ETC_ADRAGON,
	ABYSSDRAKANGATE,
	DARK_NPC,
	LICH_SOULEDSTONE,
	DARK_MOB,
	LIGHT_NPC,
	LIGHT_MOB,
	LIGHT_DENLABIS,
	FIRETEMPLE_MOB,
	QUESTGUARD_LIGHT,
	BROHUM,
	CALYDON,
	CALYDON_POLYMORPH,
	SWELLFISH,
	TRICON,
	TRICO,
	PROTECTGUARD_LIGHT(Race.ELYOS),
	PROTECTGUARD_DARK(Race.ASMODIANS),
	FIELD_OBJECT_ALL_MONSTER,
	HOLYSERVANT,
	HOLYSERVANT_DEBUFFER,
	USEALL(true),
	HOLYSERVANT_DESPAWN,
	RANMARK,
	AGGRESSIVESUPPORTMONSTER2,
	LASBERG,
	SHULACK,
	AGGRESSIVETOSHULACK2,
	SHULACK_ATTACKED,
	SHULACK_DECK,
	SHULACK_ATTACKING,
	SHULACK_SUPPORT,
	ESCORT,
	AGGRESSIVEESCORT,
	IDCATACOMBS_TAROS,
	XDRAKAN_PET,
	XDRAKAN_SERVANT,
	AGGRESSIVETOSHULACK,
	SHULACK_DECK_KILLER,
	DRAGON_SLAVE,
	SPALLER,
	SPALLERCTRL,
	SHULACK_SLAVE,
	IDLF1_MONSTER,
	AGGRESSIVETOPCPET,
	GENERALDR_ALIDA_SUPPORT,
	GOLEM_SWITCH,
	USEALLNONETOMONSTER,
	FANATIC,
	IDTEMPLE_BUGS,
	IDTEMPLE_STONE,
	IDELIM,
	AGGRESSIVETOIDELIM,
	IDELIM_FRIEND,
	FRIENDLYTOIDELIM,
	IDCATACOMBS_DRAKE,
	IDCATACOMBS_DRAKE_SUM,
	HOSTILE_ALL,
	AGGRESSIVE_ALL,
	F4GUARD_LIGHT(Race.ELYOS),
	F4GUARD_DARK(Race.ASMODIANS),
	F4GUARD_DRAGON(Race.DRAGON),
	DRAMATA,
	DRAMATATIMERA,
	DRAMATATIMERB,
	DRAKANPOLYMORPH,
	DRAKANDOOR,
	GHTIMER,
	DUMMY_DGUARD(Race.ASMODIANS),
	DUMMY2_DGUARD(Race.ASMODIANS),
	CRYSTAL,
	ANTI_CRYSTAL,
	CRYSTAL_NMDD,
	DUMMY_LGUARD(Race.ELYOS),
	DUMMY2_LGUARD(Race.ELYOS),
	HOSTILEONLYMONSTER,
	ATKDRAKAN,
	CRYSTAL_SUM,
	ASIST_D(true),
	NONE,
	NPC(true),
	GUARD_LIGHT(Race.ELYOS),
	FIELD_OBJECT_DARK(true),
	LYCAN_PC,
	KRALL_PC,
	DRAGON_CTRL,
	GENERAL_KRALL,
	GENERAL_DARK_LYCAN,
	WAVE_TREE,
	WAVE_SWARM1,
	WAVE_SWARM2,
	IDELEMENTAL2HEALSUM,
	AGGRESSIVEMONSTER,
	IDYUN_ANCIENT,
	XDRAKAN_IDYUN,//TODO remove in 2.6
	IDRAKSHA_DRAKAN,
	IDRAKSHA_DRAGONTOOTH,
	IDRAKSHA_NORMAL,
	//2.6
	IDYUN_XDRAKAN,
	IDYUN_D1,
	IDYUN_SIEGEWEAPON,
	DECOY,
	DECOY_HUNGER,
	IDYUN_BOMBER,
	IDYUN_ANTIBOMBER,
	PREDATOR,
	PREY;

	private Race guardRace;
	private boolean isBasic;

	private TribeClass() {
	}

	private TribeClass(Race guardRace) {
		this.guardRace = guardRace;
	}
	
	private TribeClass(Race guardRace, boolean isBasic) {
		this.guardRace = guardRace;
		this.isBasic = isBasic;
	}
	
	private TribeClass(boolean isBasic) {
		this.isBasic = isBasic;
	}

	public boolean isGuard() {
		return guardRace != null;
	}
	
	public boolean isBasicClass() {
		return isBasic;
	}
	
	public boolean isLightGuard() {
		return guardRace == Race.ELYOS;
	}
	
	public boolean isDarkGuard() {
		return guardRace == Race.ASMODIANS;
	}
	
	public boolean isDrakanGuard() {
		return guardRace == Race.DRAGON;
	}
}
