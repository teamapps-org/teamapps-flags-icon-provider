/*-
 * ========================LICENSE_START=================================
 * TeamApps Flags Icon Provider
 * ---
 * Copyright (C) 2014 - 2019 TeamApps.org
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package org.teamapps.icon.flags;

import org.teamapps.icons.Icon;
import org.teamapps.icons.spi.IconLibrary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@IconLibrary(
		name = "flag",
		encoder = FlagIconEncoder.class,
		decoder = FlagIconDecoder.class,
		loader = FlagIconLoader.class,
		defaultStyleSupplier = FlagIconDefaultStyleSupplier.class
)
public class FlagIcon implements Icon<FlagIcon, Void> {

	private static final Map<String, FlagIcon> iconByName = new HashMap<>();
	private static final Map<String, FlagIcon> iconByCountryCode = new HashMap<>();

	public static final FlagIcon AD_ANDORRA = createInternal("ad.svg", "AD_ANDORRA");;
	public static final FlagIcon AE_UNITED_ARAB_EMIRATES = createInternal("ae.svg", "AE_UNITED_ARAB_EMIRATES");;
	public static final FlagIcon AF_AFGHANISTAN = createInternal("af.svg", "AF_AFGHANISTAN");;
	public static final FlagIcon AG_ANTIGUA_BARBUDA = createInternal("ag.svg", "AG_ANTIGUA_BARBUDA");;
	public static final FlagIcon AI_ANGUILLA = createInternal("ai.svg", "AI_ANGUILLA");;
	public static final FlagIcon AL_ALBANIA = createInternal("al.svg", "AL_ALBANIA");;
	public static final FlagIcon AM_ARMENIA = createInternal("am.svg", "AM_ARMENIA");;
	public static final FlagIcon AO_ANGOLA = createInternal("ao.svg", "AO_ANGOLA");;
	public static final FlagIcon AQ_ANTARCTICA = createInternal("aq.svg", "AQ_ANTARCTICA");;
	public static final FlagIcon AR_ARGENTINA = createInternal("ar.svg", "AR_ARGENTINA");;
	public static final FlagIcon AS_AMERICAN_SAMOA = createInternal("as.svg", "AS_AMERICAN_SAMOA");;
	public static final FlagIcon AT_AUSTRIA = createInternal("at.svg", "AT_AUSTRIA");;
	public static final FlagIcon AU_AUSTRALIA = createInternal("au.svg", "AU_AUSTRALIA");;
	public static final FlagIcon AW_ARUBA = createInternal("aw.svg", "AW_ARUBA");;
	public static final FlagIcon AX_ALAND_ISLANDS = createInternal("ax.svg", "AX_ALAND_ISLANDS");;
	public static final FlagIcon AZ_AZERBAIJAN = createInternal("az.svg", "AZ_AZERBAIJAN");;
	public static final FlagIcon BA_BOSNIA = createInternal("ba.svg", "BA_BOSNIA");;
	public static final FlagIcon BB_BARBADOS = createInternal("bb.svg", "BB_BARBADOS");;
	public static final FlagIcon BD_BANGLADESH = createInternal("bd.svg", "BD_BANGLADESH");;
	public static final FlagIcon BE_BELGIUM = createInternal("be.svg", "BE_BELGIUM");;
	public static final FlagIcon BF_BURKINA_FASO = createInternal("bf.svg", "BF_BURKINA_FASO");;
	public static final FlagIcon BG_BULGARIA = createInternal("bg.svg", "BG_BULGARIA");;
	public static final FlagIcon BH_BAHRAIN = createInternal("bh.svg", "BH_BAHRAIN");;
	public static final FlagIcon BI_BURUNDI = createInternal("bi.svg", "BI_BURUNDI");;
	public static final FlagIcon BJ_BENIN = createInternal("bj.svg", "BJ_BENIN");;
	public static final FlagIcon BL_ST_BARTHELEMY = createInternal("bl.svg", "BL_ST_BARTHELEMY");;
	public static final FlagIcon BM_BERMUDA = createInternal("bm.svg", "BM_BERMUDA");;
	public static final FlagIcon BN_BRUNEI = createInternal("bn.svg", "BN_BRUNEI");;
	public static final FlagIcon BO_BOLIVIA = createInternal("bo.svg", "BO_BOLIVIA");;
	public static final FlagIcon BQ_CARIBBEAN_NETHERLANDS = createInternal("bq.svg", "BQ_CARIBBEAN_NETHERLANDS");;
	public static final FlagIcon BR_BRAZIL = createInternal("br.svg", "BR_BRAZIL");;
	public static final FlagIcon BS_BAHAMAS = createInternal("bs.svg", "BS_BAHAMAS");;
	public static final FlagIcon BT_BHUTAN = createInternal("bt.svg", "BT_BHUTAN");;
	public static final FlagIcon BV_BOUVET_ISLAND = createInternal("bv.svg", "BV_BOUVET_ISLAND");;
	public static final FlagIcon BW_BOTSWANA = createInternal("bw.svg", "BW_BOTSWANA");;
	public static final FlagIcon BY_BELARUS = createInternal("by.svg", "BY_BELARUS");;
	public static final FlagIcon BZ_BELIZE = createInternal("bz.svg", "BZ_BELIZE");;
	public static final FlagIcon CA_CANADA = createInternal("ca.svg", "CA_CANADA");;
	public static final FlagIcon CC_COCOS_ISLANDS = createInternal("cc.svg", "CC_COCOS_ISLANDS");;
	public static final FlagIcon CD_CONGO__KINSHASA = createInternal("cd.svg", "CD_CONGO__KINSHASA");;
	public static final FlagIcon CF_CENTRAL_AFRICAN_REPUBLIC = createInternal("cf.svg", "CF_CENTRAL_AFRICAN_REPUBLIC");;
	public static final FlagIcon CG_CONGO__BRAZZAVILLE = createInternal("cg.svg", "CG_CONGO__BRAZZAVILLE");;
	public static final FlagIcon CH_SWITZERLAND = createInternal("ch.svg", "CH_SWITZERLAND");;
	public static final FlagIcon CI_COTE_D_IVOIRE = createInternal("ci.svg", "CI_COTE_D_IVOIRE");;
	public static final FlagIcon CK_COOK_ISLANDS = createInternal("ck.svg", "CK_COOK_ISLANDS");;
	public static final FlagIcon CL_CHILE = createInternal("cl.svg", "CL_CHILE");;
	public static final FlagIcon CM_CAMEROON = createInternal("cm.svg", "CM_CAMEROON");;
	public static final FlagIcon CN_CHINA = createInternal("cn.svg", "CN_CHINA");;
	public static final FlagIcon CO_COLOMBIA = createInternal("co.svg", "CO_COLOMBIA");;
	public static final FlagIcon CR_COSTA_RICA = createInternal("cr.svg", "CR_COSTA_RICA");;
	public static final FlagIcon CU_CUBA = createInternal("cu.svg", "CU_CUBA");;
	public static final FlagIcon CV_CAPE_VERDE = createInternal("cv.svg", "CV_CAPE_VERDE");;
	public static final FlagIcon CW_CURACAO = createInternal("cw.svg", "CW_CURACAO");;
	public static final FlagIcon CX_CHRISTMAS_ISLAND = createInternal("cx.svg", "CX_CHRISTMAS_ISLAND");;
	public static final FlagIcon CY_CYPRUS = createInternal("cy.svg", "CY_CYPRUS");;
	public static final FlagIcon CZ_CZECHIA = createInternal("cz.svg", "CZ_CZECHIA");;
	public static final FlagIcon DE_GERMANY = createInternal("de.svg", "DE_GERMANY");;
	public static final FlagIcon DJ_DJIBOUTI = createInternal("dj.svg", "DJ_DJIBOUTI");;
	public static final FlagIcon DK_DENMARK = createInternal("dk.svg", "DK_DENMARK");;
	public static final FlagIcon DM_DOMINICA = createInternal("dm.svg", "DM_DOMINICA");;
	public static final FlagIcon DO_DOMINICAN_REPUBLIC = createInternal("do.svg", "DO_DOMINICAN_REPUBLIC");;
	public static final FlagIcon DZ_ALGERIA = createInternal("dz.svg", "DZ_ALGERIA");;
	public static final FlagIcon EC_ECUADOR = createInternal("ec.svg", "EC_ECUADOR");;
	public static final FlagIcon EE_ESTONIA = createInternal("ee.svg", "EE_ESTONIA");;
	public static final FlagIcon EG_EGYPT = createInternal("eg.svg", "EG_EGYPT");;
	public static final FlagIcon EH_WESTERN_SAHARA = createInternal("eh.svg", "EH_WESTERN_SAHARA");;
	public static final FlagIcon ER_ERITREA = createInternal("er.svg", "ER_ERITREA");;
	public static final FlagIcon ES_CT = createInternal("es-ct.svg", "ES_CT");;
	public static final FlagIcon ES_SPAIN = createInternal("es.svg", "ES_SPAIN");;
	public static final FlagIcon ET_ETHIOPIA = createInternal("et.svg", "ET_ETHIOPIA");;
	public static final FlagIcon EU_EUROPEAN_UNION = createInternal("eu.svg", "EU_EUROPEAN_UNION");;
	public static final FlagIcon FI_FINLAND = createInternal("fi.svg", "FI_FINLAND");;
	public static final FlagIcon FJ_FIJI = createInternal("fj.svg", "FJ_FIJI");;
	public static final FlagIcon FK_FALKLAND_ISLANDS = createInternal("fk.svg", "FK_FALKLAND_ISLANDS");;
	public static final FlagIcon FM_MICRONESIA = createInternal("fm.svg", "FM_MICRONESIA");;
	public static final FlagIcon FO_FAROE_ISLANDS = createInternal("fo.svg", "FO_FAROE_ISLANDS");;
	public static final FlagIcon FR_FRANCE = createInternal("fr.svg", "FR_FRANCE");;
	public static final FlagIcon GA_GABON = createInternal("ga.svg", "GA_GABON");;
	public static final FlagIcon GB_ENG = createInternal("gb-eng.svg", "GB_ENG");;
	public static final FlagIcon GB_NIR = createInternal("gb-nir.svg", "GB_NIR");;
	public static final FlagIcon GB_SCT = createInternal("gb-sct.svg", "GB_SCT");;
	public static final FlagIcon GB_WLS = createInternal("gb-wls.svg", "GB_WLS");;
	public static final FlagIcon GB_GREAT_BRITAIN = createInternal("gb.svg", "GB_GREAT_BRITAIN");;
	public static final FlagIcon GD_GRENADA = createInternal("gd.svg", "GD_GRENADA");;
	public static final FlagIcon GE_GEORGIA = createInternal("ge.svg", "GE_GEORGIA");;
	public static final FlagIcon GF_FRENCH_GUIANA = createInternal("gf.svg", "GF_FRENCH_GUIANA");;
	public static final FlagIcon GG_GUERNSEY = createInternal("gg.svg", "GG_GUERNSEY");;
	public static final FlagIcon GH_GHANA = createInternal("gh.svg", "GH_GHANA");;
	public static final FlagIcon GI_GIBRALTAR = createInternal("gi.svg", "GI_GIBRALTAR");;
	public static final FlagIcon GL_GREENLAND = createInternal("gl.svg", "GL_GREENLAND");;
	public static final FlagIcon GM_GAMBIA = createInternal("gm.svg", "GM_GAMBIA");;
	public static final FlagIcon GN_GUINEA = createInternal("gn.svg", "GN_GUINEA");;
	public static final FlagIcon GP_GUADELOUPE = createInternal("gp.svg", "GP_GUADELOUPE");;
	public static final FlagIcon GQ_EQUATORIAL_GUINEA = createInternal("gq.svg", "GQ_EQUATORIAL_GUINEA");;
	public static final FlagIcon GR_GREECE = createInternal("gr.svg", "GR_GREECE");;
	public static final FlagIcon GS_SOUTH_GEORGIA_SOUTH_SANDWICH_ISLANDS = createInternal("gs.svg", "GS_SOUTH_GEORGIA_SOUTH_SANDWICH_ISLANDS");;
	public static final FlagIcon GT_GUATEMALA = createInternal("gt.svg", "GT_GUATEMALA");;
	public static final FlagIcon GU_GUAM = createInternal("gu.svg", "GU_GUAM");;
	public static final FlagIcon GW_GUINEA_BISSAU = createInternal("gw.svg", "GW_GUINEA_BISSAU");;
	public static final FlagIcon GY_GUYANA = createInternal("gy.svg", "GY_GUYANA");;
	public static final FlagIcon HK_HONG_KONG = createInternal("hk.svg", "HK_HONG_KONG");;
	public static final FlagIcon HM_HEARD_MCDONALD_ISLANDS = createInternal("hm.svg", "HM_HEARD_MCDONALD_ISLANDS");;
	public static final FlagIcon HN_HONDURAS = createInternal("hn.svg", "HN_HONDURAS");;
	public static final FlagIcon HR_CROATIA = createInternal("hr.svg", "HR_CROATIA");;
	public static final FlagIcon HT_HAITI = createInternal("ht.svg", "HT_HAITI");;
	public static final FlagIcon HU_HUNGARY = createInternal("hu.svg", "HU_HUNGARY");;
	public static final FlagIcon ID_INDONESIA = createInternal("id.svg", "ID_INDONESIA");;
	public static final FlagIcon IE_IRELAND = createInternal("ie.svg", "IE_IRELAND");;
	public static final FlagIcon IL_ISRAEL = createInternal("il.svg", "IL_ISRAEL");;
	public static final FlagIcon IM_ISLE_OF_MAN = createInternal("im.svg", "IM_ISLE_OF_MAN");;
	public static final FlagIcon IN_INDIA = createInternal("in.svg", "IN_INDIA");;
	public static final FlagIcon IO_BRITISH_INDIAN_OCEAN_TERRITORY = createInternal("io.svg", "IO_BRITISH_INDIAN_OCEAN_TERRITORY");;
	public static final FlagIcon IQ_IRAQ = createInternal("iq.svg", "IQ_IRAQ");;
	public static final FlagIcon IR_IRAN = createInternal("ir.svg", "IR_IRAN");;
	public static final FlagIcon IS_ICELAND = createInternal("is.svg", "IS_ICELAND");;
	public static final FlagIcon IT_ITALY = createInternal("it.svg", "IT_ITALY");;
	public static final FlagIcon JE_JERSEY = createInternal("je.svg", "JE_JERSEY");;
	public static final FlagIcon JM_JAMAICA = createInternal("jm.svg", "JM_JAMAICA");;
	public static final FlagIcon JO_JORDAN = createInternal("jo.svg", "JO_JORDAN");;
	public static final FlagIcon JP_JAPAN = createInternal("jp.svg", "JP_JAPAN");;
	public static final FlagIcon KE_KENYA = createInternal("ke.svg", "KE_KENYA");;
	public static final FlagIcon KG_KYRGYZSTAN = createInternal("kg.svg", "KG_KYRGYZSTAN");;
	public static final FlagIcon KH_CAMBODIA = createInternal("kh.svg", "KH_CAMBODIA");;
	public static final FlagIcon KI_KIRIBATI = createInternal("ki.svg", "KI_KIRIBATI");;
	public static final FlagIcon KM_COMOROS = createInternal("km.svg", "KM_COMOROS");;
	public static final FlagIcon KN_ST_KITTS_NEVIS = createInternal("kn.svg", "KN_ST_KITTS_NEVIS");;
	public static final FlagIcon KP_NORTH_KOREA = createInternal("kp.svg", "KP_NORTH_KOREA");;
	public static final FlagIcon KR_SOUTH_KOREA = createInternal("kr.svg", "KR_SOUTH_KOREA");;
	public static final FlagIcon KW_KUWAIT = createInternal("kw.svg", "KW_KUWAIT");;
	public static final FlagIcon KY_CAYMAN_ISLANDS = createInternal("ky.svg", "KY_CAYMAN_ISLANDS");;
	public static final FlagIcon KZ_KAZAKHSTAN = createInternal("kz.svg", "KZ_KAZAKHSTAN");;
	public static final FlagIcon LA_LAOS = createInternal("la.svg", "LA_LAOS");;
	public static final FlagIcon LB_LEBANON = createInternal("lb.svg", "LB_LEBANON");;
	public static final FlagIcon LC_ST_LUCIA = createInternal("lc.svg", "LC_ST_LUCIA");;
	public static final FlagIcon LI_LIECHTENSTEIN = createInternal("li.svg", "LI_LIECHTENSTEIN");;
	public static final FlagIcon LK_SRI_LANKA = createInternal("lk.svg", "LK_SRI_LANKA");;
	public static final FlagIcon LR_LIBERIA = createInternal("lr.svg", "LR_LIBERIA");;
	public static final FlagIcon LS_LESOTHO = createInternal("ls.svg", "LS_LESOTHO");;
	public static final FlagIcon LT_LITHUANIA = createInternal("lt.svg", "LT_LITHUANIA");;
	public static final FlagIcon LU_LUXEMBOURG = createInternal("lu.svg", "LU_LUXEMBOURG");;
	public static final FlagIcon LV_LATVIA = createInternal("lv.svg", "LV_LATVIA");;
	public static final FlagIcon LY_LIBYA = createInternal("ly.svg", "LY_LIBYA");;
	public static final FlagIcon MA_MOROCCO = createInternal("ma.svg", "MA_MOROCCO");;
	public static final FlagIcon MC_MONACO = createInternal("mc.svg", "MC_MONACO");;
	public static final FlagIcon MD_MOLDOVA = createInternal("md.svg", "MD_MOLDOVA");;
	public static final FlagIcon ME_MONTENEGRO = createInternal("me.svg", "ME_MONTENEGRO");;
	public static final FlagIcon MF_ST_MARTIN = createInternal("mf.svg", "MF_ST_MARTIN");;
	public static final FlagIcon MG_MADAGASCAR = createInternal("mg.svg", "MG_MADAGASCAR");;
	public static final FlagIcon MH_MARSHALL_ISLANDS = createInternal("mh.svg", "MH_MARSHALL_ISLANDS");;
	public static final FlagIcon MK_MACEDONIA = createInternal("mk.svg", "MK_MACEDONIA");;
	public static final FlagIcon ML_MALI = createInternal("ml.svg", "ML_MALI");;
	public static final FlagIcon MM_MYANMAR = createInternal("mm.svg", "MM_MYANMAR");;
	public static final FlagIcon MN_MONGOLIA = createInternal("mn.svg", "MN_MONGOLIA");;
	public static final FlagIcon MO_MACAU = createInternal("mo.svg", "MO_MACAU");;
	public static final FlagIcon MP_NORTHERN_MARIANA_ISLANDS = createInternal("mp.svg", "MP_NORTHERN_MARIANA_ISLANDS");;
	public static final FlagIcon MQ_MARTINIQUE = createInternal("mq.svg", "MQ_MARTINIQUE");;
	public static final FlagIcon MR_MAURITANIA = createInternal("mr.svg", "MR_MAURITANIA");;
	public static final FlagIcon MS_MONTSERRAT = createInternal("ms.svg", "MS_MONTSERRAT");;
	public static final FlagIcon MT_MALTA = createInternal("mt.svg", "MT_MALTA");;
	public static final FlagIcon MU_MAURITIUS = createInternal("mu.svg", "MU_MAURITIUS");;
	public static final FlagIcon MV_MALDIVES = createInternal("mv.svg", "MV_MALDIVES");;
	public static final FlagIcon MW_MALAWI = createInternal("mw.svg", "MW_MALAWI");;
	public static final FlagIcon MX_MEXICO = createInternal("mx.svg", "MX_MEXICO");;
	public static final FlagIcon MY_MALAYSIA = createInternal("my.svg", "MY_MALAYSIA");;
	public static final FlagIcon MZ_MOZAMBIQUE = createInternal("mz.svg", "MZ_MOZAMBIQUE");;
	public static final FlagIcon NA_NAMIBIA = createInternal("na.svg", "NA_NAMIBIA");;
	public static final FlagIcon NC_NEW_CALEDONIA = createInternal("nc.svg", "NC_NEW_CALEDONIA");;
	public static final FlagIcon NE_NIGER = createInternal("ne.svg", "NE_NIGER");;
	public static final FlagIcon NF_NORFOLK_ISLAND = createInternal("nf.svg", "NF_NORFOLK_ISLAND");;
	public static final FlagIcon NG_NIGERIA = createInternal("ng.svg", "NG_NIGERIA");;
	public static final FlagIcon NI_NICARAGUA = createInternal("ni.svg", "NI_NICARAGUA");;
	public static final FlagIcon NL_NETHERLANDS = createInternal("nl.svg", "NL_NETHERLANDS");;
	public static final FlagIcon NO_NORWAY = createInternal("no.svg", "NO_NORWAY");;
	public static final FlagIcon NP_NEPAL = createInternal("np.svg", "NP_NEPAL");;
	public static final FlagIcon NR_NAURU = createInternal("nr.svg", "NR_NAURU");;
	public static final FlagIcon NU_NIUE = createInternal("nu.svg", "NU_NIUE");;
	public static final FlagIcon NZ_NEW_ZEALAND = createInternal("nz.svg", "NZ_NEW_ZEALAND");;
	public static final FlagIcon OM_OMAN = createInternal("om.svg", "OM_OMAN");;
	public static final FlagIcon PA_PANAMA = createInternal("pa.svg", "PA_PANAMA");;
	public static final FlagIcon PE_PERU = createInternal("pe.svg", "PE_PERU");;
	public static final FlagIcon PF_FRENCH_POLYNESIA = createInternal("pf.svg", "PF_FRENCH_POLYNESIA");;
	public static final FlagIcon PG_PAPUA_NEW_GUINEA = createInternal("pg.svg", "PG_PAPUA_NEW_GUINEA");;
	public static final FlagIcon PH_PHILIPPINES = createInternal("ph.svg", "PH_PHILIPPINES");;
	public static final FlagIcon PK_PAKISTAN = createInternal("pk.svg", "PK_PAKISTAN");;
	public static final FlagIcon PL_POLAND = createInternal("pl.svg", "PL_POLAND");;
	public static final FlagIcon PM_ST_PIERRE_MIQUELON = createInternal("pm.svg", "PM_ST_PIERRE_MIQUELON");;
	public static final FlagIcon PN_PITCAIRN_ISLANDS = createInternal("pn.svg", "PN_PITCAIRN_ISLANDS");;
	public static final FlagIcon PR_PUERTO_RICO = createInternal("pr.svg", "PR_PUERTO_RICO");;
	public static final FlagIcon PS_PALESTINE = createInternal("ps.svg", "PS_PALESTINE");;
	public static final FlagIcon PT_PORTUGAL = createInternal("pt.svg", "PT_PORTUGAL");;
	public static final FlagIcon PW_PALAU = createInternal("pw.svg", "PW_PALAU");;
	public static final FlagIcon PY_PARAGUAY = createInternal("py.svg", "PY_PARAGUAY");;
	public static final FlagIcon QA_QATAR = createInternal("qa.svg", "QA_QATAR");;
	public static final FlagIcon RE_REUNION = createInternal("re.svg", "RE_REUNION");;
	public static final FlagIcon RO_ROMANIA = createInternal("ro.svg", "RO_ROMANIA");;
	public static final FlagIcon RS_SERBIA = createInternal("rs.svg", "RS_SERBIA");;
	public static final FlagIcon RU_RUSSIA = createInternal("ru.svg", "RU_RUSSIA");;
	public static final FlagIcon RW_RWANDA = createInternal("rw.svg", "RW_RWANDA");;
	public static final FlagIcon SA_SAUDI_ARABIA = createInternal("sa.svg", "SA_SAUDI_ARABIA");;
	public static final FlagIcon SB_SOLOMON_ISLANDS = createInternal("sb.svg", "SB_SOLOMON_ISLANDS");;
	public static final FlagIcon SC_SEYCHELLES = createInternal("sc.svg", "SC_SEYCHELLES");;
	public static final FlagIcon SD_SUDAN = createInternal("sd.svg", "SD_SUDAN");;
	public static final FlagIcon SE_SWEDEN = createInternal("se.svg", "SE_SWEDEN");;
	public static final FlagIcon SG_SINGAPORE = createInternal("sg.svg", "SG_SINGAPORE");;
	public static final FlagIcon SH_ST_HELENA = createInternal("sh.svg", "SH_ST_HELENA");;
	public static final FlagIcon SI_SLOVENIA = createInternal("si.svg", "SI_SLOVENIA");;
	public static final FlagIcon SJ_SVALBARD_JAN_MAYEN = createInternal("sj.svg", "SJ_SVALBARD_JAN_MAYEN");;
	public static final FlagIcon SK_SLOVAKIA = createInternal("sk.svg", "SK_SLOVAKIA");;
	public static final FlagIcon SL_SIERRA_LEONE = createInternal("sl.svg", "SL_SIERRA_LEONE");;
	public static final FlagIcon SM_SAN_MARINO = createInternal("sm.svg", "SM_SAN_MARINO");;
	public static final FlagIcon SN_SENEGAL = createInternal("sn.svg", "SN_SENEGAL");;
	public static final FlagIcon SO_SOMALIA = createInternal("so.svg", "SO_SOMALIA");;
	public static final FlagIcon SR_SURINAME = createInternal("sr.svg", "SR_SURINAME");;
	public static final FlagIcon SS_SOUTH_SUDAN = createInternal("ss.svg", "SS_SOUTH_SUDAN");;
	public static final FlagIcon ST_SAO_TOME_PRINCIPE = createInternal("st.svg", "ST_SAO_TOME_PRINCIPE");;
	public static final FlagIcon SV_EL_SALVADOR = createInternal("sv.svg", "SV_EL_SALVADOR");;
	public static final FlagIcon SX_SINT_MAARTEN = createInternal("sx.svg", "SX_SINT_MAARTEN");;
	public static final FlagIcon SY_SYRIA = createInternal("sy.svg", "SY_SYRIA");;
	public static final FlagIcon SZ_SWAZILAND = createInternal("sz.svg", "SZ_SWAZILAND");;
	public static final FlagIcon TC_TURKS_CAICOS_ISLANDS = createInternal("tc.svg", "TC_TURKS_CAICOS_ISLANDS");;
	public static final FlagIcon TD_CHAD = createInternal("td.svg", "TD_CHAD");;
	public static final FlagIcon TF_FRENCH_SOUTHERN_TERRITORIES = createInternal("tf.svg", "TF_FRENCH_SOUTHERN_TERRITORIES");;
	public static final FlagIcon TG_TOGO = createInternal("tg.svg", "TG_TOGO");;
	public static final FlagIcon TH_THAILAND = createInternal("th.svg", "TH_THAILAND");;
	public static final FlagIcon TJ_TAJIKISTAN = createInternal("tj.svg", "TJ_TAJIKISTAN");;
	public static final FlagIcon TK_TOKELAU = createInternal("tk.svg", "TK_TOKELAU");;
	public static final FlagIcon TL_TIMOR_LESTE = createInternal("tl.svg", "TL_TIMOR_LESTE");;
	public static final FlagIcon TM_TURKMENISTAN = createInternal("tm.svg", "TM_TURKMENISTAN");;
	public static final FlagIcon TN_TUNISIA = createInternal("tn.svg", "TN_TUNISIA");;
	public static final FlagIcon TO_TONGA = createInternal("to.svg", "TO_TONGA");;
	public static final FlagIcon TR_TURKEY = createInternal("tr.svg", "TR_TURKEY");;
	public static final FlagIcon TT_TRINIDAD_TOBAGO = createInternal("tt.svg", "TT_TRINIDAD_TOBAGO");;
	public static final FlagIcon TV_TUVALU = createInternal("tv.svg", "TV_TUVALU");;
	public static final FlagIcon TW_TAIWAN = createInternal("tw.svg", "TW_TAIWAN");;
	public static final FlagIcon TZ_TANZANIA = createInternal("tz.svg", "TZ_TANZANIA");;
	public static final FlagIcon UA_UKRAINE = createInternal("ua.svg", "UA_UKRAINE");;
	public static final FlagIcon UG_UGANDA = createInternal("ug.svg", "UG_UGANDA");;
	public static final FlagIcon UM_US_OUTLYING_ISLANDS = createInternal("um.svg", "UM_US_OUTLYING_ISLANDS");;
	public static final FlagIcon UN_UNITED_NATIONS = createInternal("un.svg", "UN_UNITED_NATIONS");;
	public static final FlagIcon US_UNITED_STATES = createInternal("us.svg", "US_UNITED_STATES");;
	public static final FlagIcon UY_URUGUAY = createInternal("uy.svg", "UY_URUGUAY");;
	public static final FlagIcon UZ_UZBEKISTAN = createInternal("uz.svg", "UZ_UZBEKISTAN");;
	public static final FlagIcon VA_VATICAN_CITY = createInternal("va.svg", "VA_VATICAN_CITY");;
	public static final FlagIcon VC_ST_VINCENT_GRENADINES = createInternal("vc.svg", "VC_ST_VINCENT_GRENADINES");;
	public static final FlagIcon VE_VENEZUELA = createInternal("ve.svg", "VE_VENEZUELA");;
	public static final FlagIcon VG_BRITISH_VIRGIN_ISLANDS = createInternal("vg.svg", "VG_BRITISH_VIRGIN_ISLANDS");;
	public static final FlagIcon VI_US_VIRGIN_ISLANDS = createInternal("vi.svg", "VI_US_VIRGIN_ISLANDS");;
	public static final FlagIcon VN_VIETNAM = createInternal("vn.svg", "VN_VIETNAM");;
	public static final FlagIcon VU_VANUATU = createInternal("vu.svg", "VU_VANUATU");;
	public static final FlagIcon WF_WALLIS_FUTUNA = createInternal("wf.svg", "WF_WALLIS_FUTUNA");;
	public static final FlagIcon WS_SAMOA = createInternal("ws.svg", "WS_SAMOA");;
	public static final FlagIcon XK_KOSOVO = createInternal("xk.svg", "XK_KOSOVO");;
	public static final FlagIcon YE_YEMEN = createInternal("ye.svg", "YE_YEMEN");;
	public static final FlagIcon YT_MAYOTTE = createInternal("yt.svg", "YT_MAYOTTE");;
	public static final FlagIcon ZA_SOUTH_AFRICA = createInternal("za.svg", "ZA_SOUTH_AFRICA");;
	public static final FlagIcon ZM_ZAMBIA = createInternal("zm.svg", "ZM_ZAMBIA");;
	public static final FlagIcon ZW_ZIMBABWE = createInternal("zw.svg", "ZW_ZIMBABWE");;

	private static FlagIcon createInternal(String iconName, String constantName) {
		FlagIcon icon = new FlagIcon(iconName, constantName);
		iconByName.put(iconName, icon);
		iconByCountryCode.put(icon.getCountryCode(), icon);
		return icon;
	}

	public static FlagIcon getByNameOrNull(String name) {
		return iconByName.get(name);
	}

	public static FlagIcon getByCountryCode(String name) {
		return iconByCountryCode.get(name);
	}

	public static Collection<FlagIcon> values() {
		return iconByCountryCode.values();
	}

	private String iconName;
	private String countryCode;
	private String constantName;

	FlagIcon(String iconName, String constantName) {
		this.iconName = iconName;
		this.countryCode = iconName.substring(0, iconName.lastIndexOf('.'));
		this.constantName = constantName;
	}

	public String getIconName() {
		return iconName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getConstantName() {
		return constantName;
	}

	@Override
	public FlagIcon withStyle(Void unused) {
		return this;
	}

	@Override
	public Void getStyle() {
		return null;
	}
}
