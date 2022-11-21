/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/toll_passes.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * List of toll passes around the world that we support.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.TollPass}
 */
public enum TollPass implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used. If this value is used, then the request fails.
   * </pre>
   *
   * <code>TOLL_PASS_UNSPECIFIED = 0;</code>
   */
  TOLL_PASS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Sydney toll pass. See additional details at https://www.myetoll.com.au.
   * </pre>
   *
   * <code>AU_ETOLL_TAG = 82;</code>
   */
  AU_ETOLL_TAG(82),
  /**
   *
   *
   * <pre>
   * Sydney toll pass. See additional details at https://www.tollpay.com.au.
   * </pre>
   *
   * <code>AU_EWAY_TAG = 83;</code>
   */
  AU_EWAY_TAG(83),
  /**
   *
   *
   * <pre>
   * Australia-wide toll pass.
   * See additional details at https://www.linkt.com.au/.
   * </pre>
   *
   * <code>AU_LINKT = 2;</code>
   */
  AU_LINKT(2),
  /**
   *
   *
   * <pre>
   * Argentina toll pass. See additional details at https://telepase.com.ar
   * </pre>
   *
   * <code>AR_TELEPASE = 3;</code>
   */
  AR_TELEPASE(3),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://www.autoexpreso.com
   * </pre>
   *
   * <code>BR_AUTO_EXPRESO = 81;</code>
   */
  BR_AUTO_EXPRESO(81),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://conectcar.com.
   * </pre>
   *
   * <code>BR_CONECTCAR = 7;</code>
   */
  BR_CONECTCAR(7),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://movemais.com.
   * </pre>
   *
   * <code>BR_MOVE_MAIS = 8;</code>
   */
  BR_MOVE_MAIS(8),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://pasorapido.gob.do/
   * </pre>
   *
   * <code>BR_PASSA_RAPIDO = 88;</code>
   */
  BR_PASSA_RAPIDO(88),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://www.semparar.com.br.
   * </pre>
   *
   * <code>BR_SEM_PARAR = 9;</code>
   */
  BR_SEM_PARAR(9),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://taggy.com.br.
   * </pre>
   *
   * <code>BR_TAGGY = 10;</code>
   */
  BR_TAGGY(10),
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at
   * https://veloe.com.br/site/onde-usar.
   * </pre>
   *
   * <code>BR_VELOE = 11;</code>
   */
  BR_VELOE(11),
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_AKWASASNE_SEAWAY_CORPORATE_CARD = 84;</code>
   */
  CA_US_AKWASASNE_SEAWAY_CORPORATE_CARD(84),
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_AKWASASNE_SEAWAY_TRANSIT_CARD = 85;</code>
   */
  CA_US_AKWASASNE_SEAWAY_TRANSIT_CARD(85),
  /**
   *
   *
   * <pre>
   * Ontario, Canada to Michigan, United States border crossing.
   * </pre>
   *
   * <code>CA_US_BLUE_WATER_EDGE_PASS = 18;</code>
   */
  CA_US_BLUE_WATER_EDGE_PASS(18),
  /**
   *
   *
   * <pre>
   * Ontario, Canada to Michigan, United States border crossing.
   * </pre>
   *
   * <code>CA_US_CONNEXION = 19;</code>
   */
  CA_US_CONNEXION(19),
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_NEXUS_CARD = 20;</code>
   */
  CA_US_NEXUS_CARD(20),
  /**
   *
   *
   * <pre>
   * Indonesia.
   * E-card provided by multiple banks used to pay for tolls. All e-cards
   * via banks are charged the same so only one enum value is needed. E.g.
   * - Bank Mandiri https://www.bankmandiri.co.id/e-money
   * - BCA https://www.bca.co.id/flazz
   * - BNI https://www.bni.co.id/id-id/ebanking/tapcash
   * </pre>
   *
   * <code>ID_E_TOLL = 16;</code>
   */
  ID_E_TOLL(16),
  /**
   *
   *
   * <pre>
   * India.
   * </pre>
   *
   * <code>IN_FASTAG = 78;</code>
   */
  IN_FASTAG(78),
  /**
   *
   *
   * <pre>
   * India, HP state plate exemption.
   * </pre>
   *
   * <code>IN_LOCAL_HP_PLATE_EXEMPT = 79;</code>
   */
  IN_LOCAL_HP_PLATE_EXEMPT(79),
  /**
   *
   *
   * <pre>
   * Mexico toll pass.
   * https://iave.capufe.gob.mx/#/
   * </pre>
   *
   * <code>MX_IAVE = 90;</code>
   */
  MX_IAVE(90),
  /**
   *
   *
   * <pre>
   * Mexico
   * https://www.pase.com.mx
   * </pre>
   *
   * <code>MX_PASE = 91;</code>
   */
  MX_PASE(91),
  /**
   *
   *
   * <pre>
   * Mexico
   *  https://operadoravial.com/quick-pass/
   * </pre>
   *
   * <code>MX_QUICKPASS = 93;</code>
   */
  MX_QUICKPASS(93),
  /**
   *
   *
   * <pre>
   * http://appsh.chihuahua.gob.mx/transparencia/?doc=/ingresos/TelepeajeFormato4.pdf
   * </pre>
   *
   * <code>MX_SISTEMA_TELEPEAJE_CHIHUAHUA = 89;</code>
   */
  MX_SISTEMA_TELEPEAJE_CHIHUAHUA(89),
  /**
   *
   *
   * <pre>
   * Mexico
   * </pre>
   *
   * <code>MX_TAG_IAVE = 12;</code>
   */
  MX_TAG_IAVE(12),
  /**
   *
   *
   * <pre>
   * Mexico toll pass company. One of many operating in Mexico City. See
   * additional details at https://www.televia.com.mx.
   * </pre>
   *
   * <code>MX_TAG_TELEVIA = 13;</code>
   */
  MX_TAG_TELEVIA(13),
  /**
   *
   *
   * <pre>
   * Mexico toll pass company. One of many operating in Mexico City.
   * https://www.televia.com.mx
   * </pre>
   *
   * <code>MX_TELEVIA = 92;</code>
   */
  MX_TELEVIA(92),
  /**
   *
   *
   * <pre>
   * Mexico toll pass. See additional details at
   * https://www.viapass.com.mx/viapass/web_home.aspx.
   * </pre>
   *
   * <code>MX_VIAPASS = 14;</code>
   */
  MX_VIAPASS(14),
  /**
   *
   *
   * <pre>
   * AL, USA.
   * </pre>
   *
   * <code>US_AL_FREEDOM_PASS = 21;</code>
   */
  US_AL_FREEDOM_PASS(21),
  /**
   *
   *
   * <pre>
   * AK, USA.
   * </pre>
   *
   * <code>US_AK_ANTON_ANDERSON_TUNNEL_BOOK_OF_10_TICKETS = 22;</code>
   */
  US_AK_ANTON_ANDERSON_TUNNEL_BOOK_OF_10_TICKETS(22),
  /**
   *
   *
   * <pre>
   * CA, USA.
   * </pre>
   *
   * <code>US_CA_FASTRAK = 4;</code>
   */
  US_CA_FASTRAK(4),
  /**
   *
   *
   * <pre>
   * Indicates driver has any FasTrak pass in addition to the DMV issued Clean
   * Air Vehicle (CAV) sticker.
   * https://www.bayareafastrak.org/en/guide/doINeedFlex.shtml
   * </pre>
   *
   * <code>US_CA_FASTRAK_CAV_STICKER = 86;</code>
   */
  US_CA_FASTRAK_CAV_STICKER(86),
  /**
   *
   *
   * <pre>
   * CO, USA.
   * </pre>
   *
   * <code>US_CO_EXPRESSTOLL = 23;</code>
   */
  US_CO_EXPRESSTOLL(23),
  /**
   *
   *
   * <pre>
   * CO, USA.
   * </pre>
   *
   * <code>US_CO_GO_PASS = 24;</code>
   */
  US_CO_GO_PASS(24),
  /**
   *
   *
   * <pre>
   * DE, USA.
   * </pre>
   *
   * <code>US_DE_EZPASSDE = 25;</code>
   */
  US_DE_EZPASSDE(25),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_BOB_SIKES_TOLL_BRIDGE_PASS = 65;</code>
   */
  US_FL_BOB_SIKES_TOLL_BRIDGE_PASS(65),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_DUNES_COMMUNITY_DEVELOPMENT_DISTRICT_EXPRESSCARD = 66;</code>
   */
  US_FL_DUNES_COMMUNITY_DEVELOPMENT_DISTRICT_EXPRESSCARD(66),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_EPASS = 67;</code>
   */
  US_FL_EPASS(67),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_GIBA_TOLL_PASS = 68;</code>
   */
  US_FL_GIBA_TOLL_PASS(68),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_LEEWAY = 69;</code>
   */
  US_FL_LEEWAY(69),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_SUNPASS = 70;</code>
   */
  US_FL_SUNPASS(70),
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_SUNPASS_PRO = 71;</code>
   */
  US_FL_SUNPASS_PRO(71),
  /**
   *
   *
   * <pre>
   * IL, USA.
   * </pre>
   *
   * <code>US_IL_EZPASSIL = 73;</code>
   */
  US_IL_EZPASSIL(73),
  /**
   *
   *
   * <pre>
   * IL, USA.
   * </pre>
   *
   * <code>US_IL_IPASS = 72;</code>
   */
  US_IL_IPASS(72),
  /**
   *
   *
   * <pre>
   * IN, USA.
   * </pre>
   *
   * <code>US_IN_EZPASSIN = 26;</code>
   */
  US_IN_EZPASSIN(26),
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_BESTPASS_HORIZON = 27;</code>
   */
  US_KS_BESTPASS_HORIZON(27),
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_KTAG = 28;</code>
   */
  US_KS_KTAG(28),
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_NATIONALPASS = 29;</code>
   */
  US_KS_NATIONALPASS(29),
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_PREPASS_ELITEPASS = 30;</code>
   */
  US_KS_PREPASS_ELITEPASS(30),
  /**
   *
   *
   * <pre>
   * KY, USA.
   * </pre>
   *
   * <code>US_KY_RIVERLINK = 31;</code>
   */
  US_KY_RIVERLINK(31),
  /**
   *
   *
   * <pre>
   * LA, USA.
   * </pre>
   *
   * <code>US_LA_GEAUXPASS = 32;</code>
   */
  US_LA_GEAUXPASS(32),
  /**
   *
   *
   * <pre>
   * LA, USA.
   * </pre>
   *
   * <code>US_LA_TOLL_TAG = 33;</code>
   */
  US_LA_TOLL_TAG(33),
  /**
   *
   *
   * <pre>
   * MA, USA.
   * </pre>
   *
   * <code>US_MA_EZPASSMA = 6;</code>
   */
  US_MA_EZPASSMA(6),
  /**
   *
   *
   * <pre>
   * MD, USA.
   * </pre>
   *
   * <code>US_MD_EZPASSMD = 34;</code>
   */
  US_MD_EZPASSMD(34),
  /**
   *
   *
   * <pre>
   * ME, USA.
   * </pre>
   *
   * <code>US_ME_EZPASSME = 35;</code>
   */
  US_ME_EZPASSME(35),
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_AMBASSADOR_BRIDGE_PREMIER_COMMUTER_CARD = 36;</code>
   */
  US_MI_AMBASSADOR_BRIDGE_PREMIER_COMMUTER_CARD(36),
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_GROSSE_ILE_TOLL_BRIDGE_PASS_TAG = 37;</code>
   */
  US_MI_GROSSE_ILE_TOLL_BRIDGE_PASS_TAG(37),
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_IQ_PROX_CARD = 38;</code>
   */
  US_MI_IQ_PROX_CARD(38),
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_MACKINAC_BRIDGE_MAC_PASS = 39;</code>
   */
  US_MI_MACKINAC_BRIDGE_MAC_PASS(39),
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_NEXPRESS_TOLL = 40;</code>
   */
  US_MI_NEXPRESS_TOLL(40),
  /**
   *
   *
   * <pre>
   * MN, USA.
   * </pre>
   *
   * <code>US_MN_EZPASSMN = 41;</code>
   */
  US_MN_EZPASSMN(41),
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_EZPASSNC = 42;</code>
   */
  US_NC_EZPASSNC(42),
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_PEACH_PASS = 87;</code>
   */
  US_NC_PEACH_PASS(87),
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_QUICK_PASS = 43;</code>
   */
  US_NC_QUICK_PASS(43),
  /**
   *
   *
   * <pre>
   * NH, USA.
   * </pre>
   *
   * <code>US_NH_EZPASSNH = 80;</code>
   */
  US_NH_EZPASSNH(80),
  /**
   *
   *
   * <pre>
   * NJ, USA.
   * </pre>
   *
   * <code>US_NJ_DOWNBEACH_EXPRESS_PASS = 75;</code>
   */
  US_NJ_DOWNBEACH_EXPRESS_PASS(75),
  /**
   *
   *
   * <pre>
   * NJ, USA.
   * </pre>
   *
   * <code>US_NJ_EZPASSNJ = 74;</code>
   */
  US_NJ_EZPASSNJ(74),
  /**
   *
   *
   * <pre>
   * NY, USA.
   * </pre>
   *
   * <code>US_NY_EXPRESSPASS = 76;</code>
   */
  US_NY_EXPRESSPASS(76),
  /**
   *
   *
   * <pre>
   * NY, USA.
   * </pre>
   *
   * <code>US_NY_EZPASSNY = 77;</code>
   */
  US_NY_EZPASSNY(77),
  /**
   *
   *
   * <pre>
   * OH, USA.
   * </pre>
   *
   * <code>US_OH_EZPASSOH = 44;</code>
   */
  US_OH_EZPASSOH(44),
  /**
   *
   *
   * <pre>
   * PA, USA.
   * </pre>
   *
   * <code>US_PA_EZPASSPA = 45;</code>
   */
  US_PA_EZPASSPA(45),
  /**
   *
   *
   * <pre>
   * RI, USA.
   * </pre>
   *
   * <code>US_RI_EZPASSRI = 46;</code>
   */
  US_RI_EZPASSRI(46),
  /**
   *
   *
   * <pre>
   * SC, USA.
   * </pre>
   *
   * <code>US_SC_PALPASS = 47;</code>
   */
  US_SC_PALPASS(47),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_BANCPASS = 48;</code>
   */
  US_TX_BANCPASS(48),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_DEL_RIO_PASS = 49;</code>
   */
  US_TX_DEL_RIO_PASS(49),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EFAST_PASS = 50;</code>
   */
  US_TX_EFAST_PASS(50),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EAGLE_PASS_EXPRESS_CARD = 51;</code>
   */
  US_TX_EAGLE_PASS_EXPRESS_CARD(51),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EPTOLL = 52;</code>
   */
  US_TX_EPTOLL(52),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EZ_CROSS = 53;</code>
   */
  US_TX_EZ_CROSS(53),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EZTAG = 54;</code>
   */
  US_TX_EZTAG(54),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_LAREDO_TRADE_TAG = 55;</code>
   */
  US_TX_LAREDO_TRADE_TAG(55),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_PLUSPASS = 56;</code>
   */
  US_TX_PLUSPASS(56),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_TOLLTAG = 57;</code>
   */
  US_TX_TOLLTAG(57),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_TXTAG = 58;</code>
   */
  US_TX_TXTAG(58),
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_XPRESS_CARD = 59;</code>
   */
  US_TX_XPRESS_CARD(59),
  /**
   *
   *
   * <pre>
   * UT, USA.
   * </pre>
   *
   * <code>US_UT_ADAMS_AVE_PARKWAY_EXPRESSCARD = 60;</code>
   */
  US_UT_ADAMS_AVE_PARKWAY_EXPRESSCARD(60),
  /**
   *
   *
   * <pre>
   * VA, USA.
   * </pre>
   *
   * <code>US_VA_EZPASSVA = 61;</code>
   */
  US_VA_EZPASSVA(61),
  /**
   *
   *
   * <pre>
   * WA, USA.
   * </pre>
   *
   * <code>US_WA_BREEZEBY = 17;</code>
   */
  US_WA_BREEZEBY(17),
  /**
   *
   *
   * <pre>
   * WA, USA.
   * </pre>
   *
   * <code>US_WA_GOOD_TO_GO = 1;</code>
   */
  US_WA_GOOD_TO_GO(1),
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_EZPASSWV = 62;</code>
   */
  US_WV_EZPASSWV(62),
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_MEMORIAL_BRIDGE_TICKETS = 63;</code>
   */
  US_WV_MEMORIAL_BRIDGE_TICKETS(63),
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_NEWELL_TOLL_BRIDGE_TICKET = 64;</code>
   */
  US_WV_NEWELL_TOLL_BRIDGE_TICKET(64),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used. If this value is used, then the request fails.
   * </pre>
   *
   * <code>TOLL_PASS_UNSPECIFIED = 0;</code>
   */
  public static final int TOLL_PASS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Sydney toll pass. See additional details at https://www.myetoll.com.au.
   * </pre>
   *
   * <code>AU_ETOLL_TAG = 82;</code>
   */
  public static final int AU_ETOLL_TAG_VALUE = 82;
  /**
   *
   *
   * <pre>
   * Sydney toll pass. See additional details at https://www.tollpay.com.au.
   * </pre>
   *
   * <code>AU_EWAY_TAG = 83;</code>
   */
  public static final int AU_EWAY_TAG_VALUE = 83;
  /**
   *
   *
   * <pre>
   * Australia-wide toll pass.
   * See additional details at https://www.linkt.com.au/.
   * </pre>
   *
   * <code>AU_LINKT = 2;</code>
   */
  public static final int AU_LINKT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Argentina toll pass. See additional details at https://telepase.com.ar
   * </pre>
   *
   * <code>AR_TELEPASE = 3;</code>
   */
  public static final int AR_TELEPASE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://www.autoexpreso.com
   * </pre>
   *
   * <code>BR_AUTO_EXPRESO = 81;</code>
   */
  public static final int BR_AUTO_EXPRESO_VALUE = 81;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://conectcar.com.
   * </pre>
   *
   * <code>BR_CONECTCAR = 7;</code>
   */
  public static final int BR_CONECTCAR_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://movemais.com.
   * </pre>
   *
   * <code>BR_MOVE_MAIS = 8;</code>
   */
  public static final int BR_MOVE_MAIS_VALUE = 8;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://pasorapido.gob.do/
   * </pre>
   *
   * <code>BR_PASSA_RAPIDO = 88;</code>
   */
  public static final int BR_PASSA_RAPIDO_VALUE = 88;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://www.semparar.com.br.
   * </pre>
   *
   * <code>BR_SEM_PARAR = 9;</code>
   */
  public static final int BR_SEM_PARAR_VALUE = 9;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at https://taggy.com.br.
   * </pre>
   *
   * <code>BR_TAGGY = 10;</code>
   */
  public static final int BR_TAGGY_VALUE = 10;
  /**
   *
   *
   * <pre>
   * Brazil toll pass. See additional details at
   * https://veloe.com.br/site/onde-usar.
   * </pre>
   *
   * <code>BR_VELOE = 11;</code>
   */
  public static final int BR_VELOE_VALUE = 11;
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_AKWASASNE_SEAWAY_CORPORATE_CARD = 84;</code>
   */
  public static final int CA_US_AKWASASNE_SEAWAY_CORPORATE_CARD_VALUE = 84;
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_AKWASASNE_SEAWAY_TRANSIT_CARD = 85;</code>
   */
  public static final int CA_US_AKWASASNE_SEAWAY_TRANSIT_CARD_VALUE = 85;
  /**
   *
   *
   * <pre>
   * Ontario, Canada to Michigan, United States border crossing.
   * </pre>
   *
   * <code>CA_US_BLUE_WATER_EDGE_PASS = 18;</code>
   */
  public static final int CA_US_BLUE_WATER_EDGE_PASS_VALUE = 18;
  /**
   *
   *
   * <pre>
   * Ontario, Canada to Michigan, United States border crossing.
   * </pre>
   *
   * <code>CA_US_CONNEXION = 19;</code>
   */
  public static final int CA_US_CONNEXION_VALUE = 19;
  /**
   *
   *
   * <pre>
   * Canada to United States border crossing.
   * </pre>
   *
   * <code>CA_US_NEXUS_CARD = 20;</code>
   */
  public static final int CA_US_NEXUS_CARD_VALUE = 20;
  /**
   *
   *
   * <pre>
   * Indonesia.
   * E-card provided by multiple banks used to pay for tolls. All e-cards
   * via banks are charged the same so only one enum value is needed. E.g.
   * - Bank Mandiri https://www.bankmandiri.co.id/e-money
   * - BCA https://www.bca.co.id/flazz
   * - BNI https://www.bni.co.id/id-id/ebanking/tapcash
   * </pre>
   *
   * <code>ID_E_TOLL = 16;</code>
   */
  public static final int ID_E_TOLL_VALUE = 16;
  /**
   *
   *
   * <pre>
   * India.
   * </pre>
   *
   * <code>IN_FASTAG = 78;</code>
   */
  public static final int IN_FASTAG_VALUE = 78;
  /**
   *
   *
   * <pre>
   * India, HP state plate exemption.
   * </pre>
   *
   * <code>IN_LOCAL_HP_PLATE_EXEMPT = 79;</code>
   */
  public static final int IN_LOCAL_HP_PLATE_EXEMPT_VALUE = 79;
  /**
   *
   *
   * <pre>
   * Mexico toll pass.
   * https://iave.capufe.gob.mx/#/
   * </pre>
   *
   * <code>MX_IAVE = 90;</code>
   */
  public static final int MX_IAVE_VALUE = 90;
  /**
   *
   *
   * <pre>
   * Mexico
   * https://www.pase.com.mx
   * </pre>
   *
   * <code>MX_PASE = 91;</code>
   */
  public static final int MX_PASE_VALUE = 91;
  /**
   *
   *
   * <pre>
   * Mexico
   *  https://operadoravial.com/quick-pass/
   * </pre>
   *
   * <code>MX_QUICKPASS = 93;</code>
   */
  public static final int MX_QUICKPASS_VALUE = 93;
  /**
   *
   *
   * <pre>
   * http://appsh.chihuahua.gob.mx/transparencia/?doc=/ingresos/TelepeajeFormato4.pdf
   * </pre>
   *
   * <code>MX_SISTEMA_TELEPEAJE_CHIHUAHUA = 89;</code>
   */
  public static final int MX_SISTEMA_TELEPEAJE_CHIHUAHUA_VALUE = 89;
  /**
   *
   *
   * <pre>
   * Mexico
   * </pre>
   *
   * <code>MX_TAG_IAVE = 12;</code>
   */
  public static final int MX_TAG_IAVE_VALUE = 12;
  /**
   *
   *
   * <pre>
   * Mexico toll pass company. One of many operating in Mexico City. See
   * additional details at https://www.televia.com.mx.
   * </pre>
   *
   * <code>MX_TAG_TELEVIA = 13;</code>
   */
  public static final int MX_TAG_TELEVIA_VALUE = 13;
  /**
   *
   *
   * <pre>
   * Mexico toll pass company. One of many operating in Mexico City.
   * https://www.televia.com.mx
   * </pre>
   *
   * <code>MX_TELEVIA = 92;</code>
   */
  public static final int MX_TELEVIA_VALUE = 92;
  /**
   *
   *
   * <pre>
   * Mexico toll pass. See additional details at
   * https://www.viapass.com.mx/viapass/web_home.aspx.
   * </pre>
   *
   * <code>MX_VIAPASS = 14;</code>
   */
  public static final int MX_VIAPASS_VALUE = 14;
  /**
   *
   *
   * <pre>
   * AL, USA.
   * </pre>
   *
   * <code>US_AL_FREEDOM_PASS = 21;</code>
   */
  public static final int US_AL_FREEDOM_PASS_VALUE = 21;
  /**
   *
   *
   * <pre>
   * AK, USA.
   * </pre>
   *
   * <code>US_AK_ANTON_ANDERSON_TUNNEL_BOOK_OF_10_TICKETS = 22;</code>
   */
  public static final int US_AK_ANTON_ANDERSON_TUNNEL_BOOK_OF_10_TICKETS_VALUE = 22;
  /**
   *
   *
   * <pre>
   * CA, USA.
   * </pre>
   *
   * <code>US_CA_FASTRAK = 4;</code>
   */
  public static final int US_CA_FASTRAK_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Indicates driver has any FasTrak pass in addition to the DMV issued Clean
   * Air Vehicle (CAV) sticker.
   * https://www.bayareafastrak.org/en/guide/doINeedFlex.shtml
   * </pre>
   *
   * <code>US_CA_FASTRAK_CAV_STICKER = 86;</code>
   */
  public static final int US_CA_FASTRAK_CAV_STICKER_VALUE = 86;
  /**
   *
   *
   * <pre>
   * CO, USA.
   * </pre>
   *
   * <code>US_CO_EXPRESSTOLL = 23;</code>
   */
  public static final int US_CO_EXPRESSTOLL_VALUE = 23;
  /**
   *
   *
   * <pre>
   * CO, USA.
   * </pre>
   *
   * <code>US_CO_GO_PASS = 24;</code>
   */
  public static final int US_CO_GO_PASS_VALUE = 24;
  /**
   *
   *
   * <pre>
   * DE, USA.
   * </pre>
   *
   * <code>US_DE_EZPASSDE = 25;</code>
   */
  public static final int US_DE_EZPASSDE_VALUE = 25;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_BOB_SIKES_TOLL_BRIDGE_PASS = 65;</code>
   */
  public static final int US_FL_BOB_SIKES_TOLL_BRIDGE_PASS_VALUE = 65;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_DUNES_COMMUNITY_DEVELOPMENT_DISTRICT_EXPRESSCARD = 66;</code>
   */
  public static final int US_FL_DUNES_COMMUNITY_DEVELOPMENT_DISTRICT_EXPRESSCARD_VALUE = 66;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_EPASS = 67;</code>
   */
  public static final int US_FL_EPASS_VALUE = 67;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_GIBA_TOLL_PASS = 68;</code>
   */
  public static final int US_FL_GIBA_TOLL_PASS_VALUE = 68;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_LEEWAY = 69;</code>
   */
  public static final int US_FL_LEEWAY_VALUE = 69;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_SUNPASS = 70;</code>
   */
  public static final int US_FL_SUNPASS_VALUE = 70;
  /**
   *
   *
   * <pre>
   * FL, USA.
   * </pre>
   *
   * <code>US_FL_SUNPASS_PRO = 71;</code>
   */
  public static final int US_FL_SUNPASS_PRO_VALUE = 71;
  /**
   *
   *
   * <pre>
   * IL, USA.
   * </pre>
   *
   * <code>US_IL_EZPASSIL = 73;</code>
   */
  public static final int US_IL_EZPASSIL_VALUE = 73;
  /**
   *
   *
   * <pre>
   * IL, USA.
   * </pre>
   *
   * <code>US_IL_IPASS = 72;</code>
   */
  public static final int US_IL_IPASS_VALUE = 72;
  /**
   *
   *
   * <pre>
   * IN, USA.
   * </pre>
   *
   * <code>US_IN_EZPASSIN = 26;</code>
   */
  public static final int US_IN_EZPASSIN_VALUE = 26;
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_BESTPASS_HORIZON = 27;</code>
   */
  public static final int US_KS_BESTPASS_HORIZON_VALUE = 27;
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_KTAG = 28;</code>
   */
  public static final int US_KS_KTAG_VALUE = 28;
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_NATIONALPASS = 29;</code>
   */
  public static final int US_KS_NATIONALPASS_VALUE = 29;
  /**
   *
   *
   * <pre>
   * KS, USA.
   * </pre>
   *
   * <code>US_KS_PREPASS_ELITEPASS = 30;</code>
   */
  public static final int US_KS_PREPASS_ELITEPASS_VALUE = 30;
  /**
   *
   *
   * <pre>
   * KY, USA.
   * </pre>
   *
   * <code>US_KY_RIVERLINK = 31;</code>
   */
  public static final int US_KY_RIVERLINK_VALUE = 31;
  /**
   *
   *
   * <pre>
   * LA, USA.
   * </pre>
   *
   * <code>US_LA_GEAUXPASS = 32;</code>
   */
  public static final int US_LA_GEAUXPASS_VALUE = 32;
  /**
   *
   *
   * <pre>
   * LA, USA.
   * </pre>
   *
   * <code>US_LA_TOLL_TAG = 33;</code>
   */
  public static final int US_LA_TOLL_TAG_VALUE = 33;
  /**
   *
   *
   * <pre>
   * MA, USA.
   * </pre>
   *
   * <code>US_MA_EZPASSMA = 6;</code>
   */
  public static final int US_MA_EZPASSMA_VALUE = 6;
  /**
   *
   *
   * <pre>
   * MD, USA.
   * </pre>
   *
   * <code>US_MD_EZPASSMD = 34;</code>
   */
  public static final int US_MD_EZPASSMD_VALUE = 34;
  /**
   *
   *
   * <pre>
   * ME, USA.
   * </pre>
   *
   * <code>US_ME_EZPASSME = 35;</code>
   */
  public static final int US_ME_EZPASSME_VALUE = 35;
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_AMBASSADOR_BRIDGE_PREMIER_COMMUTER_CARD = 36;</code>
   */
  public static final int US_MI_AMBASSADOR_BRIDGE_PREMIER_COMMUTER_CARD_VALUE = 36;
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_GROSSE_ILE_TOLL_BRIDGE_PASS_TAG = 37;</code>
   */
  public static final int US_MI_GROSSE_ILE_TOLL_BRIDGE_PASS_TAG_VALUE = 37;
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_IQ_PROX_CARD = 38;</code>
   */
  public static final int US_MI_IQ_PROX_CARD_VALUE = 38;
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_MACKINAC_BRIDGE_MAC_PASS = 39;</code>
   */
  public static final int US_MI_MACKINAC_BRIDGE_MAC_PASS_VALUE = 39;
  /**
   *
   *
   * <pre>
   * MI, USA.
   * </pre>
   *
   * <code>US_MI_NEXPRESS_TOLL = 40;</code>
   */
  public static final int US_MI_NEXPRESS_TOLL_VALUE = 40;
  /**
   *
   *
   * <pre>
   * MN, USA.
   * </pre>
   *
   * <code>US_MN_EZPASSMN = 41;</code>
   */
  public static final int US_MN_EZPASSMN_VALUE = 41;
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_EZPASSNC = 42;</code>
   */
  public static final int US_NC_EZPASSNC_VALUE = 42;
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_PEACH_PASS = 87;</code>
   */
  public static final int US_NC_PEACH_PASS_VALUE = 87;
  /**
   *
   *
   * <pre>
   * NC, USA.
   * </pre>
   *
   * <code>US_NC_QUICK_PASS = 43;</code>
   */
  public static final int US_NC_QUICK_PASS_VALUE = 43;
  /**
   *
   *
   * <pre>
   * NH, USA.
   * </pre>
   *
   * <code>US_NH_EZPASSNH = 80;</code>
   */
  public static final int US_NH_EZPASSNH_VALUE = 80;
  /**
   *
   *
   * <pre>
   * NJ, USA.
   * </pre>
   *
   * <code>US_NJ_DOWNBEACH_EXPRESS_PASS = 75;</code>
   */
  public static final int US_NJ_DOWNBEACH_EXPRESS_PASS_VALUE = 75;
  /**
   *
   *
   * <pre>
   * NJ, USA.
   * </pre>
   *
   * <code>US_NJ_EZPASSNJ = 74;</code>
   */
  public static final int US_NJ_EZPASSNJ_VALUE = 74;
  /**
   *
   *
   * <pre>
   * NY, USA.
   * </pre>
   *
   * <code>US_NY_EXPRESSPASS = 76;</code>
   */
  public static final int US_NY_EXPRESSPASS_VALUE = 76;
  /**
   *
   *
   * <pre>
   * NY, USA.
   * </pre>
   *
   * <code>US_NY_EZPASSNY = 77;</code>
   */
  public static final int US_NY_EZPASSNY_VALUE = 77;
  /**
   *
   *
   * <pre>
   * OH, USA.
   * </pre>
   *
   * <code>US_OH_EZPASSOH = 44;</code>
   */
  public static final int US_OH_EZPASSOH_VALUE = 44;
  /**
   *
   *
   * <pre>
   * PA, USA.
   * </pre>
   *
   * <code>US_PA_EZPASSPA = 45;</code>
   */
  public static final int US_PA_EZPASSPA_VALUE = 45;
  /**
   *
   *
   * <pre>
   * RI, USA.
   * </pre>
   *
   * <code>US_RI_EZPASSRI = 46;</code>
   */
  public static final int US_RI_EZPASSRI_VALUE = 46;
  /**
   *
   *
   * <pre>
   * SC, USA.
   * </pre>
   *
   * <code>US_SC_PALPASS = 47;</code>
   */
  public static final int US_SC_PALPASS_VALUE = 47;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_BANCPASS = 48;</code>
   */
  public static final int US_TX_BANCPASS_VALUE = 48;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_DEL_RIO_PASS = 49;</code>
   */
  public static final int US_TX_DEL_RIO_PASS_VALUE = 49;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EFAST_PASS = 50;</code>
   */
  public static final int US_TX_EFAST_PASS_VALUE = 50;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EAGLE_PASS_EXPRESS_CARD = 51;</code>
   */
  public static final int US_TX_EAGLE_PASS_EXPRESS_CARD_VALUE = 51;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EPTOLL = 52;</code>
   */
  public static final int US_TX_EPTOLL_VALUE = 52;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EZ_CROSS = 53;</code>
   */
  public static final int US_TX_EZ_CROSS_VALUE = 53;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_EZTAG = 54;</code>
   */
  public static final int US_TX_EZTAG_VALUE = 54;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_LAREDO_TRADE_TAG = 55;</code>
   */
  public static final int US_TX_LAREDO_TRADE_TAG_VALUE = 55;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_PLUSPASS = 56;</code>
   */
  public static final int US_TX_PLUSPASS_VALUE = 56;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_TOLLTAG = 57;</code>
   */
  public static final int US_TX_TOLLTAG_VALUE = 57;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_TXTAG = 58;</code>
   */
  public static final int US_TX_TXTAG_VALUE = 58;
  /**
   *
   *
   * <pre>
   * TX, USA.
   * </pre>
   *
   * <code>US_TX_XPRESS_CARD = 59;</code>
   */
  public static final int US_TX_XPRESS_CARD_VALUE = 59;
  /**
   *
   *
   * <pre>
   * UT, USA.
   * </pre>
   *
   * <code>US_UT_ADAMS_AVE_PARKWAY_EXPRESSCARD = 60;</code>
   */
  public static final int US_UT_ADAMS_AVE_PARKWAY_EXPRESSCARD_VALUE = 60;
  /**
   *
   *
   * <pre>
   * VA, USA.
   * </pre>
   *
   * <code>US_VA_EZPASSVA = 61;</code>
   */
  public static final int US_VA_EZPASSVA_VALUE = 61;
  /**
   *
   *
   * <pre>
   * WA, USA.
   * </pre>
   *
   * <code>US_WA_BREEZEBY = 17;</code>
   */
  public static final int US_WA_BREEZEBY_VALUE = 17;
  /**
   *
   *
   * <pre>
   * WA, USA.
   * </pre>
   *
   * <code>US_WA_GOOD_TO_GO = 1;</code>
   */
  public static final int US_WA_GOOD_TO_GO_VALUE = 1;
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_EZPASSWV = 62;</code>
   */
  public static final int US_WV_EZPASSWV_VALUE = 62;
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_MEMORIAL_BRIDGE_TICKETS = 63;</code>
   */
  public static final int US_WV_MEMORIAL_BRIDGE_TICKETS_VALUE = 63;
  /**
   *
   *
   * <pre>
   * WV, USA.
   * </pre>
   *
   * <code>US_WV_NEWELL_TOLL_BRIDGE_TICKET = 64;</code>
   */
  public static final int US_WV_NEWELL_TOLL_BRIDGE_TICKET_VALUE = 64;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TollPass valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TollPass forNumber(int value) {
    switch (value) {
      case 0:
        return TOLL_PASS_UNSPECIFIED;
      case 82:
        return AU_ETOLL_TAG;
      case 83:
        return AU_EWAY_TAG;
      case 2:
        return AU_LINKT;
      case 3:
        return AR_TELEPASE;
      case 81:
        return BR_AUTO_EXPRESO;
      case 7:
        return BR_CONECTCAR;
      case 8:
        return BR_MOVE_MAIS;
      case 88:
        return BR_PASSA_RAPIDO;
      case 9:
        return BR_SEM_PARAR;
      case 10:
        return BR_TAGGY;
      case 11:
        return BR_VELOE;
      case 84:
        return CA_US_AKWASASNE_SEAWAY_CORPORATE_CARD;
      case 85:
        return CA_US_AKWASASNE_SEAWAY_TRANSIT_CARD;
      case 18:
        return CA_US_BLUE_WATER_EDGE_PASS;
      case 19:
        return CA_US_CONNEXION;
      case 20:
        return CA_US_NEXUS_CARD;
      case 16:
        return ID_E_TOLL;
      case 78:
        return IN_FASTAG;
      case 79:
        return IN_LOCAL_HP_PLATE_EXEMPT;
      case 90:
        return MX_IAVE;
      case 91:
        return MX_PASE;
      case 93:
        return MX_QUICKPASS;
      case 89:
        return MX_SISTEMA_TELEPEAJE_CHIHUAHUA;
      case 12:
        return MX_TAG_IAVE;
      case 13:
        return MX_TAG_TELEVIA;
      case 92:
        return MX_TELEVIA;
      case 14:
        return MX_VIAPASS;
      case 21:
        return US_AL_FREEDOM_PASS;
      case 22:
        return US_AK_ANTON_ANDERSON_TUNNEL_BOOK_OF_10_TICKETS;
      case 4:
        return US_CA_FASTRAK;
      case 86:
        return US_CA_FASTRAK_CAV_STICKER;
      case 23:
        return US_CO_EXPRESSTOLL;
      case 24:
        return US_CO_GO_PASS;
      case 25:
        return US_DE_EZPASSDE;
      case 65:
        return US_FL_BOB_SIKES_TOLL_BRIDGE_PASS;
      case 66:
        return US_FL_DUNES_COMMUNITY_DEVELOPMENT_DISTRICT_EXPRESSCARD;
      case 67:
        return US_FL_EPASS;
      case 68:
        return US_FL_GIBA_TOLL_PASS;
      case 69:
        return US_FL_LEEWAY;
      case 70:
        return US_FL_SUNPASS;
      case 71:
        return US_FL_SUNPASS_PRO;
      case 73:
        return US_IL_EZPASSIL;
      case 72:
        return US_IL_IPASS;
      case 26:
        return US_IN_EZPASSIN;
      case 27:
        return US_KS_BESTPASS_HORIZON;
      case 28:
        return US_KS_KTAG;
      case 29:
        return US_KS_NATIONALPASS;
      case 30:
        return US_KS_PREPASS_ELITEPASS;
      case 31:
        return US_KY_RIVERLINK;
      case 32:
        return US_LA_GEAUXPASS;
      case 33:
        return US_LA_TOLL_TAG;
      case 6:
        return US_MA_EZPASSMA;
      case 34:
        return US_MD_EZPASSMD;
      case 35:
        return US_ME_EZPASSME;
      case 36:
        return US_MI_AMBASSADOR_BRIDGE_PREMIER_COMMUTER_CARD;
      case 37:
        return US_MI_GROSSE_ILE_TOLL_BRIDGE_PASS_TAG;
      case 38:
        return US_MI_IQ_PROX_CARD;
      case 39:
        return US_MI_MACKINAC_BRIDGE_MAC_PASS;
      case 40:
        return US_MI_NEXPRESS_TOLL;
      case 41:
        return US_MN_EZPASSMN;
      case 42:
        return US_NC_EZPASSNC;
      case 87:
        return US_NC_PEACH_PASS;
      case 43:
        return US_NC_QUICK_PASS;
      case 80:
        return US_NH_EZPASSNH;
      case 75:
        return US_NJ_DOWNBEACH_EXPRESS_PASS;
      case 74:
        return US_NJ_EZPASSNJ;
      case 76:
        return US_NY_EXPRESSPASS;
      case 77:
        return US_NY_EZPASSNY;
      case 44:
        return US_OH_EZPASSOH;
      case 45:
        return US_PA_EZPASSPA;
      case 46:
        return US_RI_EZPASSRI;
      case 47:
        return US_SC_PALPASS;
      case 48:
        return US_TX_BANCPASS;
      case 49:
        return US_TX_DEL_RIO_PASS;
      case 50:
        return US_TX_EFAST_PASS;
      case 51:
        return US_TX_EAGLE_PASS_EXPRESS_CARD;
      case 52:
        return US_TX_EPTOLL;
      case 53:
        return US_TX_EZ_CROSS;
      case 54:
        return US_TX_EZTAG;
      case 55:
        return US_TX_LAREDO_TRADE_TAG;
      case 56:
        return US_TX_PLUSPASS;
      case 57:
        return US_TX_TOLLTAG;
      case 58:
        return US_TX_TXTAG;
      case 59:
        return US_TX_XPRESS_CARD;
      case 60:
        return US_UT_ADAMS_AVE_PARKWAY_EXPRESSCARD;
      case 61:
        return US_VA_EZPASSVA;
      case 17:
        return US_WA_BREEZEBY;
      case 1:
        return US_WA_GOOD_TO_GO;
      case 62:
        return US_WV_EZPASSWV;
      case 63:
        return US_WV_MEMORIAL_BRIDGE_TICKETS;
      case 64:
        return US_WV_NEWELL_TOLL_BRIDGE_TICKET;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TollPass> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TollPass> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TollPass>() {
        public TollPass findValueByNumber(int number) {
          return TollPass.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.maps.routing.v2.TollPassesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TollPass[] VALUES = values();

  public static TollPass valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TollPass(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.TollPass)
}
