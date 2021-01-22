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

	public static final FlagIcon AD_ANDORRA = createInternal("ad.svg");
	public static final FlagIcon AE_UNITED_ARAB_EMIRATES = createInternal("ae.svg");
	public static final FlagIcon AF_AFGHANISTAN = createInternal("af.svg");
	public static final FlagIcon AG_ANTIGUA_BARBUDA = createInternal("ag.svg");
	public static final FlagIcon AI_ANGUILLA = createInternal("ai.svg");
	public static final FlagIcon AL_ALBANIA = createInternal("al.svg");
	public static final FlagIcon AM_ARMENIA = createInternal("am.svg");
	public static final FlagIcon AO_ANGOLA = createInternal("ao.svg");
	public static final FlagIcon AQ_ANTARCTICA = createInternal("aq.svg");
	public static final FlagIcon AR_ARGENTINA = createInternal("ar.svg");
	public static final FlagIcon AS_AMERICAN_SAMOA = createInternal("as.svg");
	public static final FlagIcon AT_AUSTRIA = createInternal("at.svg");
	public static final FlagIcon AU_AUSTRALIA = createInternal("au.svg");
	public static final FlagIcon AW_ARUBA = createInternal("aw.svg");
	public static final FlagIcon AX_ALAND_ISLANDS = createInternal("ax.svg");
	public static final FlagIcon AZ_AZERBAIJAN = createInternal("az.svg");
	public static final FlagIcon BA_BOSNIA = createInternal("ba.svg");
	public static final FlagIcon BB_BARBADOS = createInternal("bb.svg");
	public static final FlagIcon BD_BANGLADESH = createInternal("bd.svg");
	public static final FlagIcon BE_BELGIUM = createInternal("be.svg");
	public static final FlagIcon BF_BURKINA_FASO = createInternal("bf.svg");
	public static final FlagIcon BG_BULGARIA = createInternal("bg.svg");
	public static final FlagIcon BH_BAHRAIN = createInternal("bh.svg");
	public static final FlagIcon BI_BURUNDI = createInternal("bi.svg");
	public static final FlagIcon BJ_BENIN = createInternal("bj.svg");
	public static final FlagIcon BL_ST_BARTHELEMY = createInternal("bl.svg");
	public static final FlagIcon BM_BERMUDA = createInternal("bm.svg");
	public static final FlagIcon BN_BRUNEI = createInternal("bn.svg");
	public static final FlagIcon BO_BOLIVIA = createInternal("bo.svg");
	public static final FlagIcon BQ_CARIBBEAN_NETHERLANDS = createInternal("bq.svg");
	public static final FlagIcon BR_BRAZIL = createInternal("br.svg");
	public static final FlagIcon BS_BAHAMAS = createInternal("bs.svg");
	public static final FlagIcon BT_BHUTAN = createInternal("bt.svg");
	public static final FlagIcon BV_BOUVET_ISLAND = createInternal("bv.svg");
	public static final FlagIcon BW_BOTSWANA = createInternal("bw.svg");
	public static final FlagIcon BY_BELARUS = createInternal("by.svg");
	public static final FlagIcon BZ_BELIZE = createInternal("bz.svg");
	public static final FlagIcon CA_CANADA = createInternal("ca.svg");
	public static final FlagIcon CC_COCOS_ISLANDS = createInternal("cc.svg");
	public static final FlagIcon CD_CONGO__KINSHASA = createInternal("cd.svg");
	public static final FlagIcon CF_CENTRAL_AFRICAN_REPUBLIC = createInternal("cf.svg");
	public static final FlagIcon CG_CONGO__BRAZZAVILLE = createInternal("cg.svg");
	public static final FlagIcon CH_SWITZERLAND = createInternal("ch.svg");
	public static final FlagIcon CI_COTE_D_IVOIRE = createInternal("ci.svg");
	public static final FlagIcon CK_COOK_ISLANDS = createInternal("ck.svg");
	public static final FlagIcon CL_CHILE = createInternal("cl.svg");
	public static final FlagIcon CM_CAMEROON = createInternal("cm.svg");
	public static final FlagIcon CN_CHINA = createInternal("cn.svg");
	public static final FlagIcon CO_COLOMBIA = createInternal("co.svg");
	public static final FlagIcon CR_COSTA_RICA = createInternal("cr.svg");
	public static final FlagIcon CU_CUBA = createInternal("cu.svg");
	public static final FlagIcon CV_CAPE_VERDE = createInternal("cv.svg");
	public static final FlagIcon CW_CURACAO = createInternal("cw.svg");
	public static final FlagIcon CX_CHRISTMAS_ISLAND = createInternal("cx.svg");
	public static final FlagIcon CY_CYPRUS = createInternal("cy.svg");
	public static final FlagIcon CZ_CZECHIA = createInternal("cz.svg");
	public static final FlagIcon DE_GERMANY = createInternal("de.svg");
	public static final FlagIcon DJ_DJIBOUTI = createInternal("dj.svg");
	public static final FlagIcon DK_DENMARK = createInternal("dk.svg");
	public static final FlagIcon DM_DOMINICA = createInternal("dm.svg");
	public static final FlagIcon DO_DOMINICAN_REPUBLIC = createInternal("do.svg");
	public static final FlagIcon DZ_ALGERIA = createInternal("dz.svg");
	public static final FlagIcon EC_ECUADOR = createInternal("ec.svg");
	public static final FlagIcon EE_ESTONIA = createInternal("ee.svg");
	public static final FlagIcon EG_EGYPT = createInternal("eg.svg");
	public static final FlagIcon EH_WESTERN_SAHARA = createInternal("eh.svg");
	public static final FlagIcon ER_ERITREA = createInternal("er.svg");
	public static final FlagIcon ES_CT = createInternal("es-ct.svg");
	public static final FlagIcon ES_SPAIN = createInternal("es.svg");
	public static final FlagIcon ET_ETHIOPIA = createInternal("et.svg");
	public static final FlagIcon EU_EUROPEAN_UNION = createInternal("eu.svg");
	public static final FlagIcon FI_FINLAND = createInternal("fi.svg");
	public static final FlagIcon FJ_FIJI = createInternal("fj.svg");
	public static final FlagIcon FK_FALKLAND_ISLANDS = createInternal("fk.svg");
	public static final FlagIcon FM_MICRONESIA = createInternal("fm.svg");
	public static final FlagIcon FO_FAROE_ISLANDS = createInternal("fo.svg");
	public static final FlagIcon FR_FRANCE = createInternal("fr.svg");
	public static final FlagIcon GA_GABON = createInternal("ga.svg");
	public static final FlagIcon GB_ENG = createInternal("gb-eng.svg");
	public static final FlagIcon GB_NIR = createInternal("gb-nir.svg");
	public static final FlagIcon GB_SCT = createInternal("gb-sct.svg");
	public static final FlagIcon GB_WLS = createInternal("gb-wls.svg");
	public static final FlagIcon GB_GREAT_BRITAIN = createInternal("gb.svg");
	public static final FlagIcon GD_GRENADA = createInternal("gd.svg");
	public static final FlagIcon GE_GEORGIA = createInternal("ge.svg");
	public static final FlagIcon GF_FRENCH_GUIANA = createInternal("gf.svg");
	public static final FlagIcon GG_GUERNSEY = createInternal("gg.svg");
	public static final FlagIcon GH_GHANA = createInternal("gh.svg");
	public static final FlagIcon GI_GIBRALTAR = createInternal("gi.svg");
	public static final FlagIcon GL_GREENLAND = createInternal("gl.svg");
	public static final FlagIcon GM_GAMBIA = createInternal("gm.svg");
	public static final FlagIcon GN_GUINEA = createInternal("gn.svg");
	public static final FlagIcon GP_GUADELOUPE = createInternal("gp.svg");
	public static final FlagIcon GQ_EQUATORIAL_GUINEA = createInternal("gq.svg");
	public static final FlagIcon GR_GREECE = createInternal("gr.svg");
	public static final FlagIcon GS_SOUTH_GEORGIA_SOUTH_SANDWICH_ISLANDS = createInternal("gs.svg");
	public static final FlagIcon GT_GUATEMALA = createInternal("gt.svg");
	public static final FlagIcon GU_GUAM = createInternal("gu.svg");
	public static final FlagIcon GW_GUINEA_BISSAU = createInternal("gw.svg");
	public static final FlagIcon GY_GUYANA = createInternal("gy.svg");
	public static final FlagIcon HK_HONG_KONG = createInternal("hk.svg");
	public static final FlagIcon HM_HEARD_MCDONALD_ISLANDS = createInternal("hm.svg");
	public static final FlagIcon HN_HONDURAS = createInternal("hn.svg");
	public static final FlagIcon HR_CROATIA = createInternal("hr.svg");
	public static final FlagIcon HT_HAITI = createInternal("ht.svg");
	public static final FlagIcon HU_HUNGARY = createInternal("hu.svg");
	public static final FlagIcon ID_INDONESIA = createInternal("id.svg");
	public static final FlagIcon IE_IRELAND = createInternal("ie.svg");
	public static final FlagIcon IL_ISRAEL = createInternal("il.svg");
	public static final FlagIcon IM_ISLE_OF_MAN = createInternal("im.svg");
	public static final FlagIcon IN_INDIA = createInternal("in.svg");
	public static final FlagIcon IO_BRITISH_INDIAN_OCEAN_TERRITORY = createInternal("io.svg");
	public static final FlagIcon IQ_IRAQ = createInternal("iq.svg");
	public static final FlagIcon IR_IRAN = createInternal("ir.svg");
	public static final FlagIcon IS_ICELAND = createInternal("is.svg");
	public static final FlagIcon IT_ITALY = createInternal("it.svg");
	public static final FlagIcon JE_JERSEY = createInternal("je.svg");
	public static final FlagIcon JM_JAMAICA = createInternal("jm.svg");
	public static final FlagIcon JO_JORDAN = createInternal("jo.svg");
	public static final FlagIcon JP_JAPAN = createInternal("jp.svg");
	public static final FlagIcon KE_KENYA = createInternal("ke.svg");
	public static final FlagIcon KG_KYRGYZSTAN = createInternal("kg.svg");
	public static final FlagIcon KH_CAMBODIA = createInternal("kh.svg");
	public static final FlagIcon KI_KIRIBATI = createInternal("ki.svg");
	public static final FlagIcon KM_COMOROS = createInternal("km.svg");
	public static final FlagIcon KN_ST_KITTS_NEVIS = createInternal("kn.svg");
	public static final FlagIcon KP_NORTH_KOREA = createInternal("kp.svg");
	public static final FlagIcon KR_SOUTH_KOREA = createInternal("kr.svg");
	public static final FlagIcon KW_KUWAIT = createInternal("kw.svg");
	public static final FlagIcon KY_CAYMAN_ISLANDS = createInternal("ky.svg");
	public static final FlagIcon KZ_KAZAKHSTAN = createInternal("kz.svg");
	public static final FlagIcon LA_LAOS = createInternal("la.svg");
	public static final FlagIcon LB_LEBANON = createInternal("lb.svg");
	public static final FlagIcon LC_ST_LUCIA = createInternal("lc.svg");
	public static final FlagIcon LI_LIECHTENSTEIN = createInternal("li.svg");
	public static final FlagIcon LK_SRI_LANKA = createInternal("lk.svg");
	public static final FlagIcon LR_LIBERIA = createInternal("lr.svg");
	public static final FlagIcon LS_LESOTHO = createInternal("ls.svg");
	public static final FlagIcon LT_LITHUANIA = createInternal("lt.svg");
	public static final FlagIcon LU_LUXEMBOURG = createInternal("lu.svg");
	public static final FlagIcon LV_LATVIA = createInternal("lv.svg");
	public static final FlagIcon LY_LIBYA = createInternal("ly.svg");
	public static final FlagIcon MA_MOROCCO = createInternal("ma.svg");
	public static final FlagIcon MC_MONACO = createInternal("mc.svg");
	public static final FlagIcon MD_MOLDOVA = createInternal("md.svg");
	public static final FlagIcon ME_MONTENEGRO = createInternal("me.svg");
	public static final FlagIcon MF_ST_MARTIN = createInternal("mf.svg");
	public static final FlagIcon MG_MADAGASCAR = createInternal("mg.svg");
	public static final FlagIcon MH_MARSHALL_ISLANDS = createInternal("mh.svg");
	public static final FlagIcon MK_MACEDONIA = createInternal("mk.svg");
	public static final FlagIcon ML_MALI = createInternal("ml.svg");
	public static final FlagIcon MM_MYANMAR = createInternal("mm.svg");
	public static final FlagIcon MN_MONGOLIA = createInternal("mn.svg");
	public static final FlagIcon MO_MACAU = createInternal("mo.svg");
	public static final FlagIcon MP_NORTHERN_MARIANA_ISLANDS = createInternal("mp.svg");
	public static final FlagIcon MQ_MARTINIQUE = createInternal("mq.svg");
	public static final FlagIcon MR_MAURITANIA = createInternal("mr.svg");
	public static final FlagIcon MS_MONTSERRAT = createInternal("ms.svg");
	public static final FlagIcon MT_MALTA = createInternal("mt.svg");
	public static final FlagIcon MU_MAURITIUS = createInternal("mu.svg");
	public static final FlagIcon MV_MALDIVES = createInternal("mv.svg");
	public static final FlagIcon MW_MALAWI = createInternal("mw.svg");
	public static final FlagIcon MX_MEXICO = createInternal("mx.svg");
	public static final FlagIcon MY_MALAYSIA = createInternal("my.svg");
	public static final FlagIcon MZ_MOZAMBIQUE = createInternal("mz.svg");
	public static final FlagIcon NA_NAMIBIA = createInternal("na.svg");
	public static final FlagIcon NC_NEW_CALEDONIA = createInternal("nc.svg");
	public static final FlagIcon NE_NIGER = createInternal("ne.svg");
	public static final FlagIcon NF_NORFOLK_ISLAND = createInternal("nf.svg");
	public static final FlagIcon NG_NIGERIA = createInternal("ng.svg");
	public static final FlagIcon NI_NICARAGUA = createInternal("ni.svg");
	public static final FlagIcon NL_NETHERLANDS = createInternal("nl.svg");
	public static final FlagIcon NO_NORWAY = createInternal("no.svg");
	public static final FlagIcon NP_NEPAL = createInternal("np.svg");
	public static final FlagIcon NR_NAURU = createInternal("nr.svg");
	public static final FlagIcon NU_NIUE = createInternal("nu.svg");
	public static final FlagIcon NZ_NEW_ZEALAND = createInternal("nz.svg");
	public static final FlagIcon OM_OMAN = createInternal("om.svg");
	public static final FlagIcon PA_PANAMA = createInternal("pa.svg");
	public static final FlagIcon PE_PERU = createInternal("pe.svg");
	public static final FlagIcon PF_FRENCH_POLYNESIA = createInternal("pf.svg");
	public static final FlagIcon PG_PAPUA_NEW_GUINEA = createInternal("pg.svg");
	public static final FlagIcon PH_PHILIPPINES = createInternal("ph.svg");
	public static final FlagIcon PK_PAKISTAN = createInternal("pk.svg");
	public static final FlagIcon PL_POLAND = createInternal("pl.svg");
	public static final FlagIcon PM_ST_PIERRE_MIQUELON = createInternal("pm.svg");
	public static final FlagIcon PN_PITCAIRN_ISLANDS = createInternal("pn.svg");
	public static final FlagIcon PR_PUERTO_RICO = createInternal("pr.svg");
	public static final FlagIcon PS_PALESTINE = createInternal("ps.svg");
	public static final FlagIcon PT_PORTUGAL = createInternal("pt.svg");
	public static final FlagIcon PW_PALAU = createInternal("pw.svg");
	public static final FlagIcon PY_PARAGUAY = createInternal("py.svg");
	public static final FlagIcon QA_QATAR = createInternal("qa.svg");
	public static final FlagIcon RE_REUNION = createInternal("re.svg");
	public static final FlagIcon RO_ROMANIA = createInternal("ro.svg");
	public static final FlagIcon RS_SERBIA = createInternal("rs.svg");
	public static final FlagIcon RU_RUSSIA = createInternal("ru.svg");
	public static final FlagIcon RW_RWANDA = createInternal("rw.svg");
	public static final FlagIcon SA_SAUDI_ARABIA = createInternal("sa.svg");
	public static final FlagIcon SB_SOLOMON_ISLANDS = createInternal("sb.svg");
	public static final FlagIcon SC_SEYCHELLES = createInternal("sc.svg");
	public static final FlagIcon SD_SUDAN = createInternal("sd.svg");
	public static final FlagIcon SE_SWEDEN = createInternal("se.svg");
	public static final FlagIcon SG_SINGAPORE = createInternal("sg.svg");
	public static final FlagIcon SH_ST_HELENA = createInternal("sh.svg");
	public static final FlagIcon SI_SLOVENIA = createInternal("si.svg");
	public static final FlagIcon SJ_SVALBARD_JAN_MAYEN = createInternal("sj.svg");
	public static final FlagIcon SK_SLOVAKIA = createInternal("sk.svg");
	public static final FlagIcon SL_SIERRA_LEONE = createInternal("sl.svg");
	public static final FlagIcon SM_SAN_MARINO = createInternal("sm.svg");
	public static final FlagIcon SN_SENEGAL = createInternal("sn.svg");
	public static final FlagIcon SO_SOMALIA = createInternal("so.svg");
	public static final FlagIcon SR_SURINAME = createInternal("sr.svg");
	public static final FlagIcon SS_SOUTH_SUDAN = createInternal("ss.svg");
	public static final FlagIcon ST_SAO_TOME_PRINCIPE = createInternal("st.svg");
	public static final FlagIcon SV_EL_SALVADOR = createInternal("sv.svg");
	public static final FlagIcon SX_SINT_MAARTEN = createInternal("sx.svg");
	public static final FlagIcon SY_SYRIA = createInternal("sy.svg");
	public static final FlagIcon SZ_SWAZILAND = createInternal("sz.svg");
	public static final FlagIcon TC_TURKS_CAICOS_ISLANDS = createInternal("tc.svg");
	public static final FlagIcon TD_CHAD = createInternal("td.svg");
	public static final FlagIcon TF_FRENCH_SOUTHERN_TERRITORIES = createInternal("tf.svg");
	public static final FlagIcon TG_TOGO = createInternal("tg.svg");
	public static final FlagIcon TH_THAILAND = createInternal("th.svg");
	public static final FlagIcon TJ_TAJIKISTAN = createInternal("tj.svg");
	public static final FlagIcon TK_TOKELAU = createInternal("tk.svg");
	public static final FlagIcon TL_TIMOR_LESTE = createInternal("tl.svg");
	public static final FlagIcon TM_TURKMENISTAN = createInternal("tm.svg");
	public static final FlagIcon TN_TUNISIA = createInternal("tn.svg");
	public static final FlagIcon TO_TONGA = createInternal("to.svg");
	public static final FlagIcon TR_TURKEY = createInternal("tr.svg");
	public static final FlagIcon TT_TRINIDAD_TOBAGO = createInternal("tt.svg");
	public static final FlagIcon TV_TUVALU = createInternal("tv.svg");
	public static final FlagIcon TW_TAIWAN = createInternal("tw.svg");
	public static final FlagIcon TZ_TANZANIA = createInternal("tz.svg");
	public static final FlagIcon UA_UKRAINE = createInternal("ua.svg");
	public static final FlagIcon UG_UGANDA = createInternal("ug.svg");
	public static final FlagIcon UM_US_OUTLYING_ISLANDS = createInternal("um.svg");
	public static final FlagIcon UN_UNITED_NATIONS = createInternal("un.svg");
	public static final FlagIcon US_UNITED_STATES = createInternal("us.svg");
	public static final FlagIcon UY_URUGUAY = createInternal("uy.svg");
	public static final FlagIcon UZ_UZBEKISTAN = createInternal("uz.svg");
	public static final FlagIcon VA_VATICAN_CITY = createInternal("va.svg");
	public static final FlagIcon VC_ST_VINCENT_GRENADINES = createInternal("vc.svg");
	public static final FlagIcon VE_VENEZUELA = createInternal("ve.svg");
	public static final FlagIcon VG_BRITISH_VIRGIN_ISLANDS = createInternal("vg.svg");
	public static final FlagIcon VI_US_VIRGIN_ISLANDS = createInternal("vi.svg");
	public static final FlagIcon VN_VIETNAM = createInternal("vn.svg");
	public static final FlagIcon VU_VANUATU = createInternal("vu.svg");
	public static final FlagIcon WF_WALLIS_FUTUNA = createInternal("wf.svg");
	public static final FlagIcon WS_SAMOA = createInternal("ws.svg");
	public static final FlagIcon XK_KOSOVO = createInternal("xk.svg");
	public static final FlagIcon YE_YEMEN = createInternal("ye.svg");
	public static final FlagIcon YT_MAYOTTE = createInternal("yt.svg");
	public static final FlagIcon ZA_SOUTH_AFRICA = createInternal("za.svg");
	public static final FlagIcon ZM_ZAMBIA = createInternal("zm.svg");
	public static final FlagIcon ZW_ZIMBABWE = createInternal("zw.svg");

	private static FlagIcon createInternal(String iconName) {
		FlagIcon icon = new FlagIcon(iconName);
		iconByName.put(iconName, icon);
		String countryCode = icon.iconName.substring(0, icon.iconName.lastIndexOf('.'));
		iconByCountryCode.put(countryCode, icon);
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

	FlagIcon(String iconName) {
		this.iconName = iconName;
	}

	public String getIconName() {
		return iconName;
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
