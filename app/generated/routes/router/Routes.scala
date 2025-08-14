// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router
package router

import play.core.routing._

import play.api.mvc._


final class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  Lobby_59: controllers.Lobby,
  // @LINE:8
  Tv_20: controllers.Tv,
  // @LINE:12
  Account_10: controllers.Account,
  // @LINE:15
  Timeline_17: controllers.Timeline,
  // @LINE:20
  Search_47: controllers.Search,
  // @LINE:23
  Game_8: controllers.Game,
  // @LINE:34
  Main_19: controllers.Main,
  // @LINE:48
  Relation_65: controllers.Relation,
  // @LINE:63
  Insight_2: controllers.Insight,
  // @LINE:70
  UserTournament_51: controllers.UserTournament,
  // @LINE:71
  Simul_56: controllers.Simul,
  // @LINE:74
  User_23: controllers.User,
  // @LINE:83
  Ublog_7: controllers.Ublog,
  // @LINE:99
  Fide_36: controllers.Fide,
  // @LINE:107
  Dasher_24: controllers.Dasher,
  // @LINE:142
  Feed_12: controllers.Feed,
  // @LINE:151
  Opening_53: controllers.Opening,
  // @LINE:159
  Coordinate_6: controllers.Coordinate,
  // @LINE:164
  Puzzle_52: controllers.Puzzle,
  // @LINE:168
  Export_22: controllers.Export,
  // @LINE:201
  Storm_39: controllers.Storm,
  // @LINE:210
  Racer_49: controllers.Racer,
  // @LINE:219
  UserAnalysis_44: controllers.UserAnalysis,
  // @LINE:226
  Study_63: controllers.Study,
  // @LINE:266
  RelayTour_42: controllers.RelayTour,
  // @LINE:287
  RelayRound_58: controllers.RelayRound,
  // @LINE:312
  Learn_45: controllers.Learn,
  // @LINE:318
  Plan_46: controllers.Plan,
  // @LINE:335
  Practice_43: controllers.Practice,
  // @LINE:347
  Streamer_27: controllers.Streamer,
  // @LINE:365
  JsBot_40: controllers.JsBot,
  // @LINE:375
  Round_34: controllers.Round,
  // @LINE:385
  Editor_11: controllers.Editor,
  // @LINE:392
  Analyse_28: controllers.Analyse,
  // @LINE:405
  Tournament_5: controllers.Tournament,
  // @LINE:434
  TournamentCrud_30: controllers.TournamentCrud,
  // @LINE:442
  Swiss_32: controllers.Swiss,
  // @LINE:475
  TeamApi_1: controllers.TeamApi,
  // @LINE:499
  Fishnet_64: controllers.Fishnet,
  // @LINE:506
  Pref_3: controllers.Pref,
  // @LINE:514
  Setup_54: controllers.Setup,
  // @LINE:522
  Challenge_35: controllers.Challenge,
  // @LINE:531
  Notify_68: controllers.Notify,
  // @LINE:535
  Video_31: controllers.Video,
  // @LINE:541
  I18n_18: controllers.I18n,
  // @LINE:544
  Auth_15: controllers.Auth,
  // @LINE:570
  Mod_62: controllers.Mod,
  // @LINE:594
  GameMod_13: controllers.GameMod,
  // @LINE:627
  Irwin_50: controllers.Irwin,
  // @LINE:635
  ForumCateg_33: controllers.ForumCateg,
  // @LINE:636
  ForumPost_57: controllers.ForumPost,
  // @LINE:638
  ForumTopic_21: controllers.ForumTopic,
  // @LINE:655
  Msg_41: controllers.Msg,
  // @LINE:667
  Coach_60: controllers.Coach,
  // @LINE:676
  Importer_16: controllers.Importer,
  // @LINE:686
  Api_66: controllers.Api,
  // @LINE:691
  team_Routes_0: team.Routes,
  // @LINE:692
  appeal_Routes_1: appeal.Routes,
  // @LINE:693
  report_Routes_2: report.Routes,
  // @LINE:694
  clas_Routes_3: clas.Routes,
  // @LINE:768
  BulkPairing_25: controllers.BulkPairing,
  // @LINE:787
  PlayApi_14: controllers.PlayApi,
  // @LINE:834
  Tutor_9: controllers.Tutor,
  // @LINE:845
  Recap_67: controllers.Recap,
  // @LINE:849
  OAuth_61: controllers.OAuth,
  // @LINE:856
  OAuthToken_55: controllers.OAuthToken,
  // @LINE:864
  Event_29: controllers.Event,
  // @LINE:872
  Cms_4: controllers.Cms,
  // @LINE:891
  Github_69: controllers.Github,
  // @LINE:893
  TitleVerify_0: controllers.TitleVerify,
  // @LINE:909
  Dev_37: controllers.Dev,
  // @LINE:920
  Push_26: controllers.Push,
  // @LINE:942
  DgtCtrl_38: controllers.DgtCtrl,
  // @LINE:950
  ExternalAssets_48: controllers.ExternalAssets,
) extends GeneratedRouter {

  final val prefix: String = "/"
  def withPrefix(addPrefix: String): Routes = ???



  // @LINE:531
  private val controllers_Notify_recent0_route = Route("GET",
    PathPattern(List(StaticPart("notify")))
  )

  // @LINE:532
  private val controllers_Notify_clear1_route = Route("POST",
    PathPattern(List(StaticPart("notify/clear")))
  )


  // @LINE:883
  private val controllers_Main_redirectToSwag1000_route = Route("GET",
    PathPattern(List(StaticPart("swag")))
  )


  // @LINE:4
  private val controllers_Lobby_home2000_route = Route("GET",
    PathPattern(List())
  )

  // @LINE:9
  private val controllers_Lobby_homeLang2001_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w""",false)))
  )

  // @LINE:31
  private val controllers_Tv_indexLang2002_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/tv")))
  )

  // @LINE:121
  private val controllers_Ublog_communityLang2003_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/blog/community")))
  )

  // @LINE:161
  private val controllers_Coordinate_homeLang2004_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/training/coordinate")))
  )

  // @LINE:190
  private val controllers_Puzzle_homeLang2005_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/training")))
  )

  // @LINE:191
  private val controllers_Puzzle_themesLang2006_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/training/themes")))
  )

  // @LINE:192
  private val controllers_Puzzle_showLang2007_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/training/"), DynamicPart("angleOrId", """[^/]+""",true)))
  )

  // @LINE:198
  private val controllers_Puzzle_streakLang2008_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/streak")))
  )

  // @LINE:207
  private val controllers_Storm_homeLang2009_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/storm")))
  )

  // @LINE:216
  private val controllers_Racer_homeLang2010_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/racer")))
  )

  // @LINE:258
  private val controllers_Study_homeLang2011_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/study")))
  )

  // @LINE:309
  private val controllers_RelayTour_indexLang2012_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/broadcast")))
  )

  // @LINE:315
  private val controllers_Learn_indexLang2013_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/learn")))
  )

  // @LINE:375
  private val controllers_Round_watcher2014_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:376
  private val controllers_Round_watcher2015_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false)))
  )

  // @LINE:377
  private val controllers_Round_player2016_route = Route("GET",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false)))
  )

  // @LINE:378
  private val controllers_Round_sides2017_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/sides")))
  )

  // @LINE:379
  private val controllers_Round_continue2018_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/continue/"), DynamicPart("mode", """[^/]+""",true)))
  )

  // @LINE:380
  private val controllers_Round_readNote2019_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/note")))
  )

  // @LINE:381
  private val controllers_Round_writeNote2020_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/note")))
  )

  // @LINE:382
  private val controllers_Round_mini2021_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/mini")))
  )

  // @LINE:383
  private val controllers_Round_mini2022_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/mini")))
  )

  // @LINE:384
  private val controllers_Round_miniFullId2023_route = Route("GET",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/mini")))
  )

  // @LINE:385
  private val controllers_Editor_game2024_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:386
  private val controllers_UserAnalysis_game2025_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/analysis")))
  )

  // @LINE:387
  private val controllers_UserAnalysis_forecastsGet2026_route = Route("GET",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/forecasts")))
  )

  // @LINE:388
  private val controllers_UserAnalysis_forecastsPost2027_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/forecasts")))
  )

  // @LINE:389
  private val controllers_UserAnalysis_forecastsOnMyTurn2028_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/forecasts/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:390
  private val controllers_Round_resign2029_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/resign")))
  )

  // @LINE:398
  private val controllers_Game_delete2030_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/delete")))
  )

  // @LINE:431
  private val controllers_Tournament_homeLang2031_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/tournament")))
  )

  // @LINE:455
  private val controllers_Swiss_homeLang2032_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/swiss")))
  )

  // @LINE:472
  private val controllers_Simul_homeLang2033_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/simul")))
  )

  // @LINE:488
  private val controllers_Analyse_requestAnalysis2034_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/request-analysis")))
  )

  // @LINE:546
  private val controllers_Auth_loginLang2035_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/login")))
  )

  // @LINE:551
  private val controllers_Auth_signupLang2036_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/signup")))
  )

  // @LINE:673
  private val controllers_Coach_homeLang2037_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/coach")))
  )

  // @LINE:884
  private val controllers_Main_mobileLang2038_route = Route("GET",
    PathPattern(List(DynamicPart("lang", """\w\w\w?""",false), StaticPart("/mobile")))
  )

  // @LINE:926
  private val controllers_Cms_menuPage2039_route = Route("GET",
    PathPattern(List(DynamicPart("key", """privacy|thanks|about|ads|changelog""",false)))
  )

  // @LINE:955
  private val controllers_User_redirect2040_route = Route("GET",
    PathPattern(List(DynamicPart("path", """.+""",false)))
  )


  // @LINE:129
  private val controllers_Ublog_discuss3000_route = Route("GET",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/discuss")))
  )

  // @LINE:130
  private val controllers_Ublog_redirect3001_route = Route("GET",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/redirect")))
  )

  // @LINE:131
  private val controllers_Ublog_edit3002_route = Route("GET",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:132
  private val controllers_Ublog_update3003_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:133
  private val controllers_Ublog_delete3004_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/del")))
  )

  // @LINE:134
  private val controllers_Ublog_like3005_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/like")))
  )

  // @LINE:135
  private val controllers_Ublog_modBlog3006_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("blogId", """[^/]+""",true), StaticPart("/tier")))
  )

  // @LINE:136
  private val controllers_Ublog_modPost3007_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/adjust")))
  )

  // @LINE:137
  private val controllers_Ublog_modPull3008_route = Route("POST",
    PathPattern(List(StaticPart("ublog/"), DynamicPart("id", """\w{8}""",false), StaticPart("/pull")))
  )

  // @LINE:138
  private val controllers_Ublog_modShowCarousel3009_route = Route("GET",
    PathPattern(List(StaticPart("ublog/carousel")))
  )


  // @LINE:891
  private val controllers_Github_secretScanning4000_route = Route("POST",
    PathPattern(List(StaticPart("github/secret-scanning")))
  )


  // @LINE:522
  private val controllers_Challenge_all5000_route = Route("GET",
    PathPattern(List(StaticPart("challenge")))
  )

  // @LINE:523
  private val controllers_Challenge_show5001_route = Route("GET",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:524
  private val controllers_Challenge_accept5002_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept")))
  )

  // @LINE:525
  private val controllers_Challenge_decline5003_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/decline")))
  )

  // @LINE:526
  private val controllers_Challenge_cancel5004_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cancel")))
  )

  // @LINE:527
  private val controllers_Challenge_toFriend5005_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/to-friend")))
  )

  // @LINE:528
  private val controllers_Challenge_offerRematchForGame5006_route = Route("POST",
    PathPattern(List(StaticPart("challenge/rematch-of/"), DynamicPart("id", """\w{8}""",false)))
  )


  // @LINE:547
  private val controllers_Auth_logoutGet6000_route = Route("GET",
    PathPattern(List(StaticPart("logout")))
  )

  // @LINE:548
  private val controllers_Auth_logout6001_route = Route("POST",
    PathPattern(List(StaticPart("logout")))
  )


  // @LINE:148
  private val controllers_Feed_atom7000_route = Route("GET",
    PathPattern(List(StaticPart("feed.atom")))
  )


  // @LINE:627
  private val controllers_Irwin_dashboard8000_route = Route("GET",
    PathPattern(List(StaticPart("irwin")))
  )

  // @LINE:628
  private val controllers_Irwin_saveReport8001_route = Route("POST",
    PathPattern(List(StaticPart("irwin/report")))
  )


  // @LINE:929
  private val controllers_Cms_source9000_route = Route("GET",
    PathPattern(List(StaticPart("source")))
  )


  // @LINE:949
  private val controllers_Main_devAsset10000_route = Route("GET",
    PathPattern(List(StaticPart("assets/_"), DynamicPart("v", """\w{6}""",false), StaticPart("/"), DynamicPart("file", """.+""",false)))
  )

  // @LINE:950
  private val controllers_ExternalAssets_at10001_route = Route("GET",
    PathPattern(List(StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )


  // @LINE:312
  private val controllers_Learn_index11000_route = Route("GET",
    PathPattern(List(StaticPart("learn")))
  )

  // @LINE:313
  private val controllers_Learn_score11001_route = Route("POST",
    PathPattern(List(StaticPart("learn/score")))
  )

  // @LINE:314
  private val controllers_Learn_reset11002_route = Route("POST",
    PathPattern(List(StaticPart("learn/reset")))
  )


  // @LINE:681
  private val controllers_Editor_data12000_route = Route("GET",
    PathPattern(List(StaticPart("editor.json")))
  )


  // @LINE:632
  private val controllers_Irwin_kaladin13000_route = Route("GET",
    PathPattern(List(StaticPart("kaladin")))
  )


  // @LINE:570
  private val controllers_Mod_alt14000_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/alt/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:571
  private val controllers_Mod_altMany14001_route = Route("POST",
    PathPattern(List(StaticPart("mod/alt-many")))
  )

  // @LINE:572
  private val controllers_Mod_engine14002_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/engine/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:573
  private val controllers_Mod_booster14003_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/booster/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:574
  private val controllers_Mod_troll14004_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/troll/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:575
  private val controllers_Mod_isolate14005_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/isolate/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:576
  private val controllers_Mod_deletePmsAndChats14006_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/delete-pms-and-chats")))
  )

  // @LINE:577
  private val controllers_Mod_warn14007_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/warn")))
  )

  // @LINE:578
  private val controllers_Mod_kid14008_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/kid")))
  )

  // @LINE:579
  private val controllers_Mod_disableTwoFactor14009_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/disable-2fa")))
  )

  // @LINE:580
  private val controllers_Mod_closeAccount14010_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:581
  private val controllers_Mod_reopenAccount14011_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reopen")))
  )

  // @LINE:582
  private val controllers_Mod_setTitle14012_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/title")))
  )

  // @LINE:583
  private val controllers_Mod_spontaneousInquiry14013_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/inquiry")))
  )

  // @LINE:584
  private val controllers_Mod_communicationPublic14014_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/communication")))
  )

  // @LINE:585
  private val controllers_Mod_communicationPrivate14015_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/communication/private")))
  )

  // @LINE:586
  private val controllers_Mod_fullCommsExport14016_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/communication/full-comms-export")))
  )

  // @LINE:587
  private val controllers_Mod_rankban14017_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/rankban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:588
  private val controllers_Mod_arenaBan14018_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/arenaban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:589
  private val controllers_Mod_prizeban14019_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/prizeban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:590
  private val controllers_Mod_reportban14020_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reportban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:591
  private val controllers_Mod_blankPassword14021_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blank-password")))
  )

  // @LINE:592
  private val controllers_Mod_freePatron14022_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/free-patron")))
  )

  // @LINE:593
  private val controllers_Mod_impersonate14023_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/impersonate")))
  )

  // @LINE:594
  private val controllers_GameMod_index14024_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:595
  private val controllers_GameMod_post14025_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:596
  private val controllers_Mod_table14026_route = Route("GET",
    PathPattern(List(StaticPart("mod/table")))
  )

  // @LINE:597
  private val controllers_Mod_log14027_route = Route("GET",
    PathPattern(List(StaticPart("mod/log")))
  )

  // @LINE:598
  private val controllers_Mod_refreshUserAssess14028_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/refreshUserAssess")))
  )

  // @LINE:599
  private val controllers_Mod_setEmail14029_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/email")))
  )

  // @LINE:600
  private val controllers_Mod_inquiryToZulip14030_route = Route("POST",
    PathPattern(List(StaticPart("mod/inquiry-to-zulip")))
  )

  // @LINE:601
  private val controllers_Mod_createNameCloseVote14031_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/create-name-close-vote")))
  )

  // @LINE:602
  private val controllers_Mod_askUsertableCheck14032_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/ask-usertable-check")))
  )

  // @LINE:603
  private val controllers_Mod_gamify14033_route = Route("GET",
    PathPattern(List(StaticPart("mod/leaderboard")))
  )

  // @LINE:604
  private val controllers_Mod_gamifyPeriod14034_route = Route("GET",
    PathPattern(List(StaticPart("mod/leaderboard/"), DynamicPart("period", """[^/]+""",true)))
  )

  // @LINE:605
  private val controllers_Mod_activity14035_route = Route("GET",
    PathPattern(List(StaticPart("mod/activity")))
  )

  // @LINE:606
  private val controllers_Mod_activityOf14036_route = Route("GET",
    PathPattern(List(StaticPart("mod/activity/"), DynamicPart("who", """[^/]+""",true), StaticPart("/"), DynamicPart("period", """[^/]+""",true)))
  )

  // @LINE:607
  private val controllers_Mod_queues14037_route = Route("GET",
    PathPattern(List(StaticPart("mod/queues/"), DynamicPart("period", """[^/]+""",true)))
  )

  // @LINE:608
  private val controllers_Mod_search14038_route = Route("GET",
    PathPattern(List(StaticPart("mod/search")))
  )

  // @LINE:609
  private val controllers_Mod_notes14039_route = Route("GET",
    PathPattern(List(StaticPart("mod/notes")))
  )

  // @LINE:610
  private val controllers_Mod_chatUser14040_route = Route("GET",
    PathPattern(List(StaticPart("mod/chat-user/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:611
  private val controllers_Mod_permissions14041_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/permissions")))
  )

  // @LINE:612
  private val controllers_Mod_savePermissions14042_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/permissions")))
  )

  // @LINE:613
  private val controllers_Mod_gdprErase14043_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/gdpr-erase")))
  )

  // @LINE:614
  private val controllers_Mod_publicChat14044_route = Route("GET",
    PathPattern(List(StaticPart("mod/public-chat")))
  )

  // @LINE:615
  private val controllers_Mod_publicChatTimeout14045_route = Route("POST",
    PathPattern(List(StaticPart("mod/public-chat/timeout")))
  )

  // @LINE:616
  private val controllers_Mod_emailConfirm14046_route = Route("GET",
    PathPattern(List(StaticPart("mod/email-confirm")))
  )

  // @LINE:617
  private val controllers_Mod_print14047_route = Route("GET",
    PathPattern(List(StaticPart("mod/print/"), DynamicPart("fh", """[^/]+""",true)))
  )

  // @LINE:618
  private val controllers_Mod_printBan14048_route = Route("POST",
    PathPattern(List(StaticPart("mod/print/ban/"), DynamicPart("v", """[^/]+""",true), StaticPart("/"), DynamicPart("fh", """[^/]+""",true)))
  )

  // @LINE:619
  private val controllers_Mod_singleIp14049_route = Route("GET",
    PathPattern(List(StaticPart("mod/ip/"), DynamicPart("ip", """[^/]+""",true)))
  )

  // @LINE:620
  private val controllers_Mod_singleIpBan14050_route = Route("POST",
    PathPattern(List(StaticPart("mod/ip/ban/"), DynamicPart("v", """[^/]+""",true), StaticPart("/"), DynamicPart("ip", """[^/]+""",true)))
  )

  // @LINE:621
  private val controllers_Mod_presets14051_route = Route("GET",
    PathPattern(List(StaticPart("mod/presets/"), DynamicPart("group", """[^/]+""",true)))
  )

  // @LINE:622
  private val controllers_Mod_presetsUpdate14052_route = Route("POST",
    PathPattern(List(StaticPart("mod/presets/"), DynamicPart("group", """[^/]+""",true)))
  )


  // @LINE:676
  private val controllers_Importer_importGame15000_route = Route("GET",
    PathPattern(List(StaticPart("paste")))
  )


  // @LINE:561
  private val controllers_Auth_setFingerPrint16000_route = Route("POST",
    PathPattern(List(StaticPart("auth/set-fp/"), DynamicPart("fp", """[^/]+""",true), StaticPart("/"), DynamicPart("ms", """[^/]+""",true)))
  )

  // @LINE:562
  private val controllers_Auth_makeLoginToken16001_route = Route("POST",
    PathPattern(List(StaticPart("auth/token")))
  )

  // @LINE:563
  private val controllers_Auth_loginWithToken16002_route = Route("GET",
    PathPattern(List(StaticPart("auth/token/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:564
  private val controllers_Auth_loginWithTokenPost16003_route = Route("POST",
    PathPattern(List(StaticPart("auth/token/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:565
  private val controllers_Auth_magicLink16004_route = Route("GET",
    PathPattern(List(StaticPart("auth/magic-link")))
  )

  // @LINE:566
  private val controllers_Auth_magicLinkApply16005_route = Route("POST",
    PathPattern(List(StaticPart("auth/magic-link/send")))
  )

  // @LINE:567
  private val controllers_Auth_magicLinkSent16006_route = Route("GET",
    PathPattern(List(StaticPart("auth/magic-link/sent")))
  )


  // @LINE:655
  private val controllers_Msg_compatCreate17000_route = Route("POST",
    PathPattern(List(StaticPart("inbox/new")))
  )

  // @LINE:657
  private val controllers_Msg_home17001_route = Route("GET",
    PathPattern(List(StaticPart("inbox")))
  )

  // @LINE:658
  private val controllers_Msg_search17002_route = Route("GET",
    PathPattern(List(StaticPart("inbox/search")))
  )

  // @LINE:659
  private val controllers_Msg_unreadCount17003_route = Route("GET",
    PathPattern(List(StaticPart("inbox/unread-count")))
  )

  // @LINE:660
  private val controllers_Msg_convo17004_route = Route("GET",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:661
  private val controllers_Msg_convoDelete17005_route = Route("DELETE",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:663
  private val controllers_Msg_apiPost17006_route = Route("POST",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:664
  private val controllers_Msg_convoDelete17007_route = Route("POST",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true), StaticPart("/delete")))
  )


  // @LINE:928
  private val controllers_Main_faq18000_route = Route("GET",
    PathPattern(List(StaticPart("faq")))
  )


  // @LINE:864
  private val controllers_Event_show19000_route = Route("GET",
    PathPattern(List(StaticPart("event/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:865
  private val controllers_Event_manager19001_route = Route("GET",
    PathPattern(List(StaticPart("event/manager")))
  )

  // @LINE:866
  private val controllers_Event_edit19002_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:867
  private val controllers_Event_update19003_route = Route("POST",
    PathPattern(List(StaticPart("event/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:868
  private val controllers_Event_cloneE19004_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/clone/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:869
  private val controllers_Event_form19005_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/new")))
  )

  // @LINE:870
  private val controllers_Event_create19006_route = Route("POST",
    PathPattern(List(StaticPart("event/manager")))
  )


  // @LINE:893
  private val controllers_TitleVerify_index20000_route = Route("GET",
    PathPattern(List(StaticPart("verify-title")))
  )

  // @LINE:894
  private val controllers_TitleVerify_form20001_route = Route("GET",
    PathPattern(List(StaticPart("verify-title/form")))
  )

  // @LINE:895
  private val controllers_TitleVerify_create20002_route = Route("POST",
    PathPattern(List(StaticPart("verify-title/form")))
  )

  // @LINE:896
  private val controllers_TitleVerify_queue20003_route = Route("GET",
    PathPattern(List(StaticPart("verify-title/queue")))
  )

  // @LINE:897
  private val controllers_TitleVerify_show20004_route = Route("GET",
    PathPattern(List(StaticPart("verify-title/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:898
  private val controllers_TitleVerify_update20005_route = Route("POST",
    PathPattern(List(StaticPart("verify-title/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:899
  private val controllers_TitleVerify_cancel20006_route = Route("POST",
    PathPattern(List(StaticPart("verify-title/"), DynamicPart("id", """[^/]+""",true), StaticPart("/cancel")))
  )

  // @LINE:900
  private val controllers_TitleVerify_process20007_route = Route("POST",
    PathPattern(List(StaticPart("verify-title/"), DynamicPart("id", """[^/]+""",true), StaticPart("/process")))
  )


  // @LINE:195
  private val controllers_Puzzle_streak21000_route = Route("GET",
    PathPattern(List(StaticPart("streak")))
  )


  // @LINE:365
  private val controllers_JsBot_index22000_route = Route("GET",
    PathPattern(List(StaticPart("bots")))
  )

  // @LINE:366
  private val controllers_JsBot_assetKeys22001_route = Route("GET",
    PathPattern(List(StaticPart("bots/assets")))
  )

  // @LINE:367
  private val controllers_JsBot_devIndex22002_route = Route("GET",
    PathPattern(List(StaticPart("bots/dev")))
  )

  // @LINE:368
  private val controllers_JsBot_devBotHistory22003_route = Route("GET",
    PathPattern(List(StaticPart("bots/dev/history")))
  )

  // @LINE:369
  private val controllers_JsBot_devPostBot22004_route = Route("POST",
    PathPattern(List(StaticPart("bots/dev/bot")))
  )

  // @LINE:370
  private val controllers_JsBot_devAssets22005_route = Route("GET",
    PathPattern(List(StaticPart("bots/dev/assets")))
  )

  // @LINE:371
  private val controllers_JsBot_devPostAsset22006_route = Route("POST",
    PathPattern(List(StaticPart("bots/dev/asset/"), DynamicPart("tpe", """sound|image|book""",false), StaticPart("/"), DynamicPart("key", """\w{12}(\.\w{2,4})?""",false)))
  )

  // @LINE:372
  private val controllers_JsBot_devNameAsset22007_route = Route("POST",
    PathPattern(List(StaticPart("bots/dev/asset/mv/"), DynamicPart("key", """\w{12}(\.\w{2,4})?""",false), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )


  // @LINE:201
  private val controllers_Storm_home23000_route = Route("GET",
    PathPattern(List(StaticPart("storm")))
  )

  // @LINE:202
  private val controllers_Storm_record23001_route = Route("POST",
    PathPattern(List(StaticPart("storm")))
  )

  // @LINE:203
  private val controllers_Storm_dashboard23002_route = Route("GET",
    PathPattern(List(StaticPart("storm/dashboard")))
  )

  // @LINE:204
  private val controllers_Storm_dashboardOf23003_route = Route("GET",
    PathPattern(List(StaticPart("storm/dashboard/"), DynamicPart("username", """[^/]+""",true)))
  )


  // @LINE:332
  private val controllers_Plan_features24000_route = Route("GET",
    PathPattern(List(StaticPart("features")))
  )


  // @LINE:904
  private val controllers_Main_captchaCheck25000_route = Route("GET",
    PathPattern(List(StaticPart("run/captcha/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:905
  private val controllers_Main_temporarilyDisabled25001_route = Route("GET",
    PathPattern(List(StaticPart("run/temporarily-disabled")))
  )

  // @LINE:906
  private val controllers_Main_temporarilyDisabled25002_route = Route("GET",
    PathPattern(List(StaticPart("run/temporarily-disabled/"), DynamicPart("path", """.+""",false)))
  )

  // @LINE:907
  private val controllers_Main_externalLink25003_route = Route("GET",
    PathPattern(List(StaticPart("run/external-link/"), DynamicPart("tag", """[^/]+""",true)))
  )

  // @LINE:908
  private val controllers_Main_toggleBlindMode25004_route = Route("POST",
    PathPattern(List(StaticPart("run/toggle-blind-mode")))
  )

  // @LINE:909
  private val controllers_Dev_command25005_route = Route("POST",
    PathPattern(List(StaticPart("run/cli")))
  )


  // @LINE:347
  private val controllers_Streamer_index26000_route = Route("GET",
    PathPattern(List(StaticPart("streamer")))
  )

  // @LINE:353
  private val controllers_Main_movedPermanently26001_route = Route("GET",
    PathPattern(List(StaticPart("streamer/live")))
  )

  // @LINE:354
  private val controllers_Streamer_edit26002_route = Route("GET",
    PathPattern(List(StaticPart("streamer/edit")))
  )

  // @LINE:355
  private val controllers_Streamer_create26003_route = Route("POST",
    PathPattern(List(StaticPart("streamer/new")))
  )

  // @LINE:356
  private val controllers_Streamer_editApply26004_route = Route("POST",
    PathPattern(List(StaticPart("streamer/edit")))
  )

  // @LINE:357
  private val controllers_Streamer_subscribe26005_route = Route("POST",
    PathPattern(List(StaticPart("streamer/subscribe/"), DynamicPart("streamer", """[^/]+""",true)))
  )

  // @LINE:359
  private val controllers_Streamer_show26006_route = Route("GET",
    PathPattern(List(StaticPart("streamer/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:360
  private val controllers_Streamer_redirect26007_route = Route("GET",
    PathPattern(List(StaticPart("streamer/"), DynamicPart("username", """[^/]+""",true), StaticPart("/redirect")))
  )

  // @LINE:361
  private val controllers_Streamer_checkOnline26008_route = Route("POST",
    PathPattern(List(StaticPart("streamer/"), DynamicPart("username", """[^/]+""",true), StaticPart("/check")))
  )


  // @LINE:931
  private val controllers_Cms_lonePage27000_route = Route("GET",
    PathPattern(List(StaticPart("page/"), DynamicPart("key", """[^/]+""",true)))
  )


  // @LINE:942
  private val controllers_DgtCtrl_index28000_route = Route("GET",
    PathPattern(List(StaticPart("dgt")))
  )

  // @LINE:943
  private val controllers_DgtCtrl_play28001_route = Route("GET",
    PathPattern(List(StaticPart("dgt/play")))
  )

  // @LINE:944
  private val controllers_DgtCtrl_config28002_route = Route("GET",
    PathPattern(List(StaticPart("dgt/config")))
  )

  // @LINE:945
  private val controllers_DgtCtrl_generateToken28003_route = Route("POST",
    PathPattern(List(StaticPart("dgt/config/token")))
  )


  // @LINE:885
  private val controllers_Main_lag29000_route = Route("GET",
    PathPattern(List(StaticPart("lag")))
  )


  // @LINE:697
  private val controllers_User_ratingDistribution30000_route = Route("GET",
    PathPattern(List(StaticPart("stat/rating/distribution/"), DynamicPart("perf", """[^/]+""",true)))
  )


  // @LINE:922
  private val controllers_Push_webSubscribe31000_route = Route("POST",
    PathPattern(List(StaticPart("push/subscribe")))
  )


  // @LINE:99
  private val controllers_Fide_index32000_route = Route("GET",
    PathPattern(List(StaticPart("fide")))
  )

  // @LINE:100
  private val controllers_Fide_federations32001_route = Route("GET",
    PathPattern(List(StaticPart("fide/federation")))
  )

  // @LINE:101
  private val controllers_Fide_federation32002_route = Route("GET",
    PathPattern(List(StaticPart("fide/federation/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:102
  private val controllers_Fide_show32003_route = Route("GET",
    PathPattern(List(StaticPart("fide/"), DynamicPart("fideId", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:103
  private val controllers_Fide_follow32004_route = Route("POST",
    PathPattern(List(StaticPart("fide/"), DynamicPart("fideId", """[^/]+""",true), StaticPart("/follow")))
  )


  // @LINE:54
  private val controllers_Relation_unfollowBc33000_route = Route("POST",
    PathPattern(List(StaticPart("rel/unfollow/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:55
  private val controllers_Relation_followBc33001_route = Route("POST",
    PathPattern(List(StaticPart("rel/follow/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:59
  private val controllers_Relation_blocks33002_route = Route("GET",
    PathPattern(List(StaticPart("rel/blocks")))
  )

  // @LINE:60
  private val controllers_Relation_bcAction33003_route = Route("POST",
    PathPattern(List(StaticPart("rel/"), DynamicPart("action", """[^/]+""",true), StaticPart("/"), DynamicPart("user", """[^/]+""",true)))
  )


  // @LINE:888
  private val controllers_Main_instantChess34000_route = Route("GET",
    PathPattern(List(StaticPart("InstantChess.com")))
  )


  // @LINE:930
  private val controllers_Main_legacyQaQuestion35000_route = Route("GET",
    PathPattern(List(StaticPart("qa/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )


  // @LINE:63
  private val controllers_Insight_refresh36000_route = Route("POST",
    PathPattern(List(StaticPart("insights/refresh/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:64
  private val controllers_Insight_json36001_route = Route("POST",
    PathPattern(List(StaticPart("insights/data/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:65
  private val controllers_Insight_index36002_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:66
  private val controllers_Insight_path36003_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("metric", """[^/]+""",true), StaticPart("/"), DynamicPart("dimension", """[^/]+""",true)))
  )

  // @LINE:67
  private val controllers_Insight_path36004_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("metric", """[^/]+""",true), StaticPart("/"), DynamicPart("dimension", """[^/]+""",true), StaticPart("/"), DynamicPart("filters", """.+""",false)))
  )


  // @LINE:159
  private val controllers_Coordinate_home37000_route = Route("GET",
    PathPattern(List(StaticPart("training/coordinate")))
  )

  // @LINE:160
  private val controllers_Coordinate_score37001_route = Route("POST",
    PathPattern(List(StaticPart("training/coordinate/score")))
  )

  // @LINE:164
  private val controllers_Puzzle_home37002_route = Route("GET",
    PathPattern(List(StaticPart("training")))
  )

  // @LINE:165
  private val controllers_Puzzle_daily37003_route = Route("GET",
    PathPattern(List(StaticPart("training/daily")))
  )

  // @LINE:166
  private val controllers_Puzzle_frame37004_route = Route("GET",
    PathPattern(List(StaticPart("training/frame")))
  )

  // @LINE:167
  private val controllers_Puzzle_help37005_route = Route("GET",
    PathPattern(List(StaticPart("training/help")))
  )

  // @LINE:168
  private val controllers_Export_puzzleThumbnail37006_route = Route("GET",
    PathPattern(List(StaticPart("training/export/gif/thumbnail/"), DynamicPart("id", """[^/]+""",true), StaticPart(".gif")))
  )

  // @LINE:169
  private val controllers_Puzzle_themes37007_route = Route("GET",
    PathPattern(List(StaticPart("training/themes")))
  )

  // @LINE:170
  private val controllers_Puzzle_openings37008_route = Route("GET",
    PathPattern(List(StaticPart("training/openings")))
  )

  // @LINE:171
  private val controllers_Puzzle_ofPlayer37009_route = Route("GET",
    PathPattern(List(StaticPart("training/of-player")))
  )

  // @LINE:172
  private val controllers_Puzzle_dashboard37010_route = Route("GET",
    PathPattern(List(StaticPart("training/dashboard/"), DynamicPart("days", """\d+""",false)))
  )

  // @LINE:173
  private val controllers_Puzzle_dashboard37011_route = Route("GET",
    PathPattern(List(StaticPart("training/dashboard/"), DynamicPart("days", """\d+""",false), StaticPart("/"), DynamicPart("path", """[^/]+""",true)))
  )

  // @LINE:174
  private val controllers_Puzzle_replay37012_route = Route("GET",
    PathPattern(List(StaticPart("training/replay/"), DynamicPart("days", """\d+""",false), StaticPart("/"), DynamicPart("theme", """[^/]+""",true)))
  )

  // @LINE:175
  private val controllers_Puzzle_history37013_route = Route("GET",
    PathPattern(List(StaticPart("training/history")))
  )

  // @LINE:176
  private val controllers_Puzzle_mobileBcBatchSelect37014_route = Route("GET",
    PathPattern(List(StaticPart("training/batch")))
  )

  // @LINE:177
  private val controllers_Puzzle_mobileBcBatchSolve37015_route = Route("POST",
    PathPattern(List(StaticPart("training/batch")))
  )

  // @LINE:178
  private val controllers_Puzzle_mobileBcNew37016_route = Route("GET",
    PathPattern(List(StaticPart("training/new")))
  )

  // @LINE:179
  private val controllers_Puzzle_mobileBcLoad37017_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("numericalId", """\d{6,}""",false), StaticPart("/load")))
  )

  // @LINE:180
  private val controllers_Puzzle_mobileBcVote37018_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("numericalId", """\d{6,}""",false), StaticPart("/vote")))
  )

  // @LINE:181
  private val controllers_Puzzle_show37019_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("angleOrId", """[^/]+""",true)))
  )

  // @LINE:182
  private val controllers_Puzzle_angleAndColor37020_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("angle", """[^/]+""",true), StaticPart("/"), DynamicPart("color", """white|black|random""",false)))
  )

  // @LINE:183
  private val controllers_Puzzle_showWithAngle37021_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("angle", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{5}""",false)))
  )

  // @LINE:184
  private val controllers_Puzzle_mobileBcRound37022_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("numericalId", """\d{6,}""",false), StaticPart("/round2")))
  )

  // @LINE:185
  private val controllers_Puzzle_vote37023_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """\w{5}""",false), StaticPart("/vote")))
  )

  // @LINE:186
  private val controllers_Puzzle_report37024_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """\w{5}""",false), StaticPart("/report")))
  )

  // @LINE:187
  private val controllers_Puzzle_voteTheme37025_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """\w{5}""",false), StaticPart("/vote/"), DynamicPart("theme", """[^/]+""",true)))
  )

  // @LINE:188
  private val controllers_Puzzle_complete37026_route = Route("POST",
    PathPattern(List(StaticPart("training/complete/"), DynamicPart("theme", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{5}""",false)))
  )

  // @LINE:189
  private val controllers_Puzzle_setDifficulty37027_route = Route("POST",
    PathPattern(List(StaticPart("training/difficulty/"), DynamicPart("theme", """[^/]+""",true)))
  )


  // @LINE:889
  private val controllers_Main_dailyPuzzleSlackApp38000_route = Route("GET",
    PathPattern(List(StaticPart("daily-puzzle-slack")))
  )


  // @LINE:458
  private val controllers_Simul_home39000_route = Route("GET",
    PathPattern(List(StaticPart("simul")))
  )

  // @LINE:459
  private val controllers_Simul_form39001_route = Route("GET",
    PathPattern(List(StaticPart("simul/new")))
  )

  // @LINE:460
  private val controllers_Simul_create39002_route = Route("POST",
    PathPattern(List(StaticPart("simul/new")))
  )

  // @LINE:461
  private val controllers_Simul_homeReload39003_route = Route("GET",
    PathPattern(List(StaticPart("simul/reload")))
  )

  // @LINE:462
  private val controllers_Simul_show39004_route = Route("GET",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:463
  private val controllers_Simul_edit39005_route = Route("GET",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:464
  private val controllers_Simul_update39006_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:465
  private val controllers_Simul_hostPing39007_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/host-ping")))
  )

  // @LINE:466
  private val controllers_Simul_accept39008_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:467
  private val controllers_Simul_reject39009_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/reject/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:468
  private val controllers_Simul_start39010_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/start")))
  )

  // @LINE:469
  private val controllers_Simul_abort39011_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/abort")))
  )

  // @LINE:470
  private val controllers_Simul_join39012_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join/"), DynamicPart("variant", """[^/]+""",true)))
  )

  // @LINE:471
  private val controllers_Simul_withdraw39013_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )


  // @LINE:934
  private val controllers_Cms_variantHome40000_route = Route("GET",
    PathPattern(List(StaticPart("variant")))
  )

  // @LINE:935
  private val controllers_Cms_variant40001_route = Route("GET",
    PathPattern(List(StaticPart("variant/"), DynamicPart("key", """[^/]+""",true)))
  )


  // @LINE:917
  private val controllers_Main_prometheusMetrics41000_route = Route("GET",
    PathPattern(List(StaticPart("prometheus-metrics/"), DynamicPart("key", """[^/]+""",true)))
  )


  // @LINE:8
  private val controllers_Tv_index42000_route = Route("GET",
    PathPattern(List(StaticPart("tv")))
  )

  // @LINE:32
  private val controllers_Tv_frameDefault42001_route = Route("GET",
    PathPattern(List(StaticPart("tv/frame")))
  )

  // @LINE:33
  private val controllers_Tv_feedDefault42002_route = Route("GET",
    PathPattern(List(StaticPart("tv/feed")))
  )

  // @LINE:34
  private val controllers_Main_movedPermanently42003_route = Route("GET",
    PathPattern(List(StaticPart("tv/channels")))
  )

  // @LINE:35
  private val controllers_Tv_onChannel42004_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("chanKey", """[^/]+""",true)))
  )

  // @LINE:36
  private val controllers_Tv_frame42005_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("chanKey", """[^/]+""",true), StaticPart("/frame")))
  )

  // @LINE:37
  private val controllers_Tv_feed42006_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("chanKey", """[^/]+""",true), StaticPart("/feed")))
  )

  // @LINE:38
  private val controllers_Tv_sides42007_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """[^/]+""",true), StaticPart("/sides")))
  )


  // @LINE:692
  private val prefixed_appeal_Routes_1_43000 = Include(appeal_Routes_1)


  // @LINE:882
  private val controllers_Main_redirectToAppStore44000_route = Route("GET",
    PathPattern(List(StaticPart("app-store")))
  )


  // @LINE:405
  private val controllers_Tournament_home45000_route = Route("GET",
    PathPattern(List(StaticPart("tournament")))
  )

  // @LINE:406
  private val controllers_Tournament_featured45001_route = Route("GET",
    PathPattern(List(StaticPart("tournament/featured")))
  )

  // @LINE:407
  private val controllers_Tournament_form45002_route = Route("GET",
    PathPattern(List(StaticPart("tournament/new")))
  )

  // @LINE:408
  private val controllers_Tournament_webCreate45003_route = Route("POST",
    PathPattern(List(StaticPart("tournament/new")))
  )

  // @LINE:409
  private val controllers_Tournament_teamBattleForm45004_route = Route("GET",
    PathPattern(List(StaticPart("tournament/team-battle/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:410
  private val controllers_Tournament_teamBattleEdit45005_route = Route("GET",
    PathPattern(List(StaticPart("tournament/team-battle/edit/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:411
  private val controllers_Tournament_teamBattleUpdate45006_route = Route("POST",
    PathPattern(List(StaticPart("tournament/team-battle/edit/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:412
  private val controllers_Tournament_calendar45007_route = Route("GET",
    PathPattern(List(StaticPart("tournament/calendar")))
  )

  // @LINE:413
  private val controllers_Tournament_history45008_route = Route("GET",
    PathPattern(List(StaticPart("tournament/history")))
  )

  // @LINE:414
  private val controllers_Tournament_history45009_route = Route("GET",
    PathPattern(List(StaticPart("tournament/history/"), DynamicPart("freq", """[^/]+""",true)))
  )

  // @LINE:415
  private val controllers_Tournament_show45010_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:416
  private val controllers_Tournament_standing45011_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/standing/"), DynamicPart("page", """[^/]+""",true)))
  )

  // @LINE:417
  private val controllers_Tournament_pageOf45012_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/page-of/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:418
  private val controllers_Tournament_join45013_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join")))
  )

  // @LINE:419
  private val controllers_Tournament_pause45014_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:420
  private val controllers_Tournament_player45015_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/player/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:421
  private val controllers_Tournament_teamInfo45016_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/team/"), DynamicPart("team", """[^/]+""",true)))
  )

  // @LINE:422
  private val controllers_Tournament_terminate45017_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:423
  private val controllers_Tournament_edit45018_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:424
  private val controllers_Tournament_update45019_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:425
  private val controllers_Tournament_battleTeams45020_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/teams")))
  )

  // @LINE:426
  private val controllers_Tournament_moderation45021_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/mod/"), DynamicPart("view", """[^/]+""",true)))
  )

  // @LINE:427
  private val controllers_Tournament_help45022_route = Route("GET",
    PathPattern(List(StaticPart("tournament/help")))
  )

  // @LINE:428
  private val controllers_Tournament_leaderboard45023_route = Route("GET",
    PathPattern(List(StaticPart("tournament/leaderboard")))
  )

  // @LINE:429
  private val controllers_Tournament_shields45024_route = Route("GET",
    PathPattern(List(StaticPart("tournament/shields")))
  )

  // @LINE:430
  private val controllers_Tournament_categShields45025_route = Route("GET",
    PathPattern(List(StaticPart("tournament/shields/"), DynamicPart("categ", """[^/]+""",true)))
  )

  // @LINE:434
  private val controllers_TournamentCrud_index45026_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager")))
  )

  // @LINE:435
  private val controllers_TournamentCrud_cloneT45027_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/clone/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:436
  private val controllers_TournamentCrud_edit45028_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:437
  private val controllers_TournamentCrud_update45029_route = Route("POST",
    PathPattern(List(StaticPart("tournament/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:438
  private val controllers_TournamentCrud_form45030_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/new")))
  )

  // @LINE:439
  private val controllers_TournamentCrud_create45031_route = Route("POST",
    PathPattern(List(StaticPart("tournament/manager")))
  )


  // @LINE:223
  private val controllers_UserAnalysis_embed46000_route = Route("GET",
    PathPattern(List(StaticPart("embed/analysis")))
  )

  // @LINE:278
  private val controllers_RelayTour_embedShow46001_route = Route("GET",
    PathPattern(List(StaticPart("embed/broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:293
  private val controllers_RelayRound_embedShow46002_route = Route("GET",
    PathPattern(List(StaticPart("embed/broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("rs", """[^/]+""",true), StaticPart("/"), DynamicPart("roundId", """\w{8}""",false)))
  )

  // @LINE:392
  private val controllers_Analyse_embed46003_route = Route("GET",
    PathPattern(List(StaticPart("embed/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:393
  private val controllers_Analyse_embed46004_route = Route("GET",
    PathPattern(List(StaticPart("embed/"), DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false)))
  )

  // @LINE:395
  private val controllers_Analyse_embedReplayGame46005_route = Route("GET",
    PathPattern(List(StaticPart("embed/game/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:396
  private val controllers_Analyse_embedReplayGame46006_route = Route("GET",
    PathPattern(List(StaticPart("embed/game/"), DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false)))
  )


  // @LINE:807
  private val controllers_Account_emailConfirmHelp47000_route = Route("GET",
    PathPattern(List(StaticPart("contact/email-confirm/help")))
  )

  // @LINE:927
  private val controllers_Main_contact47001_route = Route("GET",
    PathPattern(List(StaticPart("contact")))
  )


  // @LINE:953
  private val controllers_Main_robots48000_route = Route("GET",
    PathPattern(List(StaticPart("robots.txt")))
  )


  // @LINE:442
  private val controllers_Swiss_home49000_route = Route("GET",
    PathPattern(List(StaticPart("swiss")))
  )

  // @LINE:443
  private val controllers_Swiss_form49001_route = Route("GET",
    PathPattern(List(StaticPart("swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:444
  private val controllers_Swiss_create49002_route = Route("POST",
    PathPattern(List(StaticPart("swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:445
  private val controllers_Swiss_show49003_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:446
  private val controllers_Swiss_round49004_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/round/"), DynamicPart("round", """[^/]+""",true)))
  )

  // @LINE:447
  private val controllers_Swiss_exportTrf49005_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart(".trf")))
  )

  // @LINE:448
  private val controllers_Swiss_edit49006_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:449
  private val controllers_Swiss_update49007_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:450
  private val controllers_Swiss_terminate49008_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:451
  private val controllers_Swiss_standing49009_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/standing/"), DynamicPart("page", """[^/]+""",true)))
  )

  // @LINE:452
  private val controllers_Swiss_pageOf49010_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/page-of/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:453
  private val controllers_Swiss_player49011_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/player/"), DynamicPart("user", """[^/]+""",true)))
  )


  // @LINE:318
  private val controllers_Plan_index50000_route = Route("GET",
    PathPattern(List(StaticPart("patron")))
  )

  // @LINE:319
  private val controllers_Plan_thanks50001_route = Route("GET",
    PathPattern(List(StaticPart("patron/thanks")))
  )

  // @LINE:320
  private val controllers_Plan_list50002_route = Route("GET",
    PathPattern(List(StaticPart("patron/list")))
  )

  // @LINE:321
  private val controllers_Plan_switch50003_route = Route("POST",
    PathPattern(List(StaticPart("patron/switch")))
  )

  // @LINE:322
  private val controllers_Plan_cancel50004_route = Route("POST",
    PathPattern(List(StaticPart("patron/cancel")))
  )

  // @LINE:323
  private val controllers_Plan_webhook50005_route = Route("POST",
    PathPattern(List(StaticPart("patron/webhook")))
  )

  // @LINE:324
  private val controllers_Plan_stripeCheckout50006_route = Route("POST",
    PathPattern(List(StaticPart("patron/stripe/checkout")))
  )

  // @LINE:325
  private val controllers_Plan_updatePayment50007_route = Route("POST",
    PathPattern(List(StaticPart("patron/stripe/update-payment")))
  )

  // @LINE:326
  private val controllers_Plan_updatePaymentCallback50008_route = Route("GET",
    PathPattern(List(StaticPart("patron/stripe/update-payment")))
  )

  // @LINE:327
  private val controllers_Plan_payPalIpn50009_route = Route("POST",
    PathPattern(List(StaticPart("patron/ipn")))
  )

  // @LINE:328
  private val controllers_Plan_payPalCheckout50010_route = Route("POST",
    PathPattern(List(StaticPart("patron/paypal/checkout")))
  )

  // @LINE:329
  private val controllers_Plan_payPalCapture50011_route = Route("POST",
    PathPattern(List(StaticPart("patron/paypal/capture/"), DynamicPart("id", """[^/]+""",true)))
  )


  // @LINE:107
  private val controllers_Dasher_get51000_route = Route("GET",
    PathPattern(List(StaticPart("dasher")))
  )


  // @LINE:57
  private val controllers_Relation_following52000_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/following")))
  )

  // @LINE:58
  private val controllers_Relation_followers52001_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/followers")))
  )

  // @LINE:70
  private val controllers_UserTournament_path52002_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/tournaments/"), DynamicPart("path", """[^/]+""",true)))
  )

  // @LINE:71
  private val controllers_Simul_byUser52003_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/simuls/hosted")))
  )

  // @LINE:75
  private val controllers_User_writeNote52004_route = Route("POST",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/note")))
  )

  // @LINE:78
  private val controllers_User_showMini52005_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mini")))
  )

  // @LINE:79
  private val controllers_User_tv52006_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/tv")))
  )

  // @LINE:80
  private val controllers_User_perfStat52007_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/perf/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:81
  private val controllers_User_gamesAll52008_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/all")))
  )

  // @LINE:82
  private val controllers_User_download52009_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/download")))
  )

  // @LINE:83
  private val controllers_Ublog_index52010_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog")))
  )

  // @LINE:84
  private val controllers_Ublog_userAtom52011_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog.atom")))
  )

  // @LINE:85
  private val controllers_User_games52012_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("filterName", """[^/]+""",true)))
  )

  // @LINE:86
  private val controllers_User_show52013_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:125
  private val controllers_Ublog_post52014_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:126
  private val controllers_Ublog_drafts52015_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog/drafts")))
  )

  // @LINE:127
  private val controllers_Ublog_form52016_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog/new")))
  )

  // @LINE:128
  private val controllers_Ublog_create52017_route = Route("POST",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/blog/new")))
  )


  // @LINE:947
  private val controllers_Main_jslog53000_route = Route("POST",
    PathPattern(List(StaticPart("jslog/"), DynamicPart("id", """\w{12}""",false)))
  )


  // @LINE:496
  private val controllers_Export_fenThumbnail54000_route = Route("GET",
    PathPattern(List(StaticPart("export/fen.gif")))
  )


  // @LINE:952
  private val controllers_Main_manifest55000_route = Route("GET",
    PathPattern(List(StaticPart("manifest.json")))
  )


  // @LINE:651
  private val controllers_ForumTopic_diagnostic56000_route = Route("POST",
    PathPattern(List(StaticPart("diagnostic")))
  )

  // @LINE:652
  private val controllers_ForumTopic_clearDiagnostic56001_route = Route("POST",
    PathPattern(List(StaticPart("diagnostic/clear/"), DynamicPart("slug", """[^/]+""",true)))
  )


  // @LINE:938
  private val controllers_Cms_help57000_route = Route("GET",
    PathPattern(List(StaticPart("help/contribute")))
  )

  // @LINE:939
  private val controllers_Main_helpPath57001_route = Route("GET",
    PathPattern(List(StaticPart("help/"), DynamicPart("path", """.+""",false)))
  )


  // @LINE:682
  private val controllers_Editor_load58000_route = Route("GET",
    PathPattern(List(StaticPart("editor/"), DynamicPart("urlFen", """.+""",false)))
  )

  // @LINE:683
  private val controllers_Editor_index58001_route = Route("GET",
    PathPattern(List(StaticPart("editor")))
  )


  // @LINE:667
  private val controllers_Coach_all59000_route = Route("GET",
    PathPattern(List(StaticPart("coach")))
  )

  // @LINE:668
  private val controllers_Coach_edit59001_route = Route("GET",
    PathPattern(List(StaticPart("coach/edit")))
  )

  // @LINE:669
  private val controllers_Coach_editApply59002_route = Route("POST",
    PathPattern(List(StaticPart("coach/edit")))
  )

  // @LINE:671
  private val controllers_Coach_show59003_route = Route("GET",
    PathPattern(List(StaticPart("coach/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:672
  private val controllers_Coach_search59004_route = Route("GET",
    PathPattern(List(StaticPart("coach/"), DynamicPart("lang", """[^/]+""",true), StaticPart("/"), DynamicPart("country", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )


  // @LINE:111
  private val controllers_Main_movedPermanently60000_route = Route("GET",
    PathPattern(List(StaticPart("blog")))
  )

  // @LINE:112
  private val controllers_Ublog_topics60001_route = Route("GET",
    PathPattern(List(StaticPart("blog/topic")))
  )

  // @LINE:113
  private val controllers_Ublog_topic60002_route = Route("GET",
    PathPattern(List(StaticPart("blog/topic/"), DynamicPart("topic", """[^/]+""",true)))
  )

  // @LINE:114
  private val controllers_Ublog_thisMonth60003_route = Route("GET",
    PathPattern(List(StaticPart("blog/monthly")))
  )

  // @LINE:115
  private val controllers_Ublog_byMonth60004_route = Route("GET",
    PathPattern(List(StaticPart("blog/monthly/"), DynamicPart("year", """[^/]+""",true), StaticPart("/"), DynamicPart("month", """[^/]+""",true)))
  )

  // @LINE:117
  private val controllers_Ublog_friends60005_route = Route("GET",
    PathPattern(List(StaticPart("blog/friends")))
  )

  // @LINE:118
  private val controllers_Ublog_liked60006_route = Route("GET",
    PathPattern(List(StaticPart("blog/liked")))
  )

  // @LINE:119
  private val controllers_Ublog_search60007_route = Route("GET",
    PathPattern(List(StaticPart("blog/search")))
  )

  // @LINE:120
  private val controllers_Ublog_communityAll60008_route = Route("GET",
    PathPattern(List(StaticPart("blog/community")))
  )

  // @LINE:122
  private val controllers_Ublog_communityAtom60009_route = Route("GET",
    PathPattern(List(StaticPart("blog/community.atom")))
  )

  // @LINE:123
  private val controllers_Ublog_communityAtom60010_route = Route("GET",
    PathPattern(List(StaticPart("blog/community/"), DynamicPart("lang", """[\w-]{2,6}""",false), StaticPart(".atom")))
  )

  // @LINE:124
  private val controllers_Ublog_historicalBlogPost60011_route = Route("GET",
    PathPattern(List(StaticPart("blog/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )


  // @LINE:677
  private val controllers_Importer_sendGame61000_route = Route("POST",
    PathPattern(List(StaticPart("import")))
  )

  // @LINE:678
  private val controllers_Importer_masterGame61001_route = Route("GET",
    PathPattern(List(StaticPart("import/master/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """[^/]+""",true)))
  )


  // @LINE:219
  private val controllers_UserAnalysis_help62000_route = Route("GET",
    PathPattern(List(StaticPart("analysis/help")))
  )

  // @LINE:220
  private val controllers_UserAnalysis_pgn62001_route = Route("GET",
    PathPattern(List(StaticPart("analysis/pgn/"), DynamicPart("pgn", """.+""",false)))
  )

  // @LINE:221
  private val controllers_UserAnalysis_parseArg62002_route = Route("GET",
    PathPattern(List(StaticPart("analysis/"), DynamicPart("something", """.+""",false)))
  )

  // @LINE:222
  private val controllers_UserAnalysis_index62003_route = Route("GET",
    PathPattern(List(StaticPart("analysis")))
  )


  // @LINE:87
  private val controllers_User_myself63000_route = Route("GET",
    PathPattern(List(StaticPart("player/myself")))
  )

  // @LINE:88
  private val controllers_User_opponents63001_route = Route("GET",
    PathPattern(List(StaticPart("player/opponents")))
  )

  // @LINE:89
  private val controllers_User_search63002_route = Route("GET",
    PathPattern(List(StaticPart("player/search/"), DynamicPart("term", """[^/]+""",true)))
  )

  // @LINE:90
  private val controllers_User_list63003_route = Route("GET",
    PathPattern(List(StaticPart("player")))
  )

  // @LINE:91
  private val controllers_User_topNb63004_route = Route("GET",
    PathPattern(List(StaticPart("player/top/"), DynamicPart("nb", """[^/]+""",true), StaticPart("/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:93
  private val controllers_User_topWeek63005_route = Route("GET",
    PathPattern(List(StaticPart("player/top/week")))
  )

  // @LINE:94
  private val controllers_User_online63006_route = Route("GET",
    PathPattern(List(StaticPart("player/online")))
  )

  // @LINE:792
  private val controllers_PlayApi_botOnline63007_route = Route("GET",
    PathPattern(List(StaticPart("player/bots")))
  )


  // @LINE:506
  private val controllers_Pref_set64000_route = Route("POST",
    PathPattern(List(StaticPart("pref/"), DynamicPart("name", """[^/]+""",true)))
  )


  // @LINE:912
  private val controllers_Dev_cli65000_route = Route("GET",
    PathPattern(List(StaticPart("dev/cli")))
  )

  // @LINE:913
  private val controllers_Dev_cliPost65001_route = Route("POST",
    PathPattern(List(StaticPart("dev/cli")))
  )

  // @LINE:914
  private val controllers_Dev_settings65002_route = Route("GET",
    PathPattern(List(StaticPart("dev/settings")))
  )

  // @LINE:915
  private val controllers_Dev_settingsPost65003_route = Route("POST",
    PathPattern(List(StaticPart("dev/settings/"), DynamicPart("id", """[^/]+""",true)))
  )


  // @LINE:266
  private val controllers_RelayTour_index66000_route = Route("GET",
    PathPattern(List(StaticPart("broadcast")))
  )

  // @LINE:267
  private val controllers_RelayTour_form66001_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/new")))
  )

  // @LINE:268
  private val controllers_RelayTour_create66002_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/new")))
  )

  // @LINE:269
  private val controllers_RelayTour_calendar66003_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/calendar")))
  )

  // @LINE:270
  private val controllers_RelayTour_calendarMonth66004_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/calendar/"), DynamicPart("year", """[^/]+""",true), StaticPart("/"), DynamicPart("month", """[^/]+""",true)))
  )

  // @LINE:271
  private val controllers_RelayTour_help66005_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/help")))
  )

  // @LINE:272
  private val controllers_RelayTour_app66006_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/app")))
  )

  // @LINE:273
  private val controllers_RelayTour_by66007_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/by/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:275
  private val controllers_RelayTour_subscribed66008_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/subscribed")))
  )

  // @LINE:276
  private val controllers_RelayTour_allPrivate66009_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/all-private")))
  )

  // @LINE:277
  private val controllers_RelayTour_show66010_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:281
  private val controllers_RelayTour_edit66011_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:282
  private val controllers_RelayTour_update66012_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:283
  private val controllers_RelayTour_delete66013_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/delete")))
  )

  // @LINE:285
  private val controllers_RelayTour_cloneTour66014_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/clone")))
  )

  // @LINE:286
  private val controllers_RelayTour_subscribe66015_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/subscribe")))
  )

  // @LINE:287
  private val controllers_RelayRound_form66016_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/new")))
  )

  // @LINE:288
  private val controllers_RelayRound_create66017_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/new")))
  )

  // @LINE:289
  private val controllers_RelayTour_playersView66018_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/players")))
  )

  // @LINE:290
  private val controllers_RelayTour_player66019_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart("/players/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:291
  private val controllers_RelayRound_show66020_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("rs", """[^/]+""",true), StaticPart("/"), DynamicPart("roundId", """\w{8}""",false)))
  )

  // @LINE:294
  private val controllers_RelayRound_chapter66021_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("rs", """[^/]+""",true), StaticPart("/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:295
  private val controllers_RelayRound_edit66022_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:296
  private val controllers_RelayRound_update66023_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:297
  private val controllers_RelayRound_reset66024_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/reset")))
  )

  // @LINE:299
  private val controllers_RelayRound_stats66025_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/stats")))
  )

  // @LINE:301
  private val controllers_RelayRound_pgn66026_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("rs", """[^/]+""",true), StaticPart("/"), DynamicPart("roundId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:302
  private val controllers_RelayRound_teamsView66027_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/teams")))
  )


  // @LINE:76
  private val controllers_User_deleteNote67000_route = Route("POST",
    PathPattern(List(StaticPart("note/delete/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:77
  private val controllers_User_setDoxNote67001_route = Route("POST",
    PathPattern(List(StaticPart("note/setDox/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("v", """[^/]+""",true)))
  )


  // @LINE:151
  private val controllers_Opening_index68000_route = Route("GET",
    PathPattern(List(StaticPart("opening")))
  )

  // @LINE:152
  private val controllers_Opening_config68001_route = Route("POST",
    PathPattern(List(StaticPart("opening/config/"), DynamicPart("key", """[^/]+""",true)))
  )

  // @LINE:153
  private val controllers_Opening_wikiWrite68002_route = Route("POST",
    PathPattern(List(StaticPart("opening/wiki/"), DynamicPart("key", """[^/]+""",true), StaticPart("/"), DynamicPart("moves", """[^/]+""",true)))
  )

  // @LINE:154
  private val controllers_Opening_tree68003_route = Route("GET",
    PathPattern(List(StaticPart("opening/tree")))
  )

  // @LINE:155
  private val controllers_Opening_byKeyAndMoves68004_route = Route("GET",
    PathPattern(List(StaticPart("opening/"), DynamicPart("key", """[^/]+""",true)))
  )

  // @LINE:156
  private val controllers_Opening_byKeyAndMoves68005_route = Route("GET",
    PathPattern(List(StaticPart("opening/"), DynamicPart("key", """[^/]+""",true), StaticPart("/"), DynamicPart("moves", """[^/]+""",true)))
  )


  // @LINE:535
  private val controllers_Video_index69000_route = Route("GET",
    PathPattern(List(StaticPart("video")))
  )

  // @LINE:536
  private val controllers_Video_tags69001_route = Route("GET",
    PathPattern(List(StaticPart("video/tags")))
  )

  // @LINE:537
  private val controllers_Video_author69002_route = Route("GET",
    PathPattern(List(StaticPart("video/author/"), DynamicPart("author", """[^/]+""",true)))
  )

  // @LINE:538
  private val controllers_Video_show69003_route = Route("GET",
    PathPattern(List(StaticPart("video/"), DynamicPart("id", """[^/]+""",true)))
  )


  // @LINE:116
  private val controllers_Main_movedPermanently70000_route = Route("GET",
    PathPattern(List(StaticPart("blog.atom")))
  )


  // @LINE:635
  private val controllers_ForumCateg_index71000_route = Route("GET",
    PathPattern(List(StaticPart("forum")))
  )

  // @LINE:636
  private val controllers_ForumPost_search71001_route = Route("GET",
    PathPattern(List(StaticPart("forum/search")))
  )

  // @LINE:637
  private val controllers_ForumCateg_show71002_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true)))
  )

  // @LINE:638
  private val controllers_ForumTopic_form71003_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/form")))
  )

  // @LINE:639
  private val controllers_ForumTopic_create71004_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/new")))
  )

  // @LINE:640
  private val controllers_ForumCateg_modFeed71005_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/mod-feed")))
  )

  // @LINE:641
  private val controllers_ForumTopic_participants71006_route = Route("GET",
    PathPattern(List(StaticPart("forum/participants/"), DynamicPart("topicId", """[^/]+""",true)))
  )

  // @LINE:642
  private val controllers_ForumTopic_show71007_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )

  // @LINE:643
  private val controllers_ForumTopic_close71008_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:644
  private val controllers_ForumTopic_sticky71009_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/sticky")))
  )

  // @LINE:645
  private val controllers_ForumPost_create71010_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/new")))
  )

  // @LINE:646
  private val controllers_ForumPost_delete71011_route = Route("POST",
    PathPattern(List(StaticPart("forum/delete/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:647
  private val controllers_ForumPost_relocate71012_route = Route("POST",
    PathPattern(List(StaticPart("forum/relocate/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:648
  private val controllers_ForumPost_react71013_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categId", """[^/]+""",true), StaticPart("/react/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("reaction", """[^/]+""",true), StaticPart("/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:649
  private val controllers_ForumPost_edit71014_route = Route("POST",
    PathPattern(List(StaticPart("forum/post/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:650
  private val controllers_ForumPost_redirect71015_route = Route("GET",
    PathPattern(List(StaticPart("forum/redirect/post/"), DynamicPart("id", """[^/]+""",true)))
  )


  // @LINE:139
  private val controllers_Ublog_image72000_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/ublog/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:284
  private val controllers_RelayTour_image72001_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/broadcast/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:358
  private val controllers_Streamer_pictureApply72002_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/streamer")))
  )

  // @LINE:670
  private val controllers_Coach_pictureApply72003_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/coach")))
  )

  // @LINE:890
  private val controllers_Main_uploadImage72004_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/user/"), DynamicPart("rel", """[^/]+""",true)))
  )

  // @LINE:901
  private val controllers_TitleVerify_image72005_route = Route("POST",
    PathPattern(List(StaticPart("upload/image/verify-title/"), DynamicPart("id", """[^/]+""",true)))
  )


  // @LINE:142
  private val controllers_Feed_index73000_route = Route("GET",
    PathPattern(List(StaticPart("feed")))
  )

  // @LINE:143
  private val controllers_Feed_createForm73001_route = Route("GET",
    PathPattern(List(StaticPart("feed/new")))
  )

  // @LINE:144
  private val controllers_Feed_create73002_route = Route("POST",
    PathPattern(List(StaticPart("feed/new")))
  )

  // @LINE:145
  private val controllers_Feed_edit73003_route = Route("GET",
    PathPattern(List(StaticPart("feed/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:146
  private val controllers_Feed_update73004_route = Route("POST",
    PathPattern(List(StaticPart("feed/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:147
  private val controllers_Feed_delete73005_route = Route("POST",
    PathPattern(List(StaticPart("feed/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )


  // @LINE:691
  private val prefixed_team_Routes_0_74000 = Include(team_Routes_0)


  // @LINE:5
  private val controllers_Lobby_seeks75000_route = Route("GET",
    PathPattern(List(StaticPart("lobby/seeks")))
  )


  // @LINE:15
  private val controllers_Timeline_home76000_route = Route("GET",
    PathPattern(List(StaticPart("timeline")))
  )

  // @LINE:17
  private val controllers_Timeline_unsub76001_route = Route("POST",
    PathPattern(List(StaticPart("timeline/unsub/"), DynamicPart("channel", """[^/]+""",true)))
  )


  // @LINE:693
  private val prefixed_report_Routes_2_77000 = Include(report_Routes_2)


  // @LINE:880
  private val controllers_Main_webmasters78000_route = Route("GET",
    PathPattern(List(StaticPart("developers")))
  )


  // @LINE:694
  private val prefixed_clas_Routes_3_79000 = Include(clas_Routes_3)


  // @LINE:402
  private val controllers_Round_help80000_route = Route("GET",
    PathPattern(List(StaticPart("round/help")))
  )


  // @LINE:12
  private val controllers_Account_info81000_route = Route("GET",
    PathPattern(List(StaticPart("account/info")))
  )

  // @LINE:507
  private val controllers_Pref_network81001_route = Route("GET",
    PathPattern(List(StaticPart("account/preferences/network")))
  )

  // @LINE:508
  private val controllers_Pref_networkPost81002_route = Route("POST",
    PathPattern(List(StaticPart("account/preferences/network")))
  )

  // @LINE:509
  private val controllers_Pref_form81003_route = Route("GET",
    PathPattern(List(StaticPart("account/preferences/"), DynamicPart("categ", """[^/]+""",true)))
  )

  // @LINE:510
  private val controllers_Pref_formApply81004_route = Route("POST",
    PathPattern(List(StaticPart("account/preferences")))
  )

  // @LINE:511
  private val controllers_Pref_notifyFormApply81005_route = Route("POST",
    PathPattern(List(StaticPart("account/preferences/notification")))
  )

  // @LINE:803
  private val controllers_Account_passwd81006_route = Route("GET",
    PathPattern(List(StaticPart("account/passwd")))
  )

  // @LINE:804
  private val controllers_Account_passwdApply81007_route = Route("POST",
    PathPattern(List(StaticPart("account/passwd")))
  )

  // @LINE:805
  private val controllers_Account_email81008_route = Route("GET",
    PathPattern(List(StaticPart("account/email")))
  )

  // @LINE:806
  private val controllers_Account_emailApply81009_route = Route("POST",
    PathPattern(List(StaticPart("account/email")))
  )

  // @LINE:808
  private val controllers_Account_emailConfirm81010_route = Route("GET",
    PathPattern(List(StaticPart("account/email/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:809
  private val controllers_Account_close81011_route = Route("GET",
    PathPattern(List(StaticPart("account/close")))
  )

  // @LINE:810
  private val controllers_Account_closeConfirm81012_route = Route("POST",
    PathPattern(List(StaticPart("account/close")))
  )

  // @LINE:811
  private val controllers_Account_delete81013_route = Route("GET",
    PathPattern(List(StaticPart("account/delete")))
  )

  // @LINE:812
  private val controllers_Account_deleteConfirm81014_route = Route("POST",
    PathPattern(List(StaticPart("account/delete")))
  )

  // @LINE:813
  private val controllers_Account_deleteDone81015_route = Route("GET",
    PathPattern(List(StaticPart("account/delete/done")))
  )

  // @LINE:814
  private val controllers_Account_profile81016_route = Route("GET",
    PathPattern(List(StaticPart("account/profile")))
  )

  // @LINE:815
  private val controllers_Account_profileApply81017_route = Route("POST",
    PathPattern(List(StaticPart("account/profile")))
  )

  // @LINE:816
  private val controllers_Account_username81018_route = Route("GET",
    PathPattern(List(StaticPart("account/username")))
  )

  // @LINE:817
  private val controllers_Account_usernameApply81019_route = Route("POST",
    PathPattern(List(StaticPart("account/username")))
  )

  // @LINE:818
  private val controllers_Account_kid81020_route = Route("GET",
    PathPattern(List(StaticPart("account/kid")))
  )

  // @LINE:819
  private val controllers_Account_kidPost81021_route = Route("POST",
    PathPattern(List(StaticPart("account/kid")))
  )

  // @LINE:820
  private val controllers_Account_twoFactor81022_route = Route("GET",
    PathPattern(List(StaticPart("account/twofactor")))
  )

  // @LINE:821
  private val controllers_Account_setupTwoFactor81023_route = Route("POST",
    PathPattern(List(StaticPart("account/twofactor/setup")))
  )

  // @LINE:822
  private val controllers_Account_disableTwoFactor81024_route = Route("POST",
    PathPattern(List(StaticPart("account/twofactor/disable")))
  )

  // @LINE:823
  private val controllers_Account_reopen81025_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen")))
  )

  // @LINE:824
  private val controllers_Account_reopenApply81026_route = Route("POST",
    PathPattern(List(StaticPart("account/reopen/send")))
  )

  // @LINE:825
  private val controllers_Account_reopenSent81027_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen/sent")))
  )

  // @LINE:826
  private val controllers_Account_reopenLogin81028_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen/login/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:827
  private val controllers_Account_data81029_route = Route("GET",
    PathPattern(List(StaticPart("account/personal-data")))
  )

  // @LINE:830
  private val controllers_Account_security81030_route = Route("GET",
    PathPattern(List(StaticPart("account/security")))
  )

  // @LINE:831
  private val controllers_Account_signout81031_route = Route("POST",
    PathPattern(List(StaticPart("account/signout/"), DynamicPart("sessionId", """[^/]+""",true)))
  )

  // @LINE:832
  private val controllers_Account_nowPlaying81032_route = Route("GET",
    PathPattern(List(StaticPart("account/now-playing")))
  )

  // @LINE:856
  private val controllers_OAuthToken_index81033_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/token")))
  )

  // @LINE:857
  private val controllers_OAuthToken_create81034_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/token/create")))
  )

  // @LINE:858
  private val controllers_OAuthToken_createApply81035_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/token/create")))
  )

  // @LINE:859
  private val controllers_OAuthToken_delete81036_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/token/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )


  // @LINE:16
  private val controllers_Timeline_api82000_route = Route("GET",
    PathPattern(List(StaticPart("api/timeline")))
  )

  // @LINE:24
  private val controllers_Game_exportByIds82001_route = Route("POST",
    PathPattern(List(StaticPart("api/games/export/_ids")))
  )

  // @LINE:42
  private val controllers_Tv_channels82002_route = Route("GET",
    PathPattern(List(StaticPart("api/tv/channels")))
  )

  // @LINE:43
  private val controllers_Tv_feedDefault82003_route = Route("GET",
    PathPattern(List(StaticPart("api/tv/feed")))
  )

  // @LINE:44
  private val controllers_Tv_feed82004_route = Route("GET",
    PathPattern(List(StaticPart("api/tv/"), DynamicPart("chanKey", """[^/]+""",true), StaticPart("/feed")))
  )

  // @LINE:45
  private val controllers_Tv_apiGamesChannel82005_route = Route("GET",
    PathPattern(List(StaticPart("api/tv/"), DynamicPart("chanKey", """[^/]+""",true)))
  )

  // @LINE:48
  private val controllers_Relation_apiFollowing82006_route = Route("GET",
    PathPattern(List(StaticPart("api/rel/following")))
  )

  // @LINE:49
  private val controllers_Relation_follow82007_route = Route("POST",
    PathPattern(List(StaticPart("api/rel/follow/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:50
  private val controllers_Relation_unfollow82008_route = Route("POST",
    PathPattern(List(StaticPart("api/rel/unfollow/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:51
  private val controllers_Relation_block82009_route = Route("POST",
    PathPattern(List(StaticPart("api/rel/block/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:52
  private val controllers_Relation_unblock82010_route = Route("POST",
    PathPattern(List(StaticPart("api/rel/unblock/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:74
  private val controllers_User_mod82011_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mod")))
  )

  // @LINE:92
  private val controllers_User_topNbApi82012_route = Route("GET",
    PathPattern(List(StaticPart("api/player/top/"), DynamicPart("nb", """[^/]+""",true), StaticPart("/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:95
  private val controllers_User_autocomplete82013_route = Route("GET",
    PathPattern(List(StaticPart("api/player/autocomplete")))
  )

  // @LINE:96
  private val controllers_User_apiList82014_route = Route("GET",
    PathPattern(List(StaticPart("api/player")))
  )

  // @LINE:104
  private val controllers_Fide_apiShow82015_route = Route("GET",
    PathPattern(List(StaticPart("api/fide/player/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:105
  private val controllers_Fide_apiSearch82016_route = Route("GET",
    PathPattern(List(StaticPart("api/fide/player")))
  )

  // @LINE:196
  private val controllers_Puzzle_apiStreak82017_route = Route("GET",
    PathPattern(List(StaticPart("api/streak")))
  )

  // @LINE:197
  private val controllers_Puzzle_apiStreakResult82018_route = Route("POST",
    PathPattern(List(StaticPart("api/streak/"), DynamicPart("score", """[^/]+""",true)))
  )

  // @LINE:205
  private val controllers_Storm_apiGet82019_route = Route("GET",
    PathPattern(List(StaticPart("api/storm")))
  )

  // @LINE:206
  private val controllers_Storm_apiDashboardOf82020_route = Route("GET",
    PathPattern(List(StaticPart("api/storm/dashboard/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:212
  private val controllers_Racer_apiCreate82021_route = Route("POST",
    PathPattern(List(StaticPart("api/racer")))
  )

  // @LINE:259
  private val controllers_Study_apiPgn82022_route = Route("GET",
    PathPattern(List(StaticPart("api/study/"), DynamicPart("id", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:260
  private val controllers_Study_apiChapterPgn82023_route = Route("GET",
    PathPattern(List(StaticPart("api/study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:261
  private val controllers_Study_apiChapterDelete82024_route = Route("DELETE",
    PathPattern(List(StaticPart("api/study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:262
  private val controllers_Study_apiListByOwner82025_route = Route("GET",
    PathPattern(List(StaticPart("api/study/by/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:263
  private val controllers_Study_apiImportPgn82026_route = Route("POST",
    PathPattern(List(StaticPart("api/study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/import-pgn")))
  )

  // @LINE:274
  private val controllers_RelayTour_apiBy82027_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/by/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:279
  private val controllers_RelayTour_apiShow82028_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:280
  private val controllers_RelayTour_pgn82029_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/"), DynamicPart("tourId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:292
  private val controllers_RelayRound_apiShow82030_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/"), DynamicPart("ts", """[^/]+""",true), StaticPart("/"), DynamicPart("rs", """[^/]+""",true), StaticPart("/"), DynamicPart("roundId", """\w{8}""",false)))
  )

  // @LINE:298
  private val controllers_RelayRound_reset82031_route = Route("POST",
    PathPattern(List(StaticPart("api/broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/reset")))
  )

  // @LINE:300
  private val controllers_RelayRound_push82032_route = Route("POST",
    PathPattern(List(StaticPart("api/broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart("/push")))
  )

  // @LINE:303
  private val controllers_RelayRound_apiPgn82033_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:304
  private val controllers_RelayRound_stream82034_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/broadcast/round/"), DynamicPart("roundId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:305
  private val controllers_RelayTour_apiIndex82035_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast")))
  )

  // @LINE:306
  private val controllers_RelayTour_apiTop82036_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/top")))
  )

  // @LINE:307
  private val controllers_RelayTour_apiSearch82037_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/search")))
  )

  // @LINE:308
  private val controllers_RelayRound_apiMyRounds82038_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast/my-rounds")))
  )

  // @LINE:330
  private val controllers_Plan_apiStripeCheckout82039_route = Route("POST",
    PathPattern(List(StaticPart("api/patron/stripe/checkout")))
  )

  // @LINE:331
  private val controllers_Plan_apiCurrencies82040_route = Route("GET",
    PathPattern(List(StaticPart("api/patron/currencies")))
  )

  // @LINE:348
  private val controllers_Streamer_featured82041_route = Route("GET",
    PathPattern(List(StaticPart("api/streamer/featured")))
  )

  // @LINE:349
  private val controllers_Streamer_live82042_route = Route("GET",
    PathPattern(List(StaticPart("api/streamer/live")))
  )

  // @LINE:351
  private val controllers_Streamer_onYouTubeVideo82043_route = Route("POST",
    PathPattern(List(StaticPart("api/x/streamer/youtube-pubsub")))
  )

  // @LINE:352
  private val controllers_Streamer_youTubePubSubChallenge82044_route = Route("GET",
    PathPattern(List(StaticPart("api/x/streamer/youtube-pubsub")))
  )

  // @LINE:454
  private val controllers_Swiss_scheduleNextRound82045_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/schedule-next-round")))
  )

  // @LINE:475
  private val controllers_TeamApi_all82046_route = Route("GET",
    PathPattern(List(StaticPart("api/team/all")))
  )

  // @LINE:476
  private val controllers_TeamApi_search82047_route = Route("GET",
    PathPattern(List(StaticPart("api/team/search")))
  )

  // @LINE:477
  private val controllers_TeamApi_teamsOf82048_route = Route("GET",
    PathPattern(List(StaticPart("api/team/of/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:478
  private val controllers_TeamApi_show82049_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:479
  private val controllers_TeamApi_users82050_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/users")))
  )

  // @LINE:480
  private val controllers_Tournament_byTeam82051_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/arena")))
  )

  // @LINE:481
  private val controllers_Swiss_byTeam82052_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/swiss")))
  )

  // @LINE:482
  private val controllers_TeamApi_requests82053_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/requests")))
  )

  // @LINE:483
  private val controllers_TeamApi_update82054_route = Route("POST",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:484
  private val controllers_TeamApi_requestProcess82055_route = Route("POST",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/"), DynamicPart("decision", """[^/]+""",true)))
  )

  // @LINE:485
  private val controllers_TeamApi_kickUser82056_route = Route("POST",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:623
  private val controllers_Mod_eventStream82057_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/mod")))
  )

  // @LINE:624
  private val controllers_Mod_markedUsersStream82058_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/mod-marked-since")))
  )

  // @LINE:629
  private val controllers_Irwin_eventStream82059_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/irwin")))
  )

  // @LINE:686
  private val controllers_Api_mobileHome82060_route = Route("GET",
    PathPattern(List(StaticPart("api/mobile/home")))
  )

  // @LINE:687
  private val controllers_Api_mobileWatch82061_route = Route("GET",
    PathPattern(List(StaticPart("api/mobile/watch")))
  )

  // @LINE:688
  private val controllers_Api_mobileProfile82062_route = Route("GET",
    PathPattern(List(StaticPart("api/mobile/profile/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:689
  private val controllers_Api_mobileGames82063_route = Route("GET",
    PathPattern(List(StaticPart("api/mobile/my-games")))
  )

  // @LINE:700
  private val controllers_Api_index82064_route = Route("GET",
    PathPattern(List(StaticPart("api")))
  )

  // @LINE:701
  private val controllers_Api_usersByIds82065_route = Route("POST",
    PathPattern(List(StaticPart("api/users")))
  )

  // @LINE:702
  private val controllers_Puzzle_apiDaily82066_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/daily")))
  )

  // @LINE:703
  private val controllers_Puzzle_activity82067_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/activity")))
  )

  // @LINE:704
  private val controllers_Puzzle_apiDashboard82068_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/dashboard/"), DynamicPart("days", """\d+""",false)))
  )

  // @LINE:705
  private val controllers_Puzzle_apiShow82069_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/"), DynamicPart("id", """\w{5}""",false)))
  )

  // @LINE:706
  private val controllers_Puzzle_apiNext82070_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/next")))
  )

  // @LINE:707
  private val controllers_Puzzle_apiBatchSelect82071_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/batch/"), DynamicPart("angle", """[^/]+""",true)))
  )

  // @LINE:708
  private val controllers_Puzzle_apiBatchSolve82072_route = Route("POST",
    PathPattern(List(StaticPart("api/puzzle/batch/"), DynamicPart("angle", """[^/]+""",true)))
  )

  // @LINE:709
  private val controllers_Puzzle_apiReplay82073_route = Route("GET",
    PathPattern(List(StaticPart("api/puzzle/replay/"), DynamicPart("days", """\d+""",false), StaticPart("/"), DynamicPart("theme", """[^/]+""",true)))
  )

  // @LINE:710
  private val controllers_UserTournament_apiTournamentsByOwner82074_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/tournament/created")))
  )

  // @LINE:711
  private val controllers_UserTournament_apiTournamentsByPlayer82075_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/tournament/played")))
  )

  // @LINE:712
  private val controllers_Api_user82076_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:713
  private val controllers_Api_activity82077_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/activity")))
  )

  // @LINE:714
  private val controllers_User_apiReadNote82078_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/note")))
  )

  // @LINE:715
  private val controllers_User_apiWriteNote82079_route = Route("POST",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/note")))
  )

  // @LINE:716
  private val controllers_User_ratingHistory82080_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/rating-history")))
  )

  // @LINE:717
  private val controllers_User_tvExport82081_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/current-game")))
  )

  // @LINE:718
  private val controllers_Api_perfStat82082_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/perf/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:719
  private val controllers_Mod_apiUserLog82083_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("user", """[^/]+""",true), StaticPart("/mod-log")))
  )

  // @LINE:720
  private val controllers_Api_game82084_route = Route("GET",
    PathPattern(List(StaticPart("api/game/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:721
  private val controllers_Api_currentTournaments82085_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament")))
  )

  // @LINE:722
  private val controllers_Tournament_apiShow82086_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:723
  private val controllers_Api_tournamentGames82087_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/games")))
  )

  // @LINE:724
  private val controllers_Api_tournamentResults82088_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/results")))
  )

  // @LINE:725
  private val controllers_Api_tournamentTeams82089_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/teams")))
  )

  // @LINE:726
  private val controllers_Tournament_apiCreate82090_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament")))
  )

  // @LINE:727
  private val controllers_Tournament_apiUpdate82091_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:728
  private val controllers_Tournament_apiJoin82092_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join")))
  )

  // @LINE:729
  private val controllers_Tournament_apiWithdraw82093_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:730
  private val controllers_Tournament_apiTerminate82094_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:731
  private val controllers_Tournament_apiTeamBattleUpdate82095_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament/team-battle/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:732
  private val controllers_Swiss_apiCreate82096_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:733
  private val controllers_Swiss_apiUpdate82097_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:734
  private val controllers_Swiss_join82098_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join")))
  )

  // @LINE:735
  private val controllers_Swiss_withdraw82099_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:736
  private val controllers_Swiss_apiTerminate82100_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:737
  private val controllers_Swiss_apiShow82101_route = Route("GET",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:738
  private val controllers_Api_swissGames82102_route = Route("GET",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/games")))
  )

  // @LINE:739
  private val controllers_Api_swissResults82103_route = Route("GET",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/results")))
  )

  // @LINE:740
  private val controllers_Simul_apiList82104_route = Route("GET",
    PathPattern(List(StaticPart("api/simul")))
  )

  // @LINE:741
  private val controllers_Api_status82105_route = Route("GET",
    PathPattern(List(StaticPart("api/status")))
  )

  // @LINE:742
  private val controllers_Api_usersStatus82106_route = Route("GET",
    PathPattern(List(StaticPart("api/users/status")))
  )

  // @LINE:743
  private val controllers_Api_crosstable82107_route = Route("GET",
    PathPattern(List(StaticPart("api/crosstable/"), DynamicPart("u1", """[^/]+""",true), StaticPart("/"), DynamicPart("u2", """[^/]+""",true)))
  )

  // @LINE:744
  private val controllers_Api_gamesByUsersStream82108_route = Route("POST",
    PathPattern(List(StaticPart("api/stream/games-by-users")))
  )

  // @LINE:745
  private val controllers_Api_gamesByIdsStream82109_route = Route("POST",
    PathPattern(List(StaticPart("api/stream/games/"), DynamicPart("streamId", """[^/]+""",true)))
  )

  // @LINE:746
  private val controllers_Api_gamesByIdsStreamAddIds82110_route = Route("POST",
    PathPattern(List(StaticPart("api/stream/games/"), DynamicPart("streamId", """[^/]+""",true), StaticPart("/add")))
  )

  // @LINE:747
  private val controllers_Api_eventStream82111_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/event")))
  )

  // @LINE:748
  private val controllers_Api_moveStream82112_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/game/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:749
  private val controllers_Account_apiMe82113_route = Route("GET",
    PathPattern(List(StaticPart("api/account")))
  )

  // @LINE:750
  private val controllers_Account_apiNowPlaying82114_route = Route("GET",
    PathPattern(List(StaticPart("api/account/playing")))
  )

  // @LINE:751
  private val controllers_Account_apiEmail82115_route = Route("GET",
    PathPattern(List(StaticPart("api/account/email")))
  )

  // @LINE:752
  private val controllers_Account_apiKid82116_route = Route("GET",
    PathPattern(List(StaticPart("api/account/kid")))
  )

  // @LINE:753
  private val controllers_Account_apiKidPost82117_route = Route("POST",
    PathPattern(List(StaticPart("api/account/kid")))
  )

  // @LINE:754
  private val controllers_Pref_apiGet82118_route = Route("GET",
    PathPattern(List(StaticPart("api/account/preferences")))
  )

  // @LINE:755
  private val controllers_Pref_apiSet82119_route = Route("POST",
    PathPattern(List(StaticPart("api/account/preferences/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:756
  private val controllers_Challenge_apiList82120_route = Route("GET",
    PathPattern(List(StaticPart("api/challenge")))
  )

  // @LINE:757
  private val controllers_Setup_apiAi82121_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/ai")))
  )

  // @LINE:758
  private val controllers_Challenge_openCreate82122_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/open")))
  )

  // @LINE:759
  private val controllers_Challenge_apiCreate82123_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:760
  private val controllers_Challenge_apiShow82124_route = Route("GET",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/show")))
  )

  // @LINE:761
  private val controllers_Challenge_apiAccept82125_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept")))
  )

  // @LINE:762
  private val controllers_Challenge_apiDecline82126_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/decline")))
  )

  // @LINE:763
  private val controllers_Challenge_apiCancel82127_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cancel")))
  )

  // @LINE:764
  private val controllers_Challenge_apiStartClocks82128_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/start-clocks")))
  )

  // @LINE:765
  private val controllers_Round_apiAddTime82129_route = Route("POST",
    PathPattern(List(StaticPart("api/round/"), DynamicPart("id", """\w{8}""",false), StaticPart("/add-time/"), DynamicPart("seconds", """[^/]+""",true)))
  )

  // @LINE:766
  private val controllers_Api_cloudEval82130_route = Route("GET",
    PathPattern(List(StaticPart("api/cloud-eval")))
  )

  // @LINE:767
  private val controllers_Importer_apiSendGame82131_route = Route("POST",
    PathPattern(List(StaticPart("api/import")))
  )

  // @LINE:768
  private val controllers_BulkPairing_list82132_route = Route("GET",
    PathPattern(List(StaticPart("api/bulk-pairing")))
  )

  // @LINE:769
  private val controllers_BulkPairing_create82133_route = Route("POST",
    PathPattern(List(StaticPart("api/bulk-pairing")))
  )

  // @LINE:770
  private val controllers_BulkPairing_show82134_route = Route("GET",
    PathPattern(List(StaticPart("api/bulk-pairing/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:771
  private val controllers_BulkPairing_delete82135_route = Route("DELETE",
    PathPattern(List(StaticPart("api/bulk-pairing/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:772
  private val controllers_BulkPairing_games82136_route = Route("GET",
    PathPattern(List(StaticPart("api/bulk-pairing/"), DynamicPart("id", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:773
  private val controllers_BulkPairing_startClocks82137_route = Route("POST",
    PathPattern(List(StaticPart("api/bulk-pairing/"), DynamicPart("id", """[^/]+""",true), StaticPart("/start-clocks")))
  )

  // @LINE:775
  private val controllers_Game_apiExportByUser82138_route = Route("GET",
    PathPattern(List(StaticPart("api/games/user/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:776
  private val controllers_Game_apiExportByUserImportedGames82139_route = Route("GET",
    PathPattern(List(StaticPart("api/games/export/imports")))
  )

  // @LINE:777
  private val controllers_Game_apiExportByUserBookmarks82140_route = Route("GET",
    PathPattern(List(StaticPart("api/games/export/bookmarks")))
  )

  // @LINE:780
  private val controllers_Analyse_externalEngineList82141_route = Route("GET",
    PathPattern(List(StaticPart("api/external-engine")))
  )

  // @LINE:781
  private val controllers_Analyse_externalEngineCreate82142_route = Route("POST",
    PathPattern(List(StaticPart("api/external-engine")))
  )

  // @LINE:782
  private val controllers_Analyse_externalEngineShow82143_route = Route("GET",
    PathPattern(List(StaticPart("api/external-engine/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:783
  private val controllers_Analyse_externalEngineUpdate82144_route = Route("PUT",
    PathPattern(List(StaticPart("api/external-engine/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:784
  private val controllers_Analyse_externalEngineDelete82145_route = Route("DELETE",
    PathPattern(List(StaticPart("api/external-engine/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:787
  private val controllers_PlayApi_botGameStream82146_route = Route("GET",
    PathPattern(List(StaticPart("api/bot/game/stream/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:788
  private val controllers_PlayApi_botMove82147_route = Route("POST",
    PathPattern(List(StaticPart("api/bot/game/"), DynamicPart("id", """[^/]+""",true), StaticPart("/move/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:789
  private val controllers_PlayApi_botOnlineApi82148_route = Route("GET",
    PathPattern(List(StaticPart("api/bot/online")))
  )

  // @LINE:790
  private val controllers_PlayApi_botCommand82149_route = Route("POST",
    PathPattern(List(StaticPart("api/bot/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:791
  private val controllers_PlayApi_botCommandGet82150_route = Route("GET",
    PathPattern(List(StaticPart("api/bot/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:795
  private val controllers_PlayApi_boardGameStream82151_route = Route("GET",
    PathPattern(List(StaticPart("api/board/game/stream/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:796
  private val controllers_PlayApi_boardMove82152_route = Route("POST",
    PathPattern(List(StaticPart("api/board/game/"), DynamicPart("id", """[^/]+""",true), StaticPart("/move/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:797
  private val controllers_Setup_boardApiHook82153_route = Route("POST",
    PathPattern(List(StaticPart("api/board/seek")))
  )

  // @LINE:798
  private val controllers_Setup_boardApiHookCancel82154_route = Route("DELETE",
    PathPattern(List(StaticPart("api/board/seek")))
  )

  // @LINE:799
  private val controllers_PlayApi_boardCommandPost82155_route = Route("POST",
    PathPattern(List(StaticPart("api/board/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:800
  private val controllers_PlayApi_boardCommandGet82156_route = Route("GET",
    PathPattern(List(StaticPart("api/board/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:854
  private val controllers_OAuth_tokenApply82157_route = Route("POST",
    PathPattern(List(StaticPart("api/token")))
  )

  // @LINE:855
  private val controllers_OAuth_tokenRevoke82158_route = Route("DELETE",
    PathPattern(List(StaticPart("api/token")))
  )

  // @LINE:860
  private val controllers_OAuth_challengeTokens82159_route = Route("POST",
    PathPattern(List(StaticPart("api/token/admin-challenge")))
  )

  // @LINE:861
  private val controllers_OAuth_testTokens82160_route = Route("POST",
    PathPattern(List(StaticPart("api/token/test")))
  )


  // @LINE:886
  private val controllers_Main_getFishnet83000_route = Route("GET",
    PathPattern(List(StaticPart("get-fishnet")))
  )


  // @LINE:872
  private val controllers_Cms_index84000_route = Route("GET",
    PathPattern(List(StaticPart("cms")))
  )

  // @LINE:873
  private val controllers_Cms_createForm84001_route = Route("GET",
    PathPattern(List(StaticPart("cms/new")))
  )

  // @LINE:874
  private val controllers_Cms_create84002_route = Route("POST",
    PathPattern(List(StaticPart("cms/new")))
  )

  // @LINE:875
  private val controllers_Cms_edit84003_route = Route("GET",
    PathPattern(List(StaticPart("cms/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:876
  private val controllers_Cms_update84004_route = Route("POST",
    PathPattern(List(StaticPart("cms/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:877
  private val controllers_Cms_delete84005_route = Route("POST",
    PathPattern(List(StaticPart("cms/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )


  // @LINE:549
  private val controllers_Auth_signup85000_route = Route("GET",
    PathPattern(List(StaticPart("signup")))
  )

  // @LINE:550
  private val controllers_Auth_signupPost85001_route = Route("POST",
    PathPattern(List(StaticPart("signup")))
  )

  // @LINE:552
  private val controllers_Auth_checkYourEmail85002_route = Route("GET",
    PathPattern(List(StaticPart("signup/check-your-email")))
  )

  // @LINE:553
  private val controllers_Auth_fixEmail85003_route = Route("POST",
    PathPattern(List(StaticPart("signup/fix-email")))
  )

  // @LINE:554
  private val controllers_Auth_signupConfirmEmail85004_route = Route("GET",
    PathPattern(List(StaticPart("signup/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:555
  private val controllers_Auth_signupConfirmEmailPost85005_route = Route("POST",
    PathPattern(List(StaticPart("signup/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )


  // @LINE:544
  private val controllers_Auth_login86000_route = Route("GET",
    PathPattern(List(StaticPart("login")))
  )

  // @LINE:545
  private val controllers_Auth_authenticate86001_route = Route("POST",
    PathPattern(List(StaticPart("login")))
  )


  // @LINE:925
  private val controllers_Cms_tos87000_route = Route("GET",
    PathPattern(List(StaticPart("terms-of-service")))
  )


  // @LINE:541
  private val controllers_I18n_select88000_route = Route("POST",
    PathPattern(List(StaticPart("translation/select")))
  )


  // @LINE:28
  private val controllers_Game_bookmark89000_route = Route("POST",
    PathPattern(List(StaticPart("bookmark/"), DynamicPart("gameId", """\w{8}""",false)))
  )


  // @LINE:490
  private val controllers_Game_exportOne90000_route = Route("GET",
    PathPattern(List(StaticPart("game/export/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:491
  private val controllers_Game_exportOne90001_route = Route("GET",
    PathPattern(List(StaticPart("game/export/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:492
  private val controllers_Export_legacyGameThumbnail90002_route = Route("GET",
    PathPattern(List(StaticPart("game/export/png/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".png")))
  )

  // @LINE:493
  private val controllers_Export_gameThumbnail90003_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/thumbnail/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:494
  private val controllers_Export_gif90004_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:495
  private val controllers_Export_gif90005_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/"), DynamicPart("color", """[^/]+""",true), StaticPart("/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )


  // @LINE:881
  private val controllers_Main_mobile91000_route = Route("GET",
    PathPattern(List(StaticPart("mobile")))
  )

  // @LINE:920
  private val controllers_Push_mobileRegister91001_route = Route("POST",
    PathPattern(List(StaticPart("mobile/register/"), DynamicPart("platform", """[^/]+""",true), StaticPart("/"), DynamicPart("deviceId", """[^/]+""",true)))
  )

  // @LINE:921
  private val controllers_Push_mobileUnregister91002_route = Route("POST",
    PathPattern(List(StaticPart("mobile/unregister")))
  )


  // @LINE:845
  private val controllers_Recap_home92000_route = Route("GET",
    PathPattern(List(StaticPart("recap")))
  )

  // @LINE:846
  private val controllers_Recap_user92001_route = Route("GET",
    PathPattern(List(StaticPart("recap/"), DynamicPart("username", """[^/]+""",true)))
  )


  // @LINE:210
  private val controllers_Racer_home93000_route = Route("GET",
    PathPattern(List(StaticPart("racer")))
  )

  // @LINE:211
  private val controllers_Racer_create93001_route = Route("POST",
    PathPattern(List(StaticPart("racer")))
  )

  // @LINE:213
  private val controllers_Racer_show93002_route = Route("GET",
    PathPattern(List(StaticPart("racer/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:214
  private val controllers_Racer_rematch93003_route = Route("GET",
    PathPattern(List(StaticPart("racer/"), DynamicPart("id", """[^/]+""",true), StaticPart("/rematch")))
  )

  // @LINE:215
  private val controllers_Racer_lobby93004_route = Route("POST",
    PathPattern(List(StaticPart("racer/lobby")))
  )


  // @LINE:499
  private val controllers_Fishnet_acquire94000_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/acquire")))
  )

  // @LINE:500
  private val controllers_Fishnet_analysis94001_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/analysis/"), DynamicPart("workId", """\w{8}""",false)))
  )

  // @LINE:501
  private val controllers_Fishnet_abort94002_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/abort/"), DynamicPart("workId", """\w{8}""",false)))
  )

  // @LINE:502
  private val controllers_Fishnet_keyExists94003_route = Route("GET",
    PathPattern(List(StaticPart("fishnet/key/"), DynamicPart("key", """\w{8}""",false)))
  )

  // @LINE:503
  private val controllers_Fishnet_status94004_route = Route("GET",
    PathPattern(List(StaticPart("fishnet/status")))
  )


  // @LINE:20
  private val controllers_Search_index95000_route = Route("GET",
    PathPattern(List(StaticPart("games/search")))
  )

  // @LINE:23
  private val controllers_Game_exportByIds95001_route = Route("POST",
    PathPattern(List(StaticPart("games/export/_ids")))
  )

  // @LINE:25
  private val controllers_Game_exportByUser95002_route = Route("GET",
    PathPattern(List(StaticPart("games/export/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:39
  private val controllers_Tv_games95003_route = Route("GET",
    PathPattern(List(StaticPart("games")))
  )

  // @LINE:40
  private val controllers_Tv_gamesChannel95004_route = Route("GET",
    PathPattern(List(StaticPart("games/"), DynamicPart("chanKey", """[^/]+""",true)))
  )

  // @LINE:41
  private val controllers_Tv_gameChannelReplacement95005_route = Route("GET",
    PathPattern(List(StaticPart("games/"), DynamicPart("chanKey", """[^/]+""",true), StaticPart("/replacement/"), DynamicPart("gameId", """\w{8}""",false)))
  )


  // @LINE:834
  private val controllers_Tutor_home96000_route = Route("GET",
    PathPattern(List(StaticPart("tutor")))
  )

  // @LINE:835
  private val controllers_Tutor_user96001_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:836
  private val controllers_Tutor_refresh96002_route = Route("POST",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/refresh")))
  )

  // @LINE:837
  private val controllers_Tutor_perf96003_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true)))
  )

  // @LINE:838
  private val controllers_Tutor_skills96004_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true), StaticPart("/skill")))
  )

  // @LINE:839
  private val controllers_Tutor_openings96005_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true), StaticPart("/opening")))
  )

  // @LINE:840
  private val controllers_Tutor_opening96006_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true), StaticPart("/opening/"), DynamicPart("color", """[^/]+""",true), StaticPart("/"), DynamicPart("opening", """[^/]+""",true)))
  )

  // @LINE:841
  private val controllers_Tutor_phases96007_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true), StaticPart("/phase")))
  )

  // @LINE:842
  private val controllers_Tutor_time96008_route = Route("GET",
    PathPattern(List(StaticPart("tutor/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("perf", """[^/]+""",true), StaticPart("/time")))
  )


  // @LINE:226
  private val controllers_Study_allDefault97000_route = Route("GET",
    PathPattern(List(StaticPart("study")))
  )

  // @LINE:227
  private val controllers_Study_staffPicks97001_route = Route("GET",
    PathPattern(List(StaticPart("study/staff-picks")))
  )

  // @LINE:228
  private val controllers_Study_all97002_route = Route("GET",
    PathPattern(List(StaticPart("study/all/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:229
  private val controllers_Study_mine97003_route = Route("GET",
    PathPattern(List(StaticPart("study/mine/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:230
  private val controllers_Study_mineMember97004_route = Route("GET",
    PathPattern(List(StaticPart("study/member/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:231
  private val controllers_Study_minePublic97005_route = Route("GET",
    PathPattern(List(StaticPart("study/public/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:232
  private val controllers_Study_minePrivate97006_route = Route("GET",
    PathPattern(List(StaticPart("study/private/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:233
  private val controllers_Study_mineLikes97007_route = Route("GET",
    PathPattern(List(StaticPart("study/likes/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:234
  private val controllers_Study_byOwnerDefault97008_route = Route("GET",
    PathPattern(List(StaticPart("study/by/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:235
  private val controllers_Study_exportPgn97009_route = Route("GET",
    PathPattern(List(StaticPart("study/by/"), DynamicPart("username", """[^/]+""",true), StaticPart("/export.pgn")))
  )

  // @LINE:236
  private val controllers_Study_byOwner97010_route = Route("GET",
    PathPattern(List(StaticPart("study/by/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:237
  private val controllers_Study_search97011_route = Route("GET",
    PathPattern(List(StaticPart("study/search")))
  )

  // @LINE:238
  private val controllers_Study_show97012_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:239
  private val controllers_Study_create97013_route = Route("POST",
    PathPattern(List(StaticPart("study")))
  )

  // @LINE:240
  private val controllers_Study_createAs97014_route = Route("POST",
    PathPattern(List(StaticPart("study/as")))
  )

  // @LINE:241
  private val controllers_Study_pgn97015_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:242
  private val controllers_Study_chapterPgn97016_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:243
  private val controllers_Study_chapterGif97017_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:244
  private val controllers_Study_delete97018_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/delete")))
  )

  // @LINE:245
  private val controllers_Study_cloneStudy97019_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/clone")))
  )

  // @LINE:246
  private val controllers_Study_cloneApply97020_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cloneApply")))
  )

  // @LINE:247
  private val controllers_Study_chapter97021_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:248
  private val controllers_Study_chapterConfig97022_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart("/config")))
  )

  // @LINE:249
  private val controllers_Study_embed97023_route = Route("GET",
    PathPattern(List(StaticPart("study/embed/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:250
  private val controllers_Study_clearChat97024_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/clear-chat")))
  )

  // @LINE:251
  private val controllers_Study_importPgn97025_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/import-pgn")))
  )

  // @LINE:252
  private val controllers_Study_admin97026_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/admin")))
  )

  // @LINE:253
  private val controllers_Study_topics97027_route = Route("GET",
    PathPattern(List(StaticPart("study/topic")))
  )

  // @LINE:254
  private val controllers_Study_setTopics97028_route = Route("POST",
    PathPattern(List(StaticPart("study/topic")))
  )

  // @LINE:255
  private val controllers_Study_byTopic97029_route = Route("GET",
    PathPattern(List(StaticPart("study/topic/"), DynamicPart("topic", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:256
  private val controllers_Study_topicAutocomplete97030_route = Route("GET",
    PathPattern(List(StaticPart("study/topic/autocomplete")))
  )

  // @LINE:257
  private val controllers_Study_glyphs97031_route = Route("GET",
    PathPattern(List(StaticPart("study/glyphs/"), DynamicPart("lang", """[^/]+""",true), StaticPart(".json")))
  )


  // @LINE:335
  private val controllers_Practice_index98000_route = Route("GET",
    PathPattern(List(StaticPart("practice")))
  )

  // @LINE:336
  private val controllers_Practice_chapter98001_route = Route("GET",
    PathPattern(List(StaticPart("practice/load/"), DynamicPart("studyId", """[^/]+""",true), StaticPart("/"), DynamicPart("chapterId", """[^/]+""",true)))
  )

  // @LINE:337
  private val controllers_Practice_config98002_route = Route("GET",
    PathPattern(List(StaticPart("practice/config")))
  )

  // @LINE:338
  private val controllers_Practice_configSave98003_route = Route("POST",
    PathPattern(List(StaticPart("practice/config")))
  )

  // @LINE:339
  private val controllers_Practice_reset98004_route = Route("POST",
    PathPattern(List(StaticPart("practice/reset")))
  )

  // @LINE:340
  private val controllers_Practice_showSection98005_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true)))
  )

  // @LINE:341
  private val controllers_Practice_showStudySlug98006_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true)))
  )

  // @LINE:342
  private val controllers_Practice_show98007_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true), StaticPart("/"), DynamicPart("studyId", """[^/]+""",true)))
  )

  // @LINE:343
  private val controllers_Practice_showChapter98008_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true), StaticPart("/"), DynamicPart("studyId", """[^/]+""",true), StaticPart("/"), DynamicPart("chapterId", """[^/]+""",true)))
  )

  // @LINE:344
  private val controllers_Practice_complete98009_route = Route("POST",
    PathPattern(List(StaticPart("practice/complete/"), DynamicPart("chapterId", """[^/]+""",true), StaticPart("/"), DynamicPart("moves", """[^/]+""",true)))
  )


  // @LINE:514
  private val controllers_Setup_ai99000_route = Route("POST",
    PathPattern(List(StaticPart("setup/ai")))
  )

  // @LINE:515
  private val controllers_Setup_friend99001_route = Route("POST",
    PathPattern(List(StaticPart("setup/friend")))
  )

  // @LINE:516
  private val controllers_Setup_like99002_route = Route("POST",
    PathPattern(List(StaticPart("setup/hook/"), DynamicPart("sri", """[^/]+""",true), StaticPart("/like/"), DynamicPart("gameId", """[^/]+""",true)))
  )

  // @LINE:517
  private val controllers_Setup_hook99003_route = Route("POST",
    PathPattern(List(StaticPart("setup/hook/"), DynamicPart("sri", """[^/]+""",true)))
  )

  // @LINE:518
  private val controllers_Setup_filterForm99004_route = Route("GET",
    PathPattern(List(StaticPart("setup/filter")))
  )

  // @LINE:519
  private val controllers_Setup_validateFen99005_route = Route("GET",
    PathPattern(List(StaticPart("setup/validate-fen")))
  )


  // @LINE:849
  private val controllers_OAuth_authorize100000_route = Route("GET",
    PathPattern(List(StaticPart("oauth")))
  )

  // @LINE:850
  private val controllers_OAuth_legacyTokenApply100001_route = Route("POST",
    PathPattern(List(StaticPart("oauth")))
  )

  // @LINE:851
  private val controllers_OAuth_legacyAuthorize100002_route = Route("GET",
    PathPattern(List(StaticPart("oauth/authorize")))
  )

  // @LINE:852
  private val controllers_OAuth_authorizeApply100003_route = Route("POST",
    PathPattern(List(StaticPart("oauth/authorize")))
  )

  // @LINE:853
  private val controllers_OAuth_revokeClient100004_route = Route("POST",
    PathPattern(List(StaticPart("oauth/revoke-client")))
  )


  // @LINE:556
  private val controllers_Auth_passwordReset101000_route = Route("GET",
    PathPattern(List(StaticPart("password/reset")))
  )

  // @LINE:557
  private val controllers_Auth_passwordResetApply101001_route = Route("POST",
    PathPattern(List(StaticPart("password/reset/send")))
  )

  // @LINE:558
  private val controllers_Auth_passwordResetSent101002_route = Route("GET",
    PathPattern(List(StaticPart("password/reset/sent/"), DynamicPart("email", """[^/]+""",true)))
  )

  // @LINE:559
  private val controllers_Auth_passwordResetConfirm101003_route = Route("GET",
    PathPattern(List(StaticPart("password/reset/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:560
  private val controllers_Auth_passwordResetConfirmApply101004_route = Route("POST",
    PathPattern(List(StaticPart("password/reset/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )


  // @LINE:887
  private val controllers_Main_costs102000_route = Route("GET",
    PathPattern(List(StaticPart("costs")))
  )


  // @LINE:400
  private val controllers_Round_next103000_route = Route("GET",
    PathPattern(List(StaticPart("round-next/"), DynamicPart("gameId", """\w{8}""",false)))
  )


  // @LINE:401
  private val controllers_Round_whatsNext104000_route = Route("GET",
    PathPattern(List(StaticPart("whats-next/"), DynamicPart("fullId", """\w{12}""",false)))
  )


  val pathRouters: Map[String, PartialFunction[RequestHeader, Handler]] = Map(
    
      "notify" -> {
        
          // @LINE:531
          case controllers_Notify_recent0_route(params) =>
            named("Notify.recent") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Notify_68.recent(page)
              }
            }
        
          // @LINE:532
          case controllers_Notify_clear1_route(_) =>
            named("Notify.clear") {
              call { 
                  Notify_68.clear
              }
            }
        
      },
    
      "swag" -> {
        
          // @LINE:883
          case controllers_Main_redirectToSwag1000_route(_) =>
            named("Main.redirectToSwag") {
              call { 
                  Main_19.redirectToSwag
              }
            }
        
      },
    
      "" -> {
        
          // @LINE:4
          case controllers_Lobby_home2000_route(_) =>
            named("Lobby.home") {
              call { 
                  Lobby_59.home
              }
            }
        
          // @LINE:9
          case controllers_Lobby_homeLang2001_route(params) =>
            named("Lobby.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Lobby_59.homeLang(lang)
              }
            }
        
          // @LINE:31
          case controllers_Tv_indexLang2002_route(params) =>
            named("Tv.indexLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Tv_20.indexLang(lang)
              }
            }
        
          // @LINE:121
          case controllers_Ublog_communityLang2003_route(params) =>
            named("Ublog.communityLang") {
              call(params.fromPath[Language]("lang", None), params.fromQuery[Option[BlogQualityFilter]]("filter", Some(None)), params.fromQuery[Int]("page", Some(1))) { (lang, filter, page) =>
                  Ublog_7.communityLang(lang, filter, page)
              }
            }
        
          // @LINE:161
          case controllers_Coordinate_homeLang2004_route(params) =>
            named("Coordinate.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Coordinate_6.homeLang(lang)
              }
            }
        
          // @LINE:190
          case controllers_Puzzle_homeLang2005_route(params) =>
            named("Puzzle.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Puzzle_52.homeLang(lang)
              }
            }
        
          // @LINE:191
          case controllers_Puzzle_themesLang2006_route(params) =>
            named("Puzzle.themesLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Puzzle_52.themesLang(lang)
              }
            }
        
          // @LINE:192
          case controllers_Puzzle_showLang2007_route(params) =>
            named("Puzzle.showLang") {
              call(params.fromPath[Language]("lang", None), params.fromPath[String]("angleOrId", None)) { (lang, angleOrId) =>
                  Puzzle_52.showLang(lang, angleOrId)
              }
            }
        
          // @LINE:198
          case controllers_Puzzle_streakLang2008_route(params) =>
            named("Puzzle.streakLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Puzzle_52.streakLang(lang)
              }
            }
        
          // @LINE:207
          case controllers_Storm_homeLang2009_route(params) =>
            named("Storm.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Storm_39.homeLang(lang)
              }
            }
        
          // @LINE:216
          case controllers_Racer_homeLang2010_route(params) =>
            named("Racer.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Racer_49.homeLang(lang)
              }
            }
        
          // @LINE:258
          case controllers_Study_homeLang2011_route(params) =>
            named("Study.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Study_63.homeLang(lang)
              }
            }
        
          // @LINE:309
          case controllers_RelayTour_indexLang2012_route(params) =>
            named("RelayTour.indexLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  RelayTour_42.indexLang(lang)
              }
            }
        
          // @LINE:315
          case controllers_Learn_indexLang2013_route(params) =>
            named("Learn.indexLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Learn_45.indexLang(lang)
              }
            }
        
          // @LINE:375
          case controllers_Round_watcher2014_route(params) =>
            named("Round.watcher") {
              call(params.fromPath[GameId]("gameId", None), Param[Color]("color", Right(Color.white))) { (gameId, color) =>
                  Round_34.watcher(gameId, color)
              }
            }
        
          // @LINE:376
          case controllers_Round_watcher2015_route(params) =>
            named("Round.watcher") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Round_34.watcher(gameId, color)
              }
            }
        
          // @LINE:377
          case controllers_Round_player2016_route(params) =>
            named("Round.player") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  Round_34.player(fullId)
              }
            }
        
          // @LINE:378
          case controllers_Round_sides2017_route(params) =>
            named("Round.sides") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Round_34.sides(gameId, color)
              }
            }
        
          // @LINE:379
          case controllers_Round_continue2018_route(params) =>
            named("Round.continue") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[String]("mode", None)) { (gameId, mode) =>
                  Round_34.continue(gameId, mode)
              }
            }
        
          // @LINE:380
          case controllers_Round_readNote2019_route(params) =>
            named("Round.readNote") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Round_34.readNote(gameId)
              }
            }
        
          // @LINE:381
          case controllers_Round_writeNote2020_route(params) =>
            named("Round.writeNote") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Round_34.writeNote(gameId)
              }
            }
        
          // @LINE:382
          case controllers_Round_mini2021_route(params) =>
            named("Round.mini") {
              call(params.fromPath[GameId]("gameId", None), Param[Color]("color", Right(Color.white))) { (gameId, color) =>
                  Round_34.mini(gameId, color)
              }
            }
        
          // @LINE:383
          case controllers_Round_mini2022_route(params) =>
            named("Round.mini") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Round_34.mini(gameId, color)
              }
            }
        
          // @LINE:384
          case controllers_Round_miniFullId2023_route(params) =>
            named("Round.miniFullId") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  Round_34.miniFullId(fullId)
              }
            }
        
          // @LINE:385
          case controllers_Editor_game2024_route(params) =>
            named("Editor.game") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Editor_11.game(gameId)
              }
            }
        
          // @LINE:386
          case controllers_UserAnalysis_game2025_route(params) =>
            named("UserAnalysis.game") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  UserAnalysis_44.game(gameId, color)
              }
            }
        
          // @LINE:387
          case controllers_UserAnalysis_forecastsGet2026_route(params) =>
            named("UserAnalysis.forecastsGet") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  UserAnalysis_44.forecastsGet(fullId)
              }
            }
        
          // @LINE:388
          case controllers_UserAnalysis_forecastsPost2027_route(params) =>
            named("UserAnalysis.forecastsPost") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  UserAnalysis_44.forecastsPost(fullId)
              }
            }
        
          // @LINE:389
          case controllers_UserAnalysis_forecastsOnMyTurn2028_route(params) =>
            named("UserAnalysis.forecastsOnMyTurn") {
              call(params.fromPath[GameFullId]("fullId", None), params.fromPath[String]("uci", None)) { (fullId, uci) =>
                  UserAnalysis_44.forecastsOnMyTurn(fullId, uci)
              }
            }
        
          // @LINE:390
          case controllers_Round_resign2029_route(params) =>
            named("Round.resign") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  Round_34.resign(fullId)
              }
            }
        
          // @LINE:398
          case controllers_Game_delete2030_route(params) =>
            named("Game.delete") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Game_8.delete(gameId)
              }
            }
        
          // @LINE:431
          case controllers_Tournament_homeLang2031_route(params) =>
            named("Tournament.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Tournament_5.homeLang(lang)
              }
            }
        
          // @LINE:455
          case controllers_Swiss_homeLang2032_route(params) =>
            named("Swiss.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Swiss_32.homeLang(lang)
              }
            }
        
          // @LINE:472
          case controllers_Simul_homeLang2033_route(params) =>
            named("Simul.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Simul_56.homeLang(lang)
              }
            }
        
          // @LINE:488
          case controllers_Analyse_requestAnalysis2034_route(params) =>
            named("Analyse.requestAnalysis") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Analyse_28.requestAnalysis(gameId)
              }
            }
        
          // @LINE:546
          case controllers_Auth_loginLang2035_route(params) =>
            named("Auth.loginLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Auth_15.loginLang(lang)
              }
            }
        
          // @LINE:551
          case controllers_Auth_signupLang2036_route(params) =>
            named("Auth.signupLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Auth_15.signupLang(lang)
              }
            }
        
          // @LINE:673
          case controllers_Coach_homeLang2037_route(params) =>
            named("Coach.homeLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Coach_60.homeLang(lang)
              }
            }
        
          // @LINE:884
          case controllers_Main_mobileLang2038_route(params) =>
            named("Main.mobileLang") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Main_19.mobileLang(lang)
              }
            }
        
          // @LINE:926
          case controllers_Cms_menuPage2039_route(params) =>
            named("Cms.menuPage") {
              call(params.fromPath[CmsPageKey]("key", None)) { (key) =>
                  Cms_4.menuPage(key)
              }
            }
        
          // @LINE:955
          case controllers_User_redirect2040_route(params) =>
            named("User.redirect") {
              call(params.fromPath[String]("path", None)) { (path) =>
                  User_23.redirect(path)
              }
            }
        
      },
    
      "ublog" -> {
        
          // @LINE:129
          case controllers_Ublog_discuss3000_route(params) =>
            named("Ublog.discuss") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.discuss(id)
              }
            }
        
          // @LINE:130
          case controllers_Ublog_redirect3001_route(params) =>
            named("Ublog.redirect") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.redirect(id)
              }
            }
        
          // @LINE:131
          case controllers_Ublog_edit3002_route(params) =>
            named("Ublog.edit") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.edit(id)
              }
            }
        
          // @LINE:132
          case controllers_Ublog_update3003_route(params) =>
            named("Ublog.update") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.update(id)
              }
            }
        
          // @LINE:133
          case controllers_Ublog_delete3004_route(params) =>
            named("Ublog.delete") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.delete(id)
              }
            }
        
          // @LINE:134
          case controllers_Ublog_like3005_route(params) =>
            named("Ublog.like") {
              call(params.fromPath[UblogPostId]("id", None), params.fromQuery[Boolean]("v", None)) { (id, v) =>
                  Ublog_7.like(id, v)
              }
            }
        
          // @LINE:135
          case controllers_Ublog_modBlog3006_route(params) =>
            named("Ublog.modBlog") {
              call(params.fromPath[String]("blogId", None)) { (blogId) =>
                  Ublog_7.modBlog(blogId)
              }
            }
        
          // @LINE:136
          case controllers_Ublog_modPost3007_route(params) =>
            named("Ublog.modPost") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.modPost(id)
              }
            }
        
          // @LINE:137
          case controllers_Ublog_modPull3008_route(params) =>
            named("Ublog.modPull") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.modPull(id)
              }
            }
        
          // @LINE:138
          case controllers_Ublog_modShowCarousel3009_route(_) =>
            named("Ublog.modShowCarousel") {
              call { 
                  Ublog_7.modShowCarousel
              }
            }
        
      },
    
      "github" -> {
        
          // @LINE:891
          case controllers_Github_secretScanning4000_route(_) =>
            named("Github.secretScanning") {
              call { 
                  Github_69.secretScanning
              }
            }
        
      },
    
      "challenge" -> {
        
          // @LINE:522
          case controllers_Challenge_all5000_route(_) =>
            named("Challenge.all") {
              call { 
                  Challenge_35.all
              }
            }
        
          // @LINE:523
          case controllers_Challenge_show5001_route(params) =>
            named("Challenge.show") {
              call(params.fromPath[ChallengeId]("id", None), params.fromQuery[Option[Color]]("color", Some(None))) { (id, color) =>
                  Challenge_35.show(id, color)
              }
            }
        
          // @LINE:524
          case controllers_Challenge_accept5002_route(params) =>
            named("Challenge.accept") {
              call(params.fromPath[ChallengeId]("id", None), params.fromQuery[Option[Color]]("color", Some(None))) { (id, color) =>
                  Challenge_35.accept(id, color)
              }
            }
        
          // @LINE:525
          case controllers_Challenge_decline5003_route(params) =>
            named("Challenge.decline") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.decline(id)
              }
            }
        
          // @LINE:526
          case controllers_Challenge_cancel5004_route(params) =>
            named("Challenge.cancel") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.cancel(id)
              }
            }
        
          // @LINE:527
          case controllers_Challenge_toFriend5005_route(params) =>
            named("Challenge.toFriend") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.toFriend(id)
              }
            }
        
          // @LINE:528
          case controllers_Challenge_offerRematchForGame5006_route(params) =>
            named("Challenge.offerRematchForGame") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  Challenge_35.offerRematchForGame(id)
              }
            }
        
      },
    
      "logout" -> {
        
          // @LINE:547
          case controllers_Auth_logoutGet6000_route(_) =>
            named("Auth.logoutGet") {
              call { 
                  Auth_15.logoutGet
              }
            }
        
          // @LINE:548
          case controllers_Auth_logout6001_route(_) =>
            named("Auth.logout") {
              call { 
                  Auth_15.logout
              }
            }
        
      },
    
      "feed.atom" -> {
        
          // @LINE:148
          case controllers_Feed_atom7000_route(_) =>
            named("Feed.atom") {
              call { 
                  Feed_12.atom
              }
            }
        
      },
    
      "irwin" -> {
        
          // @LINE:627
          case controllers_Irwin_dashboard8000_route(_) =>
            named("Irwin.dashboard") {
              call { 
                  Irwin_50.dashboard
              }
            }
        
          // @LINE:628
          case controllers_Irwin_saveReport8001_route(_) =>
            named("Irwin.saveReport") {
              call { 
                  Irwin_50.saveReport
              }
            }
        
      },
    
      "source" -> {
        
          // @LINE:929
          case controllers_Cms_source9000_route(_) =>
            named("Cms.source") {
              call { 
                  Cms_4.source
              }
            }
        
      },
    
      "assets" -> {
        
          // @LINE:949
          case controllers_Main_devAsset10000_route(params) =>
            named("Main.devAsset") {
              call(params.fromPath[String]("v", None), Param[String]("path", Right("public")), params.fromPath[String]("file", None)) { (v, path, file) =>
                  Main_19.devAsset(v, path, file)
              }
            }
        
          // @LINE:950
          case controllers_ExternalAssets_at10001_route(params) =>
            named("ExternalAssets.at") {
              call(Param[String]("path", Right("public")), params.fromPath[String]("file", None)) { (path, file) =>
                  ExternalAssets_48.at(path, file)
              }
            }
        
      },
    
      "learn" -> {
        
          // @LINE:312
          case controllers_Learn_index11000_route(_) =>
            named("Learn.index") {
              call { 
                  Learn_45.index
              }
            }
        
          // @LINE:313
          case controllers_Learn_score11001_route(_) =>
            named("Learn.score") {
              call { 
                  Learn_45.score
              }
            }
        
          // @LINE:314
          case controllers_Learn_reset11002_route(_) =>
            named("Learn.reset") {
              call { 
                  Learn_45.reset
              }
            }
        
      },
    
      "editor.json" -> {
        
          // @LINE:681
          case controllers_Editor_data12000_route(_) =>
            named("Editor.data") {
              call { 
                  Editor_11.data
              }
            }
        
      },
    
      "kaladin" -> {
        
          // @LINE:632
          case controllers_Irwin_kaladin13000_route(_) =>
            named("Irwin.kaladin") {
              call { 
                  Irwin_50.kaladin
              }
            }
        
      },
    
      "mod" -> {
        
          // @LINE:570
          case controllers_Mod_alt14000_route(params) =>
            named("Mod.alt") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.alt(username, v)
              }
            }
        
          // @LINE:571
          case controllers_Mod_altMany14001_route(_) =>
            named("Mod.altMany") {
              call { 
                  Mod_62.altMany
              }
            }
        
          // @LINE:572
          case controllers_Mod_engine14002_route(params) =>
            named("Mod.engine") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.engine(username, v)
              }
            }
        
          // @LINE:573
          case controllers_Mod_booster14003_route(params) =>
            named("Mod.booster") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.booster(username, v)
              }
            }
        
          // @LINE:574
          case controllers_Mod_troll14004_route(params) =>
            named("Mod.troll") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.troll(username, v)
              }
            }
        
          // @LINE:575
          case controllers_Mod_isolate14005_route(params) =>
            named("Mod.isolate") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.isolate(username, v)
              }
            }
        
          // @LINE:576
          case controllers_Mod_deletePmsAndChats14006_route(params) =>
            named("Mod.deletePmsAndChats") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.deletePmsAndChats(username)
              }
            }
        
          // @LINE:577
          case controllers_Mod_warn14007_route(params) =>
            named("Mod.warn") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[String]("subject", None)) { (username, subject) =>
                  Mod_62.warn(username, subject)
              }
            }
        
          // @LINE:578
          case controllers_Mod_kid14008_route(params) =>
            named("Mod.kid") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Boolean]("v", None)) { (username, v) =>
                  Mod_62.kid(username, v)
              }
            }
        
          // @LINE:579
          case controllers_Mod_disableTwoFactor14009_route(params) =>
            named("Mod.disableTwoFactor") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.disableTwoFactor(username)
              }
            }
        
          // @LINE:580
          case controllers_Mod_closeAccount14010_route(params) =>
            named("Mod.closeAccount") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.closeAccount(username)
              }
            }
        
          // @LINE:581
          case controllers_Mod_reopenAccount14011_route(params) =>
            named("Mod.reopenAccount") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.reopenAccount(username)
              }
            }
        
          // @LINE:582
          case controllers_Mod_setTitle14012_route(params) =>
            named("Mod.setTitle") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.setTitle(username)
              }
            }
        
          // @LINE:583
          case controllers_Mod_spontaneousInquiry14013_route(params) =>
            named("Mod.spontaneousInquiry") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.spontaneousInquiry(username)
              }
            }
        
          // @LINE:584
          case controllers_Mod_communicationPublic14014_route(params) =>
            named("Mod.communicationPublic") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.communicationPublic(username)
              }
            }
        
          // @LINE:585
          case controllers_Mod_communicationPrivate14015_route(params) =>
            named("Mod.communicationPrivate") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.communicationPrivate(username)
              }
            }
        
          // @LINE:586
          case controllers_Mod_fullCommsExport14016_route(params) =>
            named("Mod.fullCommsExport") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.fullCommsExport(username)
              }
            }
        
          // @LINE:587
          case controllers_Mod_rankban14017_route(params) =>
            named("Mod.rankban") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.rankban(username, v)
              }
            }
        
          // @LINE:588
          case controllers_Mod_arenaBan14018_route(params) =>
            named("Mod.arenaBan") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.arenaBan(username, v)
              }
            }
        
          // @LINE:589
          case controllers_Mod_prizeban14019_route(params) =>
            named("Mod.prizeban") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.prizeban(username, v)
              }
            }
        
          // @LINE:590
          case controllers_Mod_reportban14020_route(params) =>
            named("Mod.reportban") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
                  Mod_62.reportban(username, v)
              }
            }
        
          // @LINE:591
          case controllers_Mod_blankPassword14021_route(params) =>
            named("Mod.blankPassword") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.blankPassword(username)
              }
            }
        
          // @LINE:592
          case controllers_Mod_freePatron14022_route(params) =>
            named("Mod.freePatron") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.freePatron(username)
              }
            }
        
          // @LINE:593
          case controllers_Mod_impersonate14023_route(params) =>
            named("Mod.impersonate") {
              call(params.fromPath[String]("username", None)) { (username) =>
                  Mod_62.impersonate(username)
              }
            }
        
          // @LINE:594
          case controllers_GameMod_index14024_route(params) =>
            named("GameMod.index") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  GameMod_13.index(username)
              }
            }
        
          // @LINE:595
          case controllers_GameMod_post14025_route(params) =>
            named("GameMod.post") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  GameMod_13.post(username)
              }
            }
        
          // @LINE:596
          case controllers_Mod_table14026_route(_) =>
            named("Mod.table") {
              call { 
                  Mod_62.table
              }
            }
        
          // @LINE:597
          case controllers_Mod_log14027_route(params) =>
            named("Mod.log") {
              call(params.fromQuery[Option[UserStr]]("mod", Some(None)), params.fromQuery[Option[String]]("id", Some(None))) { (mod, id) =>
                  Mod_62.log(mod, id)
              }
            }
        
          // @LINE:598
          case controllers_Mod_refreshUserAssess14028_route(params) =>
            named("Mod.refreshUserAssess") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.refreshUserAssess(username)
              }
            }
        
          // @LINE:599
          case controllers_Mod_setEmail14029_route(params) =>
            named("Mod.setEmail") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.setEmail(username)
              }
            }
        
          // @LINE:600
          case controllers_Mod_inquiryToZulip14030_route(_) =>
            named("Mod.inquiryToZulip") {
              call { 
                  Mod_62.inquiryToZulip
              }
            }
        
          // @LINE:601
          case controllers_Mod_createNameCloseVote14031_route(params) =>
            named("Mod.createNameCloseVote") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.createNameCloseVote(username)
              }
            }
        
          // @LINE:602
          case controllers_Mod_askUsertableCheck14032_route(params) =>
            named("Mod.askUsertableCheck") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.askUsertableCheck(username)
              }
            }
        
          // @LINE:603
          case controllers_Mod_gamify14033_route(_) =>
            named("Mod.gamify") {
              call { 
                  Mod_62.gamify
              }
            }
        
          // @LINE:604
          case controllers_Mod_gamifyPeriod14034_route(params) =>
            named("Mod.gamifyPeriod") {
              call(params.fromPath[String]("period", None)) { (period) =>
                  Mod_62.gamifyPeriod(period)
              }
            }
        
          // @LINE:605
          case controllers_Mod_activity14035_route(_) =>
            named("Mod.activity") {
              call { 
                  Mod_62.activity
              }
            }
        
          // @LINE:606
          case controllers_Mod_activityOf14036_route(params) =>
            named("Mod.activityOf") {
              call(params.fromPath[String]("who", None), params.fromPath[String]("period", None)) { (who, period) =>
                  Mod_62.activityOf(who, period)
              }
            }
        
          // @LINE:607
          case controllers_Mod_queues14037_route(params) =>
            named("Mod.queues") {
              call(params.fromPath[String]("period", None)) { (period) =>
                  Mod_62.queues(period)
              }
            }
        
          // @LINE:608
          case controllers_Mod_search14038_route(_) =>
            named("Mod.search") {
              call { 
                  Mod_62.search
              }
            }
        
          // @LINE:609
          case controllers_Mod_notes14039_route(params) =>
            named("Mod.notes") {
              call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[String]("q", Some(""))) { (page, q) =>
                  Mod_62.notes(page, q)
              }
            }
        
          // @LINE:610
          case controllers_Mod_chatUser14040_route(params) =>
            named("Mod.chatUser") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.chatUser(username)
              }
            }
        
          // @LINE:611
          case controllers_Mod_permissions14041_route(params) =>
            named("Mod.permissions") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.permissions(username)
              }
            }
        
          // @LINE:612
          case controllers_Mod_savePermissions14042_route(params) =>
            named("Mod.savePermissions") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.savePermissions(username)
              }
            }
        
          // @LINE:613
          case controllers_Mod_gdprErase14043_route(params) =>
            named("Mod.gdprErase") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Mod_62.gdprErase(username)
              }
            }
        
          // @LINE:614
          case controllers_Mod_publicChat14044_route(_) =>
            named("Mod.publicChat") {
              call { 
                  Mod_62.publicChat
              }
            }
        
          // @LINE:615
          case controllers_Mod_publicChatTimeout14045_route(_) =>
            named("Mod.publicChatTimeout") {
              call { 
                  Mod_62.publicChatTimeout
              }
            }
        
          // @LINE:616
          case controllers_Mod_emailConfirm14046_route(_) =>
            named("Mod.emailConfirm") {
              call { 
                  Mod_62.emailConfirm
              }
            }
        
          // @LINE:617
          case controllers_Mod_print14047_route(params) =>
            named("Mod.print") {
              call(params.fromPath[String]("fh", None)) { (fh) =>
                  Mod_62.print(fh)
              }
            }
        
          // @LINE:618
          case controllers_Mod_printBan14048_route(params) =>
            named("Mod.printBan") {
              call(params.fromPath[Boolean]("v", None), params.fromPath[String]("fh", None)) { (v, fh) =>
                  Mod_62.printBan(v, fh)
              }
            }
        
          // @LINE:619
          case controllers_Mod_singleIp14049_route(params) =>
            named("Mod.singleIp") {
              call(params.fromPath[String]("ip", None)) { (ip) =>
                  Mod_62.singleIp(ip)
              }
            }
        
          // @LINE:620
          case controllers_Mod_singleIpBan14050_route(params) =>
            named("Mod.singleIpBan") {
              call(params.fromPath[Boolean]("v", None), params.fromPath[String]("ip", None)) { (v, ip) =>
                  Mod_62.singleIpBan(v, ip)
              }
            }
        
          // @LINE:621
          case controllers_Mod_presets14051_route(params) =>
            named("Mod.presets") {
              call(params.fromPath[String]("group", None)) { (group) =>
                  Mod_62.presets(group)
              }
            }
        
          // @LINE:622
          case controllers_Mod_presetsUpdate14052_route(params) =>
            named("Mod.presetsUpdate") {
              call(params.fromPath[String]("group", None)) { (group) =>
                  Mod_62.presetsUpdate(group)
              }
            }
        
      },
    
      "paste" -> {
        
          // @LINE:676
          case controllers_Importer_importGame15000_route(_) =>
            named("Importer.importGame") {
              call { 
                  Importer_16.importGame
              }
            }
        
      },
    
      "auth" -> {
        
          // @LINE:561
          case controllers_Auth_setFingerPrint16000_route(params) =>
            named("Auth.setFingerPrint") {
              call(params.fromPath[String]("fp", None), params.fromPath[Int]("ms", None)) { (fp, ms) =>
                  Auth_15.setFingerPrint(fp, ms)
              }
            }
        
          // @LINE:562
          case controllers_Auth_makeLoginToken16001_route(_) =>
            named("Auth.makeLoginToken") {
              call { 
                  Auth_15.makeLoginToken
              }
            }
        
          // @LINE:563
          case controllers_Auth_loginWithToken16002_route(params) =>
            named("Auth.loginWithToken") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Auth_15.loginWithToken(token)
              }
            }
        
          // @LINE:564
          case controllers_Auth_loginWithTokenPost16003_route(params) =>
            named("Auth.loginWithTokenPost") {
              call(params.fromPath[String]("token", None), params.fromQuery[Option[String]]("referrer", None)) { (token, referrer) =>
                  Auth_15.loginWithTokenPost(token, referrer)
              }
            }
        
          // @LINE:565
          case controllers_Auth_magicLink16004_route(_) =>
            named("Auth.magicLink") {
              call { 
                  Auth_15.magicLink
              }
            }
        
          // @LINE:566
          case controllers_Auth_magicLinkApply16005_route(_) =>
            named("Auth.magicLinkApply") {
              call { 
                  Auth_15.magicLinkApply
              }
            }
        
          // @LINE:567
          case controllers_Auth_magicLinkSent16006_route(_) =>
            named("Auth.magicLinkSent") {
              call { 
                  Auth_15.magicLinkSent
              }
            }
        
      },
    
      "inbox" -> {
        
          // @LINE:655
          case controllers_Msg_compatCreate17000_route(_) =>
            named("Msg.compatCreate") {
              call { 
                  Msg_41.compatCreate
              }
            }
        
          // @LINE:657
          case controllers_Msg_home17001_route(_) =>
            named("Msg.home") {
              call { 
                  Msg_41.home
              }
            }
        
          // @LINE:658
          case controllers_Msg_search17002_route(params) =>
            named("Msg.search") {
              call(params.fromQuery[String]("q", None)) { (q) =>
                  Msg_41.search(q)
              }
            }
        
          // @LINE:659
          case controllers_Msg_unreadCount17003_route(_) =>
            named("Msg.unreadCount") {
              call { 
                  Msg_41.unreadCount
              }
            }
        
          // @LINE:660
          case controllers_Msg_convo17004_route(params) =>
            named("Msg.convo") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Option[Long]]("before", Some(None))) { (username, before) =>
                  Msg_41.convo(username, before)
              }
            }
        
          // @LINE:661
          case controllers_Msg_convoDelete17005_route(params) =>
            named("Msg.convoDelete") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Msg_41.convoDelete(username)
              }
            }
        
          // @LINE:663
          case controllers_Msg_apiPost17006_route(params) =>
            named("Msg.apiPost") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Msg_41.apiPost(username)
              }
            }
        
          // @LINE:664
          case controllers_Msg_convoDelete17007_route(params) =>
            named("Msg.convoDelete") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Msg_41.convoDelete(username)
              }
            }
        
      },
    
      "faq" -> {
        
          // @LINE:928
          case controllers_Main_faq18000_route(_) =>
            named("Main.faq") {
              call { 
                  Main_19.faq
              }
            }
        
      },
    
      "event" -> {
        
          // @LINE:864
          case controllers_Event_show19000_route(params) =>
            named("Event.show") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Event_29.show(id)
              }
            }
        
          // @LINE:865
          case controllers_Event_manager19001_route(_) =>
            named("Event.manager") {
              call { 
                  Event_29.manager
              }
            }
        
          // @LINE:866
          case controllers_Event_edit19002_route(params) =>
            named("Event.edit") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Event_29.edit(id)
              }
            }
        
          // @LINE:867
          case controllers_Event_update19003_route(params) =>
            named("Event.update") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Event_29.update(id)
              }
            }
        
          // @LINE:868
          case controllers_Event_cloneE19004_route(params) =>
            named("Event.cloneE") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Event_29.cloneE(id)
              }
            }
        
          // @LINE:869
          case controllers_Event_form19005_route(_) =>
            named("Event.form") {
              call { 
                  Event_29.form
              }
            }
        
          // @LINE:870
          case controllers_Event_create19006_route(_) =>
            named("Event.create") {
              call { 
                  Event_29.create
              }
            }
        
      },
    
      "verify-title" -> {
        
          // @LINE:893
          case controllers_TitleVerify_index20000_route(_) =>
            named("TitleVerify.index") {
              call { 
                  TitleVerify_0.index
              }
            }
        
          // @LINE:894
          case controllers_TitleVerify_form20001_route(_) =>
            named("TitleVerify.form") {
              call { 
                  TitleVerify_0.form
              }
            }
        
          // @LINE:895
          case controllers_TitleVerify_create20002_route(_) =>
            named("TitleVerify.create") {
              call { 
                  TitleVerify_0.create
              }
            }
        
          // @LINE:896
          case controllers_TitleVerify_queue20003_route(_) =>
            named("TitleVerify.queue") {
              call { 
                  TitleVerify_0.queue
              }
            }
        
          // @LINE:897
          case controllers_TitleVerify_show20004_route(params) =>
            named("TitleVerify.show") {
              call(params.fromPath[TitleRequestId]("id", None)) { (id) =>
                  TitleVerify_0.show(id)
              }
            }
        
          // @LINE:898
          case controllers_TitleVerify_update20005_route(params) =>
            named("TitleVerify.update") {
              call(params.fromPath[TitleRequestId]("id", None)) { (id) =>
                  TitleVerify_0.update(id)
              }
            }
        
          // @LINE:899
          case controllers_TitleVerify_cancel20006_route(params) =>
            named("TitleVerify.cancel") {
              call(params.fromPath[TitleRequestId]("id", None)) { (id) =>
                  TitleVerify_0.cancel(id)
              }
            }
        
          // @LINE:900
          case controllers_TitleVerify_process20007_route(params) =>
            named("TitleVerify.process") {
              call(params.fromPath[TitleRequestId]("id", None)) { (id) =>
                  TitleVerify_0.process(id)
              }
            }
        
      },
    
      "streak" -> {
        
          // @LINE:195
          case controllers_Puzzle_streak21000_route(_) =>
            named("Puzzle.streak") {
              call { 
                  Puzzle_52.streak
              }
            }
        
      },
    
      "bots" -> {
        
          // @LINE:365
          case controllers_JsBot_index22000_route(_) =>
            named("JsBot.index") {
              call { 
                  JsBot_40.index
              }
            }
        
          // @LINE:366
          case controllers_JsBot_assetKeys22001_route(_) =>
            named("JsBot.assetKeys") {
              call { 
                  JsBot_40.assetKeys
              }
            }
        
          // @LINE:367
          case controllers_JsBot_devIndex22002_route(_) =>
            named("JsBot.devIndex") {
              call { 
                  JsBot_40.devIndex
              }
            }
        
          // @LINE:368
          case controllers_JsBot_devBotHistory22003_route(params) =>
            named("JsBot.devBotHistory") {
              call(params.fromQuery[Option[UserStr]]("id", None)) { (id) =>
                  JsBot_40.devBotHistory(id)
              }
            }
        
          // @LINE:369
          case controllers_JsBot_devPostBot22004_route(_) =>
            named("JsBot.devPostBot") {
              call { 
                  JsBot_40.devPostBot
              }
            }
        
          // @LINE:370
          case controllers_JsBot_devAssets22005_route(_) =>
            named("JsBot.devAssets") {
              call { 
                  JsBot_40.devAssets
              }
            }
        
          // @LINE:371
          case controllers_JsBot_devPostAsset22006_route(params) =>
            named("JsBot.devPostAsset") {
              call(params.fromPath[String]("tpe", None), params.fromPath[String]("key", None)) { (tpe, key) =>
                  JsBot_40.devPostAsset(tpe, key)
              }
            }
        
          // @LINE:372
          case controllers_JsBot_devNameAsset22007_route(params) =>
            named("JsBot.devNameAsset") {
              call(params.fromPath[String]("key", None), params.fromPath[String]("name", None)) { (key, name) =>
                  JsBot_40.devNameAsset(key, name)
              }
            }
        
      },
    
      "storm" -> {
        
          // @LINE:201
          case controllers_Storm_home23000_route(_) =>
            named("Storm.home") {
              call { 
                  Storm_39.home
              }
            }
        
          // @LINE:202
          case controllers_Storm_record23001_route(_) =>
            named("Storm.record") {
              call { 
                  Storm_39.record
              }
            }
        
          // @LINE:203
          case controllers_Storm_dashboard23002_route(params) =>
            named("Storm.dashboard") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Storm_39.dashboard(page)
              }
            }
        
          // @LINE:204
          case controllers_Storm_dashboardOf23003_route(params) =>
            named("Storm.dashboardOf") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Storm_39.dashboardOf(username, page)
              }
            }
        
      },
    
      "features" -> {
        
          // @LINE:332
          case controllers_Plan_features24000_route(_) =>
            named("Plan.features") {
              call { 
                  Plan_46.features
              }
            }
        
      },
    
      "run" -> {
        
          // @LINE:904
          case controllers_Main_captchaCheck25000_route(params) =>
            named("Main.captchaCheck") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  Main_19.captchaCheck(id)
              }
            }
        
          // @LINE:905
          case controllers_Main_temporarilyDisabled25001_route(_) =>
            named("Main.temporarilyDisabled") {
              call(Param[String]("path", Right(""))) { (path) =>
                  Main_19.temporarilyDisabled(path)
              }
            }
        
          // @LINE:906
          case controllers_Main_temporarilyDisabled25002_route(params) =>
            named("Main.temporarilyDisabled") {
              call(params.fromPath[String]("path", None)) { (path) =>
                  Main_19.temporarilyDisabled(path)
              }
            }
        
          // @LINE:907
          case controllers_Main_externalLink25003_route(params) =>
            named("Main.externalLink") {
              call(params.fromPath[String]("tag", None)) { (tag) =>
                  Main_19.externalLink(tag)
              }
            }
        
          // @LINE:908
          case controllers_Main_toggleBlindMode25004_route(_) =>
            named("Main.toggleBlindMode") {
              call { 
                  Main_19.toggleBlindMode
              }
            }
        
          // @LINE:909
          case controllers_Dev_command25005_route(_) =>
            named("Dev.command") {
              call { 
                  Dev_37.command
              }
            }
        
      },
    
      "streamer" -> {
        
          // @LINE:347
          case controllers_Streamer_index26000_route(params) =>
            named("Streamer.index") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Streamer_27.index(page)
              }
            }
        
          // @LINE:353
          case controllers_Main_movedPermanently26001_route(_) =>
            named("Main.movedPermanently") {
              call(Param[String]("to", Right("/api/streamer/live"))) { (to) =>
                  Main_19.movedPermanently(to)
              }
            }
        
          // @LINE:354
          case controllers_Streamer_edit26002_route(_) =>
            named("Streamer.edit") {
              call { 
                  Streamer_27.edit
              }
            }
        
          // @LINE:355
          case controllers_Streamer_create26003_route(_) =>
            named("Streamer.create") {
              call { 
                  Streamer_27.create
              }
            }
        
          // @LINE:356
          case controllers_Streamer_editApply26004_route(_) =>
            named("Streamer.editApply") {
              call { 
                  Streamer_27.editApply
              }
            }
        
          // @LINE:357
          case controllers_Streamer_subscribe26005_route(params) =>
            named("Streamer.subscribe") {
              call(params.fromPath[UserStr]("streamer", None), params.fromQuery[Boolean]("set", Some(true))) { (streamer, set) =>
                  Streamer_27.subscribe(streamer, set)
              }
            }
        
          // @LINE:359
          case controllers_Streamer_show26006_route(params) =>
            named("Streamer.show") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Streamer_27.show(username)
              }
            }
        
          // @LINE:360
          case controllers_Streamer_redirect26007_route(params) =>
            named("Streamer.redirect") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Streamer_27.redirect(username)
              }
            }
        
          // @LINE:361
          case controllers_Streamer_checkOnline26008_route(params) =>
            named("Streamer.checkOnline") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Streamer_27.checkOnline(username)
              }
            }
        
      },
    
      "page" -> {
        
          // @LINE:931
          case controllers_Cms_lonePage27000_route(params) =>
            named("Cms.lonePage") {
              call(params.fromPath[CmsPageKey]("key", None)) { (key) =>
                  Cms_4.lonePage(key)
              }
            }
        
      },
    
      "dgt" -> {
        
          // @LINE:942
          case controllers_DgtCtrl_index28000_route(_) =>
            named("DgtCtrl.index") {
              call { 
                  DgtCtrl_38.index
              }
            }
        
          // @LINE:943
          case controllers_DgtCtrl_play28001_route(_) =>
            named("DgtCtrl.play") {
              call { 
                  DgtCtrl_38.play
              }
            }
        
          // @LINE:944
          case controllers_DgtCtrl_config28002_route(_) =>
            named("DgtCtrl.config") {
              call { 
                  DgtCtrl_38.config
              }
            }
        
          // @LINE:945
          case controllers_DgtCtrl_generateToken28003_route(_) =>
            named("DgtCtrl.generateToken") {
              call { 
                  DgtCtrl_38.generateToken
              }
            }
        
      },
    
      "lag" -> {
        
          // @LINE:885
          case controllers_Main_lag29000_route(_) =>
            named("Main.lag") {
              call { 
                  Main_19.lag
              }
            }
        
      },
    
      "stat" -> {
        
          // @LINE:697
          case controllers_User_ratingDistribution30000_route(params) =>
            named("User.ratingDistribution") {
              call(params.fromPath[PerfKey]("perf", None), params.fromQuery[Option[UserStr]]("username", Some(None))) { (perf, username) =>
                  User_23.ratingDistribution(perf, username)
              }
            }
        
      },
    
      "push" -> {
        
          // @LINE:922
          case controllers_Push_webSubscribe31000_route(_) =>
            named("Push.webSubscribe") {
              call { 
                  Push_26.webSubscribe
              }
            }
        
      },
    
      "fide" -> {
        
          // @LINE:99
          case controllers_Fide_index32000_route(params) =>
            named("Fide.index") {
              call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[Option[String]]("q", Some(None))) { (page, q) =>
                  Fide_36.index(page, q)
              }
            }
        
          // @LINE:100
          case controllers_Fide_federations32001_route(params) =>
            named("Fide.federations") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Fide_36.federations(page)
              }
            }
        
          // @LINE:101
          case controllers_Fide_federation32002_route(params) =>
            named("Fide.federation") {
              call(params.fromPath[String]("name", None), params.fromQuery[Int]("page", Some(1))) { (name, page) =>
                  Fide_36.federation(name, page)
              }
            }
        
          // @LINE:102
          case controllers_Fide_show32003_route(params) =>
            named("Fide.show") {
              call(params.fromPath[chess.FideId]("fideId", None), params.fromPath[String]("name", None), params.fromQuery[Int]("page", Some(1))) { (fideId, name, page) =>
                  Fide_36.show(fideId, name, page)
              }
            }
        
          // @LINE:103
          case controllers_Fide_follow32004_route(params) =>
            named("Fide.follow") {
              call(params.fromPath[chess.FideId]("fideId", None), params.fromQuery[Boolean]("follow", None)) { (fideId, follow) =>
                  Fide_36.follow(fideId, follow)
              }
            }
        
      },
    
      "rel" -> {
        
          // @LINE:54
          case controllers_Relation_unfollowBc33000_route(params) =>
            named("Relation.unfollowBc") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Relation_65.unfollowBc(user)
              }
            }
        
          // @LINE:55
          case controllers_Relation_followBc33001_route(params) =>
            named("Relation.followBc") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Relation_65.followBc(user)
              }
            }
        
          // @LINE:59
          case controllers_Relation_blocks33002_route(params) =>
            named("Relation.blocks") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Relation_65.blocks(page)
              }
            }
        
          // @LINE:60
          case controllers_Relation_bcAction33003_route(params) =>
            named("Relation.bcAction") {
              call(params.fromPath[String]("action", None), params.fromPath[UserStr]("user", None)) { (action, user) =>
                  Relation_65.bcAction(action, user)
              }
            }
        
      },
    
      "InstantChess.com" -> {
        
          // @LINE:888
          case controllers_Main_instantChess34000_route(_) =>
            named("Main.instantChess") {
              call { 
                  Main_19.instantChess
              }
            }
        
      },
    
      "qa" -> {
        
          // @LINE:930
          case controllers_Main_legacyQaQuestion35000_route(params) =>
            named("Main.legacyQaQuestion") {
              call(params.fromPath[Int]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
                  Main_19.legacyQaQuestion(id, slug)
              }
            }
        
      },
    
      "insights" -> {
        
          // @LINE:63
          case controllers_Insight_refresh36000_route(params) =>
            named("Insight.refresh") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Insight_2.refresh(username)
              }
            }
        
          // @LINE:64
          case controllers_Insight_json36001_route(params) =>
            named("Insight.json") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Insight_2.json(username)
              }
            }
        
          // @LINE:65
          case controllers_Insight_index36002_route(params) =>
            named("Insight.index") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Insight_2.index(username)
              }
            }
        
          // @LINE:66
          case controllers_Insight_path36003_route(params) =>
            named("Insight.path") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("metric", None), params.fromPath[String]("dimension", None), Param[String]("filters", Right(""))) { (username, metric, dimension, filters) =>
                  Insight_2.path(username, metric, dimension, filters)
              }
            }
        
          // @LINE:67
          case controllers_Insight_path36004_route(params) =>
            named("Insight.path") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("metric", None), params.fromPath[String]("dimension", None), params.fromPath[String]("filters", None)) { (username, metric, dimension, filters) =>
                  Insight_2.path(username, metric, dimension, filters)
              }
            }
        
      },
    
      "training" -> {
        
          // @LINE:159
          case controllers_Coordinate_home37000_route(_) =>
            named("Coordinate.home") {
              call { 
                  Coordinate_6.home
              }
            }
        
          // @LINE:160
          case controllers_Coordinate_score37001_route(_) =>
            named("Coordinate.score") {
              call { 
                  Coordinate_6.score
              }
            }
        
          // @LINE:164
          case controllers_Puzzle_home37002_route(_) =>
            named("Puzzle.home") {
              call { 
                  Puzzle_52.home
              }
            }
        
          // @LINE:165
          case controllers_Puzzle_daily37003_route(_) =>
            named("Puzzle.daily") {
              call { 
                  Puzzle_52.daily
              }
            }
        
          // @LINE:166
          case controllers_Puzzle_frame37004_route(_) =>
            named("Puzzle.frame") {
              call { 
                  Puzzle_52.frame
              }
            }
        
          // @LINE:167
          case controllers_Puzzle_help37005_route(_) =>
            named("Puzzle.help") {
              call { 
                  Puzzle_52.help
              }
            }
        
          // @LINE:168
          case controllers_Export_puzzleThumbnail37006_route(params) =>
            named("Export.puzzleThumbnail") {
              call(params.fromPath[PuzzleId]("id", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (id, theme, piece) =>
                  Export_22.puzzleThumbnail(id, theme, piece)
              }
            }
        
          // @LINE:169
          case controllers_Puzzle_themes37007_route(_) =>
            named("Puzzle.themes") {
              call { 
                  Puzzle_52.themes
              }
            }
        
          // @LINE:170
          case controllers_Puzzle_openings37008_route(params) =>
            named("Puzzle.openings") {
              call(params.fromQuery[String]("order", Some("popular"))) { (order) =>
                  Puzzle_52.openings(order)
              }
            }
        
          // @LINE:171
          case controllers_Puzzle_ofPlayer37009_route(params) =>
            named("Puzzle.ofPlayer") {
              call(params.fromQuery[Option[UserStr]]("name", Some(None)), params.fromQuery[Int]("page", Some(1))) { (name, page) =>
                  Puzzle_52.ofPlayer(name, page)
              }
            }
        
          // @LINE:172
          case controllers_Puzzle_dashboard37010_route(params) =>
            named("Puzzle.dashboard") {
              call(params.fromPath[Days]("days", None), Param[String]("path", Right("home")), params.fromQuery[Option[UserStr]]("u", None)) { (days, path, u) =>
                  Puzzle_52.dashboard(days, path, u)
              }
            }
        
          // @LINE:173
          case controllers_Puzzle_dashboard37011_route(params) =>
            named("Puzzle.dashboard") {
              call(params.fromPath[Days]("days", None), params.fromPath[String]("path", None), params.fromQuery[Option[UserStr]]("u", None)) { (days, path, u) =>
                  Puzzle_52.dashboard(days, path, u)
              }
            }
        
          // @LINE:174
          case controllers_Puzzle_replay37012_route(params) =>
            named("Puzzle.replay") {
              call(params.fromPath[Days]("days", None), params.fromPath[String]("theme", None)) { (days, theme) =>
                  Puzzle_52.replay(days, theme)
              }
            }
        
          // @LINE:175
          case controllers_Puzzle_history37013_route(params) =>
            named("Puzzle.history") {
              call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[Option[UserStr]]("u", None)) { (page, u) =>
                  Puzzle_52.history(page, u)
              }
            }
        
          // @LINE:176
          case controllers_Puzzle_mobileBcBatchSelect37014_route(_) =>
            named("Puzzle.mobileBcBatchSelect") {
              call { 
                  Puzzle_52.mobileBcBatchSelect
              }
            }
        
          // @LINE:177
          case controllers_Puzzle_mobileBcBatchSolve37015_route(_) =>
            named("Puzzle.mobileBcBatchSolve") {
              call { 
                  Puzzle_52.mobileBcBatchSolve
              }
            }
        
          // @LINE:178
          case controllers_Puzzle_mobileBcNew37016_route(_) =>
            named("Puzzle.mobileBcNew") {
              call { 
                  Puzzle_52.mobileBcNew
              }
            }
        
          // @LINE:179
          case controllers_Puzzle_mobileBcLoad37017_route(params) =>
            named("Puzzle.mobileBcLoad") {
              call(params.fromPath[Long]("numericalId", None)) { (numericalId) =>
                  Puzzle_52.mobileBcLoad(numericalId)
              }
            }
        
          // @LINE:180
          case controllers_Puzzle_mobileBcVote37018_route(params) =>
            named("Puzzle.mobileBcVote") {
              call(params.fromPath[Long]("numericalId", None)) { (numericalId) =>
                  Puzzle_52.mobileBcVote(numericalId)
              }
            }
        
          // @LINE:181
          case controllers_Puzzle_show37019_route(params) =>
            named("Puzzle.show") {
              call(params.fromPath[String]("angleOrId", None)) { (angleOrId) =>
                  Puzzle_52.show(angleOrId)
              }
            }
        
          // @LINE:182
          case controllers_Puzzle_angleAndColor37020_route(params) =>
            named("Puzzle.angleAndColor") {
              call(params.fromPath[String]("angle", None), params.fromPath[String]("color", None)) { (angle, color) =>
                  Puzzle_52.angleAndColor(angle, color)
              }
            }
        
          // @LINE:183
          case controllers_Puzzle_showWithAngle37021_route(params) =>
            named("Puzzle.showWithAngle") {
              call(params.fromPath[String]("angle", None), params.fromPath[PuzzleId]("id", None)) { (angle, id) =>
                  Puzzle_52.showWithAngle(angle, id)
              }
            }
        
          // @LINE:184
          case controllers_Puzzle_mobileBcRound37022_route(params) =>
            named("Puzzle.mobileBcRound") {
              call(params.fromPath[Long]("numericalId", None)) { (numericalId) =>
                  Puzzle_52.mobileBcRound(numericalId)
              }
            }
        
          // @LINE:185
          case controllers_Puzzle_vote37023_route(params) =>
            named("Puzzle.vote") {
              call(params.fromPath[PuzzleId]("id", None)) { (id) =>
                  Puzzle_52.vote(id)
              }
            }
        
          // @LINE:186
          case controllers_Puzzle_report37024_route(params) =>
            named("Puzzle.report") {
              call(params.fromPath[PuzzleId]("id", None)) { (id) =>
                  Puzzle_52.report(id)
              }
            }
        
          // @LINE:187
          case controllers_Puzzle_voteTheme37025_route(params) =>
            named("Puzzle.voteTheme") {
              call(params.fromPath[PuzzleId]("id", None), params.fromPath[String]("theme", None)) { (id, theme) =>
                  Puzzle_52.voteTheme(id, theme)
              }
            }
        
          // @LINE:188
          case controllers_Puzzle_complete37026_route(params) =>
            named("Puzzle.complete") {
              call(params.fromPath[String]("theme", None), params.fromPath[PuzzleId]("id", None)) { (theme, id) =>
                  Puzzle_52.complete(theme, id)
              }
            }
        
          // @LINE:189
          case controllers_Puzzle_setDifficulty37027_route(params) =>
            named("Puzzle.setDifficulty") {
              call(params.fromPath[String]("theme", None)) { (theme) =>
                  Puzzle_52.setDifficulty(theme)
              }
            }
        
      },
    
      "daily-puzzle-slack" -> {
        
          // @LINE:889
          case controllers_Main_dailyPuzzleSlackApp38000_route(_) =>
            named("Main.dailyPuzzleSlackApp") {
              call { 
                  Main_19.dailyPuzzleSlackApp
              }
            }
        
      },
    
      "simul" -> {
        
          // @LINE:458
          case controllers_Simul_home39000_route(_) =>
            named("Simul.home") {
              call { 
                  Simul_56.home
              }
            }
        
          // @LINE:459
          case controllers_Simul_form39001_route(_) =>
            named("Simul.form") {
              call { 
                  Simul_56.form
              }
            }
        
          // @LINE:460
          case controllers_Simul_create39002_route(_) =>
            named("Simul.create") {
              call { 
                  Simul_56.create
              }
            }
        
          // @LINE:461
          case controllers_Simul_homeReload39003_route(_) =>
            named("Simul.homeReload") {
              call { 
                  Simul_56.homeReload
              }
            }
        
          // @LINE:462
          case controllers_Simul_show39004_route(params) =>
            named("Simul.show") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.show(id)
              }
            }
        
          // @LINE:463
          case controllers_Simul_edit39005_route(params) =>
            named("Simul.edit") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.edit(id)
              }
            }
        
          // @LINE:464
          case controllers_Simul_update39006_route(params) =>
            named("Simul.update") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.update(id)
              }
            }
        
          // @LINE:465
          case controllers_Simul_hostPing39007_route(params) =>
            named("Simul.hostPing") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.hostPing(id)
              }
            }
        
          // @LINE:466
          case controllers_Simul_accept39008_route(params) =>
            named("Simul.accept") {
              call(params.fromPath[SimulId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Simul_56.accept(id, user)
              }
            }
        
          // @LINE:467
          case controllers_Simul_reject39009_route(params) =>
            named("Simul.reject") {
              call(params.fromPath[SimulId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Simul_56.reject(id, user)
              }
            }
        
          // @LINE:468
          case controllers_Simul_start39010_route(params) =>
            named("Simul.start") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.start(id)
              }
            }
        
          // @LINE:469
          case controllers_Simul_abort39011_route(params) =>
            named("Simul.abort") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.abort(id)
              }
            }
        
          // @LINE:470
          case controllers_Simul_join39012_route(params) =>
            named("Simul.join") {
              call(params.fromPath[SimulId]("id", None), params.fromPath[chess.variant.Variant.LilaKey]("variant", None)) { (id, variant) =>
                  Simul_56.join(id, variant)
              }
            }
        
          // @LINE:471
          case controllers_Simul_withdraw39013_route(params) =>
            named("Simul.withdraw") {
              call(params.fromPath[SimulId]("id", None)) { (id) =>
                  Simul_56.withdraw(id)
              }
            }
        
      },
    
      "variant" -> {
        
          // @LINE:934
          case controllers_Cms_variantHome40000_route(_) =>
            named("Cms.variantHome") {
              call { 
                  Cms_4.variantHome
              }
            }
        
          // @LINE:935
          case controllers_Cms_variant40001_route(params) =>
            named("Cms.variant") {
              call(params.fromPath[chess.variant.Variant.LilaKey]("key", None)) { (key) =>
                  Cms_4.variant(key)
              }
            }
        
      },
    
      "prometheus-metrics" -> {
        
          // @LINE:917
          case controllers_Main_prometheusMetrics41000_route(params) =>
            named("Main.prometheusMetrics") {
              call(params.fromPath[String]("key", None)) { (key) =>
                  Main_19.prometheusMetrics(key)
              }
            }
        
      },
    
      "tv" -> {
        
          // @LINE:8
          case controllers_Tv_index42000_route(_) =>
            named("Tv.index") {
              call { 
                  Tv_20.index
              }
            }
        
          // @LINE:32
          case controllers_Tv_frameDefault42001_route(_) =>
            named("Tv.frameDefault") {
              call { 
                  Tv_20.frameDefault
              }
            }
        
          // @LINE:33
          case controllers_Tv_feedDefault42002_route(_) =>
            named("Tv.feedDefault") {
              call { 
                  Tv_20.feedDefault
              }
            }
        
          // @LINE:34
          case controllers_Main_movedPermanently42003_route(_) =>
            named("Main.movedPermanently") {
              call(Param[String]("to", Right("/api/tv/channels"))) { (to) =>
                  Main_19.movedPermanently(to)
              }
            }
        
          // @LINE:35
          case controllers_Tv_onChannel42004_route(params) =>
            named("Tv.onChannel") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.onChannel(chanKey)
              }
            }
        
          // @LINE:36
          case controllers_Tv_frame42005_route(params) =>
            named("Tv.frame") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.frame(chanKey)
              }
            }
        
          // @LINE:37
          case controllers_Tv_feed42006_route(params) =>
            named("Tv.feed") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.feed(chanKey)
              }
            }
        
          // @LINE:38
          case controllers_Tv_sides42007_route(params) =>
            named("Tv.sides") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Tv_20.sides(gameId, color)
              }
            }
        
      },
    
      "appeal" -> {
        
          // @LINE:692
          case prefixed_appeal_Routes_1_43000(handler) => handler
        
      },
    
      "app-store" -> {
        
          // @LINE:882
          case controllers_Main_redirectToAppStore44000_route(_) =>
            named("Main.redirectToAppStore") {
              call { 
                  Main_19.redirectToAppStore
              }
            }
        
      },
    
      "tournament" -> {
        
          // @LINE:405
          case controllers_Tournament_home45000_route(_) =>
            named("Tournament.home") {
              call { 
                  Tournament_5.home
              }
            }
        
          // @LINE:406
          case controllers_Tournament_featured45001_route(_) =>
            named("Tournament.featured") {
              call { 
                  Tournament_5.featured
              }
            }
        
          // @LINE:407
          case controllers_Tournament_form45002_route(_) =>
            named("Tournament.form") {
              call { 
                  Tournament_5.form
              }
            }
        
          // @LINE:408
          case controllers_Tournament_webCreate45003_route(_) =>
            named("Tournament.webCreate") {
              call { 
                  Tournament_5.webCreate
              }
            }
        
          // @LINE:409
          case controllers_Tournament_teamBattleForm45004_route(params) =>
            named("Tournament.teamBattleForm") {
              call(params.fromPath[TeamId]("teamId", None)) { (teamId) =>
                  Tournament_5.teamBattleForm(teamId)
              }
            }
        
          // @LINE:410
          case controllers_Tournament_teamBattleEdit45005_route(params) =>
            named("Tournament.teamBattleEdit") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.teamBattleEdit(id)
              }
            }
        
          // @LINE:411
          case controllers_Tournament_teamBattleUpdate45006_route(params) =>
            named("Tournament.teamBattleUpdate") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.teamBattleUpdate(id)
              }
            }
        
          // @LINE:412
          case controllers_Tournament_calendar45007_route(_) =>
            named("Tournament.calendar") {
              call { 
                  Tournament_5.calendar
              }
            }
        
          // @LINE:413
          case controllers_Tournament_history45008_route(params) =>
            named("Tournament.history") {
              call(Param[String]("freq", Right("unique")), params.fromQuery[Int]("page", Some(1))) { (freq, page) =>
                  Tournament_5.history(freq, page)
              }
            }
        
          // @LINE:414
          case controllers_Tournament_history45009_route(params) =>
            named("Tournament.history") {
              call(params.fromPath[String]("freq", None), params.fromQuery[Int]("page", Some(1))) { (freq, page) =>
                  Tournament_5.history(freq, page)
              }
            }
        
          // @LINE:415
          case controllers_Tournament_show45010_route(params) =>
            named("Tournament.show") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.show(id)
              }
            }
        
          // @LINE:416
          case controllers_Tournament_standing45011_route(params) =>
            named("Tournament.standing") {
              call(params.fromPath[TourId]("id", None), params.fromPath[Int]("page", None)) { (id, page) =>
                  Tournament_5.standing(id, page)
              }
            }
        
          // @LINE:417
          case controllers_Tournament_pageOf45012_route(params) =>
            named("Tournament.pageOf") {
              call(params.fromPath[TourId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Tournament_5.pageOf(id, user)
              }
            }
        
          // @LINE:418
          case controllers_Tournament_join45013_route(params) =>
            named("Tournament.join") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.join(id)
              }
            }
        
          // @LINE:419
          case controllers_Tournament_pause45014_route(params) =>
            named("Tournament.pause") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.pause(id)
              }
            }
        
          // @LINE:420
          case controllers_Tournament_player45015_route(params) =>
            named("Tournament.player") {
              call(params.fromPath[TourId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Tournament_5.player(id, user)
              }
            }
        
          // @LINE:421
          case controllers_Tournament_teamInfo45016_route(params) =>
            named("Tournament.teamInfo") {
              call(params.fromPath[TourId]("id", None), params.fromPath[TeamId]("team", None)) { (id, team) =>
                  Tournament_5.teamInfo(id, team)
              }
            }
        
          // @LINE:422
          case controllers_Tournament_terminate45017_route(params) =>
            named("Tournament.terminate") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.terminate(id)
              }
            }
        
          // @LINE:423
          case controllers_Tournament_edit45018_route(params) =>
            named("Tournament.edit") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.edit(id)
              }
            }
        
          // @LINE:424
          case controllers_Tournament_update45019_route(params) =>
            named("Tournament.update") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.update(id)
              }
            }
        
          // @LINE:425
          case controllers_Tournament_battleTeams45020_route(params) =>
            named("Tournament.battleTeams") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.battleTeams(id)
              }
            }
        
          // @LINE:426
          case controllers_Tournament_moderation45021_route(params) =>
            named("Tournament.moderation") {
              call(params.fromPath[TourId]("id", None), params.fromPath[String]("view", None)) { (id, view) =>
                  Tournament_5.moderation(id, view)
              }
            }
        
          // @LINE:427
          case controllers_Tournament_help45022_route(_) =>
            named("Tournament.help") {
              call { 
                  Tournament_5.help
              }
            }
        
          // @LINE:428
          case controllers_Tournament_leaderboard45023_route(_) =>
            named("Tournament.leaderboard") {
              call { 
                  Tournament_5.leaderboard
              }
            }
        
          // @LINE:429
          case controllers_Tournament_shields45024_route(_) =>
            named("Tournament.shields") {
              call { 
                  Tournament_5.shields
              }
            }
        
          // @LINE:430
          case controllers_Tournament_categShields45025_route(params) =>
            named("Tournament.categShields") {
              call(params.fromPath[String]("categ", None)) { (categ) =>
                  Tournament_5.categShields(categ)
              }
            }
        
          // @LINE:434
          case controllers_TournamentCrud_index45026_route(params) =>
            named("TournamentCrud.index") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  TournamentCrud_30.index(page)
              }
            }
        
          // @LINE:435
          case controllers_TournamentCrud_cloneT45027_route(params) =>
            named("TournamentCrud.cloneT") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  TournamentCrud_30.cloneT(id)
              }
            }
        
          // @LINE:436
          case controllers_TournamentCrud_edit45028_route(params) =>
            named("TournamentCrud.edit") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  TournamentCrud_30.edit(id)
              }
            }
        
          // @LINE:437
          case controllers_TournamentCrud_update45029_route(params) =>
            named("TournamentCrud.update") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  TournamentCrud_30.update(id)
              }
            }
        
          // @LINE:438
          case controllers_TournamentCrud_form45030_route(_) =>
            named("TournamentCrud.form") {
              call { 
                  TournamentCrud_30.form
              }
            }
        
          // @LINE:439
          case controllers_TournamentCrud_create45031_route(_) =>
            named("TournamentCrud.create") {
              call { 
                  TournamentCrud_30.create
              }
            }
        
      },
    
      "embed" -> {
        
          // @LINE:223
          case controllers_UserAnalysis_embed46000_route(_) =>
            named("UserAnalysis.embed") {
              call { 
                  UserAnalysis_44.embed
              }
            }
        
          // @LINE:278
          case controllers_RelayTour_embedShow46001_route(params) =>
            named("RelayTour.embedShow") {
              call(params.fromPath[String]("ts", None), params.fromPath[RelayTourId]("id", None)) { (ts, id) =>
                  RelayTour_42.embedShow(ts, id)
              }
            }
        
          // @LINE:293
          case controllers_RelayRound_embedShow46002_route(params) =>
            named("RelayRound.embedShow") {
              call(params.fromPath[String]("ts", None), params.fromPath[String]("rs", None), params.fromPath[RelayRoundId]("roundId", None)) { (ts, rs, roundId) =>
                  RelayRound_58.embedShow(ts, rs, roundId)
              }
            }
        
          // @LINE:392
          case controllers_Analyse_embed46003_route(params) =>
            named("Analyse.embed") {
              call(params.fromPath[GameId]("gameId", None), Param[Color]("color", Right(Color.white))) { (gameId, color) =>
                  Analyse_28.embed(gameId, color)
              }
            }
        
          // @LINE:393
          case controllers_Analyse_embed46004_route(params) =>
            named("Analyse.embed") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Analyse_28.embed(gameId, color)
              }
            }
        
          // @LINE:395
          case controllers_Analyse_embedReplayGame46005_route(params) =>
            named("Analyse.embedReplayGame") {
              call(params.fromPath[GameId]("gameId", None), Param[Color]("color", Right(Color.white))) { (gameId, color) =>
                  Analyse_28.embedReplayGame(gameId, color)
              }
            }
        
          // @LINE:396
          case controllers_Analyse_embedReplayGame46006_route(params) =>
            named("Analyse.embedReplayGame") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None)) { (gameId, color) =>
                  Analyse_28.embedReplayGame(gameId, color)
              }
            }
        
      },
    
      "contact" -> {
        
          // @LINE:807
          case controllers_Account_emailConfirmHelp47000_route(_) =>
            named("Account.emailConfirmHelp") {
              call { 
                  Account_10.emailConfirmHelp
              }
            }
        
          // @LINE:927
          case controllers_Main_contact47001_route(_) =>
            named("Main.contact") {
              call { 
                  Main_19.contact
              }
            }
        
      },
    
      "robots.txt" -> {
        
          // @LINE:953
          case controllers_Main_robots48000_route(_) =>
            named("Main.robots") {
              call { 
                  Main_19.robots
              }
            }
        
      },
    
      "swiss" -> {
        
          // @LINE:442
          case controllers_Swiss_home49000_route(_) =>
            named("Swiss.home") {
              call { 
                  Swiss_32.home
              }
            }
        
          // @LINE:443
          case controllers_Swiss_form49001_route(params) =>
            named("Swiss.form") {
              call(params.fromPath[TeamId]("teamId", None)) { (teamId) =>
                  Swiss_32.form(teamId)
              }
            }
        
          // @LINE:444
          case controllers_Swiss_create49002_route(params) =>
            named("Swiss.create") {
              call(params.fromPath[TeamId]("teamId", None)) { (teamId) =>
                  Swiss_32.create(teamId)
              }
            }
        
          // @LINE:445
          case controllers_Swiss_show49003_route(params) =>
            named("Swiss.show") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.show(id)
              }
            }
        
          // @LINE:446
          case controllers_Swiss_round49004_route(params) =>
            named("Swiss.round") {
              call(params.fromPath[SwissId]("id", None), params.fromPath[Int]("round", None)) { (id, round) =>
                  Swiss_32.round(id, round)
              }
            }
        
          // @LINE:447
          case controllers_Swiss_exportTrf49005_route(params) =>
            named("Swiss.exportTrf") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.exportTrf(id)
              }
            }
        
          // @LINE:448
          case controllers_Swiss_edit49006_route(params) =>
            named("Swiss.edit") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.edit(id)
              }
            }
        
          // @LINE:449
          case controllers_Swiss_update49007_route(params) =>
            named("Swiss.update") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.update(id)
              }
            }
        
          // @LINE:450
          case controllers_Swiss_terminate49008_route(params) =>
            named("Swiss.terminate") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.terminate(id)
              }
            }
        
          // @LINE:451
          case controllers_Swiss_standing49009_route(params) =>
            named("Swiss.standing") {
              call(params.fromPath[SwissId]("id", None), params.fromPath[Int]("page", None)) { (id, page) =>
                  Swiss_32.standing(id, page)
              }
            }
        
          // @LINE:452
          case controllers_Swiss_pageOf49010_route(params) =>
            named("Swiss.pageOf") {
              call(params.fromPath[SwissId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Swiss_32.pageOf(id, user)
              }
            }
        
          // @LINE:453
          case controllers_Swiss_player49011_route(params) =>
            named("Swiss.player") {
              call(params.fromPath[SwissId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  Swiss_32.player(id, user)
              }
            }
        
      },
    
      "patron" -> {
        
          // @LINE:318
          case controllers_Plan_index50000_route(params) =>
            named("Plan.index") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Plan_46.index(page)
              }
            }
        
          // @LINE:319
          case controllers_Plan_thanks50001_route(_) =>
            named("Plan.thanks") {
              call { 
                  Plan_46.thanks
              }
            }
        
          // @LINE:320
          case controllers_Plan_list50002_route(_) =>
            named("Plan.list") {
              call { 
                  Plan_46.list
              }
            }
        
          // @LINE:321
          case controllers_Plan_switch50003_route(_) =>
            named("Plan.switch") {
              call { 
                  Plan_46.switch
              }
            }
        
          // @LINE:322
          case controllers_Plan_cancel50004_route(_) =>
            named("Plan.cancel") {
              call { 
                  Plan_46.cancel
              }
            }
        
          // @LINE:323
          case controllers_Plan_webhook50005_route(_) =>
            named("Plan.webhook") {
              call { 
                  Plan_46.webhook
              }
            }
        
          // @LINE:324
          case controllers_Plan_stripeCheckout50006_route(_) =>
            named("Plan.stripeCheckout") {
              call { 
                  Plan_46.stripeCheckout
              }
            }
        
          // @LINE:325
          case controllers_Plan_updatePayment50007_route(_) =>
            named("Plan.updatePayment") {
              call { 
                  Plan_46.updatePayment
              }
            }
        
          // @LINE:326
          case controllers_Plan_updatePaymentCallback50008_route(_) =>
            named("Plan.updatePaymentCallback") {
              call { 
                  Plan_46.updatePaymentCallback
              }
            }
        
          // @LINE:327
          case controllers_Plan_payPalIpn50009_route(_) =>
            named("Plan.payPalIpn") {
              call { 
                  Plan_46.payPalIpn
              }
            }
        
          // @LINE:328
          case controllers_Plan_payPalCheckout50010_route(_) =>
            named("Plan.payPalCheckout") {
              call { 
                  Plan_46.payPalCheckout
              }
            }
        
          // @LINE:329
          case controllers_Plan_payPalCapture50011_route(params) =>
            named("Plan.payPalCapture") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Plan_46.payPalCapture(id)
              }
            }
        
      },
    
      "dasher" -> {
        
          // @LINE:107
          case controllers_Dasher_get51000_route(_) =>
            named("Dasher.get") {
              call { 
                  Dasher_24.get
              }
            }
        
      },
    
      "@" -> {
        
          // @LINE:57
          case controllers_Relation_following52000_route(params) =>
            named("Relation.following") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Relation_65.following(username, page)
              }
            }
        
          // @LINE:58
          case controllers_Relation_followers52001_route(params) =>
            named("Relation.followers") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Relation_65.followers(username, page)
              }
            }
        
          // @LINE:70
          case controllers_UserTournament_path52002_route(params) =>
            named("UserTournament.path") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("path", None), params.fromQuery[Int]("page", Some(1))) { (username, path, page) =>
                  UserTournament_51.path(username, path, page)
              }
            }
        
          // @LINE:71
          case controllers_Simul_byUser52003_route(params) =>
            named("Simul.byUser") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Simul_56.byUser(username, page)
              }
            }
        
          // @LINE:75
          case controllers_User_writeNote52004_route(params) =>
            named("User.writeNote") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.writeNote(username)
              }
            }
        
          // @LINE:78
          case controllers_User_showMini52005_route(params) =>
            named("User.showMini") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.showMini(username)
              }
            }
        
          // @LINE:79
          case controllers_User_tv52006_route(params) =>
            named("User.tv") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.tv(username)
              }
            }
        
          // @LINE:80
          case controllers_User_perfStat52007_route(params) =>
            named("User.perfStat") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perfKey", None)) { (username, perfKey) =>
                  User_23.perfStat(username, perfKey)
              }
            }
        
          // @LINE:81
          case controllers_User_gamesAll52008_route(params) =>
            named("User.gamesAll") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  User_23.gamesAll(username, page)
              }
            }
        
          // @LINE:82
          case controllers_User_download52009_route(params) =>
            named("User.download") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.download(username)
              }
            }
        
          // @LINE:83
          case controllers_Ublog_index52010_route(params) =>
            named("Ublog.index") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Ublog_7.index(username, page)
              }
            }
        
          // @LINE:84
          case controllers_Ublog_userAtom52011_route(params) =>
            named("Ublog.userAtom") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Ublog_7.userAtom(username)
              }
            }
        
          // @LINE:85
          case controllers_User_games52012_route(params) =>
            named("User.games") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("filterName", None), params.fromQuery[Int]("page", Some(1))) { (username, filterName, page) =>
                  User_23.games(username, filterName, page)
              }
            }
        
          // @LINE:86
          case controllers_User_show52013_route(params) =>
            named("User.show") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.show(username)
              }
            }
        
          // @LINE:125
          case controllers_Ublog_post52014_route(params) =>
            named("Ublog.post") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("slug", None), params.fromPath[UblogPostId]("id", None)) { (username, slug, id) =>
                  Ublog_7.post(username, slug, id)
              }
            }
        
          // @LINE:126
          case controllers_Ublog_drafts52015_route(params) =>
            named("Ublog.drafts") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Ublog_7.drafts(username, page)
              }
            }
        
          // @LINE:127
          case controllers_Ublog_form52016_route(params) =>
            named("Ublog.form") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Ublog_7.form(username)
              }
            }
        
          // @LINE:128
          case controllers_Ublog_create52017_route(params) =>
            named("Ublog.create") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Ublog_7.create(username)
              }
            }
        
      },
    
      "jslog" -> {
        
          // @LINE:947
          case controllers_Main_jslog53000_route(params) =>
            named("Main.jslog") {
              call(params.fromPath[GameFullId]("id", None)) { (id) =>
                  Main_19.jslog(id)
              }
            }
        
      },
    
      "export" -> {
        
          // @LINE:496
          case controllers_Export_fenThumbnail54000_route(params) =>
            named("Export.fenThumbnail") {
              call(params.fromQuery[String]("fen", None), params.fromQuery[Option[Color]]("color", None), params.fromQuery[Option[Uci]]("lastMove", None), params.fromQuery[Option[chess.variant.Variant.LilaKey]]("variant", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (fen, color, lastMove, variant, theme, piece) =>
                  Export_22.fenThumbnail(fen, color, lastMove, variant, theme, piece)
              }
            }
        
      },
    
      "manifest.json" -> {
        
          // @LINE:952
          case controllers_Main_manifest55000_route(_) =>
            named("Main.manifest") {
              call { 
                  Main_19.manifest
              }
            }
        
      },
    
      "diagnostic" -> {
        
          // @LINE:651
          case controllers_ForumTopic_diagnostic56000_route(_) =>
            named("ForumTopic.diagnostic") {
              call { 
                  ForumTopic_21.diagnostic
              }
            }
        
          // @LINE:652
          case controllers_ForumTopic_clearDiagnostic56001_route(params) =>
            named("ForumTopic.clearDiagnostic") {
              call(params.fromPath[ForumTopicSlug]("slug", None)) { (slug) =>
                  ForumTopic_21.clearDiagnostic(slug)
              }
            }
        
      },
    
      "help" -> {
        
          // @LINE:938
          case controllers_Cms_help57000_route(_) =>
            named("Cms.help") {
              call { 
                  Cms_4.help
              }
            }
        
          // @LINE:939
          case controllers_Main_helpPath57001_route(params) =>
            named("Main.helpPath") {
              call(params.fromPath[String]("path", None)) { (path) =>
                  Main_19.helpPath(path)
              }
            }
        
      },
    
      "editor" -> {
        
          // @LINE:682
          case controllers_Editor_load58000_route(params) =>
            named("Editor.load") {
              call(params.fromPath[String]("urlFen", None)) { (urlFen) =>
                  Editor_11.load(urlFen)
              }
            }
        
          // @LINE:683
          case controllers_Editor_index58001_route(_) =>
            named("Editor.index") {
              call { 
                  Editor_11.index
              }
            }
        
      },
    
      "coach" -> {
        
          // @LINE:667
          case controllers_Coach_all59000_route(params) =>
            named("Coach.all") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Coach_60.all(page)
              }
            }
        
          // @LINE:668
          case controllers_Coach_edit59001_route(_) =>
            named("Coach.edit") {
              call { 
                  Coach_60.edit
              }
            }
        
          // @LINE:669
          case controllers_Coach_editApply59002_route(_) =>
            named("Coach.editApply") {
              call { 
                  Coach_60.editApply
              }
            }
        
          // @LINE:671
          case controllers_Coach_show59003_route(params) =>
            named("Coach.show") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Coach_60.show(username)
              }
            }
        
          // @LINE:672
          case controllers_Coach_search59004_route(params) =>
            named("Coach.search") {
              call(params.fromPath[String]("lang", None), params.fromPath[String]("order", None), params.fromPath[FlagCode]("country", None), params.fromQuery[Int]("page", Some(1))) { (lang, order, country, page) =>
                  Coach_60.search(lang, order, country, page)
              }
            }
        
      },
    
      "blog" -> {
        
          // @LINE:111
          case controllers_Main_movedPermanently60000_route(_) =>
            named("Main.movedPermanently") {
              call(Param[String]("to", Right("/@/Lichess/blog"))) { (to) =>
                  Main_19.movedPermanently(to)
              }
            }
        
          // @LINE:112
          case controllers_Ublog_topics60001_route(_) =>
            named("Ublog.topics") {
              call { 
                  Ublog_7.topics
              }
            }
        
          // @LINE:113
          case controllers_Ublog_topic60002_route(params) =>
            named("Ublog.topic") {
              call(params.fromPath[String]("topic", None), params.fromQuery[Option[BlogQualityFilter]]("filter", Some(None)), params.fromQuery[BlogsBy]("by", Some(BlogsBy.newest)), params.fromQuery[Int]("page", Some(1))) { (topic, filter, by, page) =>
                  Ublog_7.topic(topic, filter, by, page)
              }
            }
        
          // @LINE:114
          case controllers_Ublog_thisMonth60003_route(params) =>
            named("Ublog.thisMonth") {
              call(params.fromQuery[Option[BlogQualityFilter]]("filter", Some(None)), params.fromQuery[BlogsBy]("by", Some(BlogsBy.newest)), params.fromQuery[Int]("page", Some(1))) { (filter, by, page) =>
                  Ublog_7.thisMonth(filter, by, page)
              }
            }
        
          // @LINE:115
          case controllers_Ublog_byMonth60004_route(params) =>
            named("Ublog.byMonth") {
              call(params.fromPath[Int]("year", None), params.fromPath[Int]("month", None), params.fromQuery[Option[BlogQualityFilter]]("filter", Some(None)), params.fromQuery[BlogsBy]("by", Some(BlogsBy.newest)), params.fromQuery[Int]("page", Some(1))) { (year, month, filter, by, page) =>
                  Ublog_7.byMonth(year, month, filter, by, page)
              }
            }
        
          // @LINE:117
          case controllers_Ublog_friends60005_route(params) =>
            named("Ublog.friends") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Ublog_7.friends(page)
              }
            }
        
          // @LINE:118
          case controllers_Ublog_liked60006_route(params) =>
            named("Ublog.liked") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Ublog_7.liked(page)
              }
            }
        
          // @LINE:119
          case controllers_Ublog_search60007_route(params) =>
            named("Ublog.search") {
              call(params.fromQuery[String]("text", Some("")), params.fromQuery[BlogsBy]("by", Some(BlogsBy.score)), params.fromQuery[Int]("page", Some(1))) { (text, by, page) =>
                  Ublog_7.search(text, by, page)
              }
            }
        
          // @LINE:120
          case controllers_Ublog_communityAll60008_route(params) =>
            named("Ublog.communityAll") {
              call(params.fromQuery[Option[BlogQualityFilter]]("filter", Some(None)), params.fromQuery[Int]("page", Some(1))) { (filter, page) =>
                  Ublog_7.communityAll(filter, page)
              }
            }
        
          // @LINE:122
          case controllers_Ublog_communityAtom60009_route(params) =>
            named("Ublog.communityAtom") {
              call(params.fromQuery[Language]("lang", Some(Language("all")))) { (lang) =>
                  Ublog_7.communityAtom(lang)
              }
            }
        
          // @LINE:123
          case controllers_Ublog_communityAtom60010_route(params) =>
            named("Ublog.communityAtom") {
              call(params.fromPath[Language]("lang", None)) { (lang) =>
                  Ublog_7.communityAtom(lang)
              }
            }
        
          // @LINE:124
          case controllers_Ublog_historicalBlogPost60011_route(params) =>
            named("Ublog.historicalBlogPost") {
              call(params.fromPath[String]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
                  Ublog_7.historicalBlogPost(id, slug)
              }
            }
        
      },
    
      "import" -> {
        
          // @LINE:677
          case controllers_Importer_sendGame61000_route(_) =>
            named("Importer.sendGame") {
              call { 
                  Importer_16.sendGame
              }
            }
        
          // @LINE:678
          case controllers_Importer_masterGame61001_route(params) =>
            named("Importer.masterGame") {
              call(params.fromPath[GameId]("id", None), params.fromPath[Color]("color", None)) { (id, color) =>
                  Importer_16.masterGame(id, color)
              }
            }
        
      },
    
      "analysis" -> {
        
          // @LINE:219
          case controllers_UserAnalysis_help62000_route(_) =>
            named("UserAnalysis.help") {
              call { 
                  UserAnalysis_44.help
              }
            }
        
          // @LINE:220
          case controllers_UserAnalysis_pgn62001_route(params) =>
            named("UserAnalysis.pgn") {
              call(params.fromPath[String]("pgn", None)) { (pgn) =>
                  UserAnalysis_44.pgn(pgn)
              }
            }
        
          // @LINE:221
          case controllers_UserAnalysis_parseArg62002_route(params) =>
            named("UserAnalysis.parseArg") {
              call(params.fromPath[String]("something", None)) { (something) =>
                  UserAnalysis_44.parseArg(something)
              }
            }
        
          // @LINE:222
          case controllers_UserAnalysis_index62003_route(_) =>
            named("UserAnalysis.index") {
              call { 
                  UserAnalysis_44.index
              }
            }
        
      },
    
      "player" -> {
        
          // @LINE:87
          case controllers_User_myself63000_route(_) =>
            named("User.myself") {
              call { 
                  User_23.myself
              }
            }
        
          // @LINE:88
          case controllers_User_opponents63001_route(_) =>
            named("User.opponents") {
              call { 
                  User_23.opponents
              }
            }
        
          // @LINE:89
          case controllers_User_search63002_route(params) =>
            named("User.search") {
              call(params.fromPath[String]("term", None)) { (term) =>
                  User_23.search(term)
              }
            }
        
          // @LINE:90
          case controllers_User_list63003_route(_) =>
            named("User.list") {
              call { 
                  User_23.list
              }
            }
        
          // @LINE:91
          case controllers_User_topNb63004_route(params) =>
            named("User.topNb") {
              call(params.fromPath[Int]("nb", None), params.fromPath[PerfKey]("perfKey", None)) { (nb, perfKey) =>
                  User_23.topNb(nb, perfKey)
              }
            }
        
          // @LINE:93
          case controllers_User_topWeek63005_route(_) =>
            named("User.topWeek") {
              call { 
                  User_23.topWeek
              }
            }
        
          // @LINE:94
          case controllers_User_online63006_route(_) =>
            named("User.online") {
              call { 
                  User_23.online
              }
            }
        
          // @LINE:792
          case controllers_PlayApi_botOnline63007_route(_) =>
            named("PlayApi.botOnline") {
              call { 
                  PlayApi_14.botOnline
              }
            }
        
      },
    
      "pref" -> {
        
          // @LINE:506
          case controllers_Pref_set64000_route(params) =>
            named("Pref.set") {
              call(params.fromPath[String]("name", None)) { (name) =>
                  Pref_3.set(name)
              }
            }
        
      },
    
      "dev" -> {
        
          // @LINE:912
          case controllers_Dev_cli65000_route(_) =>
            named("Dev.cli") {
              call { 
                  Dev_37.cli
              }
            }
        
          // @LINE:913
          case controllers_Dev_cliPost65001_route(_) =>
            named("Dev.cliPost") {
              call { 
                  Dev_37.cliPost
              }
            }
        
          // @LINE:914
          case controllers_Dev_settings65002_route(_) =>
            named("Dev.settings") {
              call { 
                  Dev_37.settings
              }
            }
        
          // @LINE:915
          case controllers_Dev_settingsPost65003_route(params) =>
            named("Dev.settingsPost") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Dev_37.settingsPost(id)
              }
            }
        
      },
    
      "broadcast" -> {
        
          // @LINE:266
          case controllers_RelayTour_index66000_route(params) =>
            named("RelayTour.index") {
              call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[String]("q", Some(""))) { (page, q) =>
                  RelayTour_42.index(page, q)
              }
            }
        
          // @LINE:267
          case controllers_RelayTour_form66001_route(_) =>
            named("RelayTour.form") {
              call { 
                  RelayTour_42.form
              }
            }
        
          // @LINE:268
          case controllers_RelayTour_create66002_route(_) =>
            named("RelayTour.create") {
              call { 
                  RelayTour_42.create
              }
            }
        
          // @LINE:269
          case controllers_RelayTour_calendar66003_route(_) =>
            named("RelayTour.calendar") {
              call { 
                  RelayTour_42.calendar
              }
            }
        
          // @LINE:270
          case controllers_RelayTour_calendarMonth66004_route(params) =>
            named("RelayTour.calendarMonth") {
              call(params.fromPath[Int]("year", None), params.fromPath[Int]("month", None)) { (year, month) =>
                  RelayTour_42.calendarMonth(year, month)
              }
            }
        
          // @LINE:271
          case controllers_RelayTour_help66005_route(_) =>
            named("RelayTour.help") {
              call { 
                  RelayTour_42.help
              }
            }
        
          // @LINE:272
          case controllers_RelayTour_app66006_route(_) =>
            named("RelayTour.app") {
              call { 
                  RelayTour_42.app
              }
            }
        
          // @LINE:273
          case controllers_RelayTour_by66007_route(params) =>
            named("RelayTour.by") {
              call(params.fromPath[UserStr]("user", None), params.fromQuery[Int]("page", Some(1))) { (user, page) =>
                  RelayTour_42.by(user, page)
              }
            }
        
          // @LINE:275
          case controllers_RelayTour_subscribed66008_route(params) =>
            named("RelayTour.subscribed") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  RelayTour_42.subscribed(page)
              }
            }
        
          // @LINE:276
          case controllers_RelayTour_allPrivate66009_route(params) =>
            named("RelayTour.allPrivate") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  RelayTour_42.allPrivate(page)
              }
            }
        
          // @LINE:277
          case controllers_RelayTour_show66010_route(params) =>
            named("RelayTour.show") {
              call(params.fromPath[String]("ts", None), params.fromPath[RelayTourId]("id", None)) { (ts, id) =>
                  RelayTour_42.show(ts, id)
              }
            }
        
          // @LINE:281
          case controllers_RelayTour_edit66011_route(params) =>
            named("RelayTour.edit") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.edit(tourId)
              }
            }
        
          // @LINE:282
          case controllers_RelayTour_update66012_route(params) =>
            named("RelayTour.update") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.update(tourId)
              }
            }
        
          // @LINE:283
          case controllers_RelayTour_delete66013_route(params) =>
            named("RelayTour.delete") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.delete(tourId)
              }
            }
        
          // @LINE:285
          case controllers_RelayTour_cloneTour66014_route(params) =>
            named("RelayTour.cloneTour") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.cloneTour(tourId)
              }
            }
        
          // @LINE:286
          case controllers_RelayTour_subscribe66015_route(params) =>
            named("RelayTour.subscribe") {
              call(params.fromPath[RelayTourId]("tourId", None), params.fromQuery[Boolean]("set", None)) { (tourId, set) =>
                  RelayTour_42.subscribe(tourId, set)
              }
            }
        
          // @LINE:287
          case controllers_RelayRound_form66016_route(params) =>
            named("RelayRound.form") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayRound_58.form(tourId)
              }
            }
        
          // @LINE:288
          case controllers_RelayRound_create66017_route(params) =>
            named("RelayRound.create") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayRound_58.create(tourId)
              }
            }
        
          // @LINE:289
          case controllers_RelayTour_playersView66018_route(params) =>
            named("RelayTour.playersView") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.playersView(tourId)
              }
            }
        
          // @LINE:290
          case controllers_RelayTour_player66019_route(params) =>
            named("RelayTour.player") {
              call(params.fromPath[RelayTourId]("tourId", None), params.fromPath[String]("id", None)) { (tourId, id) =>
                  RelayTour_42.player(tourId, id)
              }
            }
        
          // @LINE:291
          case controllers_RelayRound_show66020_route(params) =>
            named("RelayRound.show") {
              call(params.fromPath[String]("ts", None), params.fromPath[String]("rs", None), params.fromPath[RelayRoundId]("roundId", None)) { (ts, rs, roundId) =>
                  RelayRound_58.show(ts, rs, roundId)
              }
            }
        
          // @LINE:294
          case controllers_RelayRound_chapter66021_route(params) =>
            named("RelayRound.chapter") {
              call(params.fromPath[String]("ts", None), params.fromPath[String]("rs", None), params.fromPath[RelayRoundId]("roundId", None), params.fromPath[StudyChapterId]("chapterId", None)) { (ts, rs, roundId, chapterId) =>
                  RelayRound_58.chapter(ts, rs, roundId, chapterId)
              }
            }
        
          // @LINE:295
          case controllers_RelayRound_edit66022_route(params) =>
            named("RelayRound.edit") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.edit(roundId)
              }
            }
        
          // @LINE:296
          case controllers_RelayRound_update66023_route(params) =>
            named("RelayRound.update") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.update(roundId)
              }
            }
        
          // @LINE:297
          case controllers_RelayRound_reset66024_route(params) =>
            named("RelayRound.reset") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.reset(roundId)
              }
            }
        
          // @LINE:299
          case controllers_RelayRound_stats66025_route(params) =>
            named("RelayRound.stats") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.stats(roundId)
              }
            }
        
          // @LINE:301
          case controllers_RelayRound_pgn66026_route(params) =>
            named("RelayRound.pgn") {
              call(params.fromPath[String]("ts", None), params.fromPath[String]("rs", None), params.fromPath[RelayRoundId]("roundId", None)) { (ts, rs, roundId) =>
                  RelayRound_58.pgn(ts, rs, roundId)
              }
            }
        
          // @LINE:302
          case controllers_RelayRound_teamsView66027_route(params) =>
            named("RelayRound.teamsView") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.teamsView(roundId)
              }
            }
        
      },
    
      "note" -> {
        
          // @LINE:76
          case controllers_User_deleteNote67000_route(params) =>
            named("User.deleteNote") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  User_23.deleteNote(id)
              }
            }
        
          // @LINE:77
          case controllers_User_setDoxNote67001_route(params) =>
            named("User.setDoxNote") {
              call(params.fromPath[String]("id", None), params.fromPath[Boolean]("v", None)) { (id, v) =>
                  User_23.setDoxNote(id, v)
              }
            }
        
      },
    
      "opening" -> {
        
          // @LINE:151
          case controllers_Opening_index68000_route(params) =>
            named("Opening.index") {
              call(params.fromQuery[Option[String]]("q", Some(None))) { (q) =>
                  Opening_53.index(q)
              }
            }
        
          // @LINE:152
          case controllers_Opening_config68001_route(params) =>
            named("Opening.config") {
              call(params.fromPath[String]("key", None)) { (key) =>
                  Opening_53.config(key)
              }
            }
        
          // @LINE:153
          case controllers_Opening_wikiWrite68002_route(params) =>
            named("Opening.wikiWrite") {
              call(params.fromPath[String]("key", None), params.fromPath[String]("moves", None)) { (key, moves) =>
                  Opening_53.wikiWrite(key, moves)
              }
            }
        
          // @LINE:154
          case controllers_Opening_tree68003_route(_) =>
            named("Opening.tree") {
              call { 
                  Opening_53.tree
              }
            }
        
          // @LINE:155
          case controllers_Opening_byKeyAndMoves68004_route(params) =>
            named("Opening.byKeyAndMoves") {
              call(params.fromPath[String]("key", None), Param[String]("moves", Right(""))) { (key, moves) =>
                  Opening_53.byKeyAndMoves(key, moves)
              }
            }
        
          // @LINE:156
          case controllers_Opening_byKeyAndMoves68005_route(params) =>
            named("Opening.byKeyAndMoves") {
              call(params.fromPath[String]("key", None), params.fromPath[String]("moves", None)) { (key, moves) =>
                  Opening_53.byKeyAndMoves(key, moves)
              }
            }
        
      },
    
      "video" -> {
        
          // @LINE:535
          case controllers_Video_index69000_route(_) =>
            named("Video.index") {
              call { 
                  Video_31.index
              }
            }
        
          // @LINE:536
          case controllers_Video_tags69001_route(_) =>
            named("Video.tags") {
              call { 
                  Video_31.tags
              }
            }
        
          // @LINE:537
          case controllers_Video_author69002_route(params) =>
            named("Video.author") {
              call(params.fromPath[String]("author", None)) { (author) =>
                  Video_31.author(author)
              }
            }
        
          // @LINE:538
          case controllers_Video_show69003_route(params) =>
            named("Video.show") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Video_31.show(id)
              }
            }
        
      },
    
      "blog.atom" -> {
        
          // @LINE:116
          case controllers_Main_movedPermanently70000_route(_) =>
            named("Main.movedPermanently") {
              call(Param[String]("to", Right("/@/Lichess/blog.atom"))) { (to) =>
                  Main_19.movedPermanently(to)
              }
            }
        
      },
    
      "forum" -> {
        
          // @LINE:635
          case controllers_ForumCateg_index71000_route(_) =>
            named("ForumCateg.index") {
              call { 
                  ForumCateg_33.index
              }
            }
        
          // @LINE:636
          case controllers_ForumPost_search71001_route(params) =>
            named("ForumPost.search") {
              call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
                  ForumPost_57.search(text, page)
              }
            }
        
          // @LINE:637
          case controllers_ForumCateg_show71002_route(params) =>
            named("ForumCateg.show") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromQuery[Int]("page", Some(1))) { (categId, page) =>
                  ForumCateg_33.show(categId, page)
              }
            }
        
          // @LINE:638
          case controllers_ForumTopic_form71003_route(params) =>
            named("ForumTopic.form") {
              call(params.fromPath[ForumCategId]("categId", None)) { (categId) =>
                  ForumTopic_21.form(categId)
              }
            }
        
          // @LINE:639
          case controllers_ForumTopic_create71004_route(params) =>
            named("ForumTopic.create") {
              call(params.fromPath[ForumCategId]("categId", None)) { (categId) =>
                  ForumTopic_21.create(categId)
              }
            }
        
          // @LINE:640
          case controllers_ForumCateg_modFeed71005_route(params) =>
            named("ForumCateg.modFeed") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromQuery[Int]("page", Some(1))) { (categId, page) =>
                  ForumCateg_33.modFeed(categId, page)
              }
            }
        
          // @LINE:641
          case controllers_ForumTopic_participants71006_route(params) =>
            named("ForumTopic.participants") {
              call(params.fromPath[ForumTopicId]("topicId", None)) { (topicId) =>
                  ForumTopic_21.participants(topicId)
              }
            }
        
          // @LINE:642
          case controllers_ForumTopic_show71007_route(params) =>
            named("ForumTopic.show") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromPath[ForumTopicSlug]("slug", None), params.fromQuery[Int]("page", Some(1))) { (categId, slug, page) =>
                  ForumTopic_21.show(categId, slug, page)
              }
            }
        
          // @LINE:643
          case controllers_ForumTopic_close71008_route(params) =>
            named("ForumTopic.close") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromPath[ForumTopicSlug]("slug", None)) { (categId, slug) =>
                  ForumTopic_21.close(categId, slug)
              }
            }
        
          // @LINE:644
          case controllers_ForumTopic_sticky71009_route(params) =>
            named("ForumTopic.sticky") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromPath[ForumTopicSlug]("slug", None)) { (categId, slug) =>
                  ForumTopic_21.sticky(categId, slug)
              }
            }
        
          // @LINE:645
          case controllers_ForumPost_create71010_route(params) =>
            named("ForumPost.create") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromPath[ForumTopicSlug]("slug", None), params.fromQuery[Int]("page", Some(1))) { (categId, slug, page) =>
                  ForumPost_57.create(categId, slug, page)
              }
            }
        
          // @LINE:646
          case controllers_ForumPost_delete71011_route(params) =>
            named("ForumPost.delete") {
              call(params.fromPath[ForumPostId]("id", None)) { (id) =>
                  ForumPost_57.delete(id)
              }
            }
        
          // @LINE:647
          case controllers_ForumPost_relocate71012_route(params) =>
            named("ForumPost.relocate") {
              call(params.fromPath[ForumPostId]("id", None)) { (id) =>
                  ForumPost_57.relocate(id)
              }
            }
        
          // @LINE:648
          case controllers_ForumPost_react71013_route(params) =>
            named("ForumPost.react") {
              call(params.fromPath[ForumCategId]("categId", None), params.fromPath[ForumPostId]("id", None), params.fromPath[String]("reaction", None), params.fromPath[Boolean]("v", None)) { (categId, id, reaction, v) =>
                  ForumPost_57.react(categId, id, reaction, v)
              }
            }
        
          // @LINE:649
          case controllers_ForumPost_edit71014_route(params) =>
            named("ForumPost.edit") {
              call(params.fromPath[ForumPostId]("id", None)) { (id) =>
                  ForumPost_57.edit(id)
              }
            }
        
          // @LINE:650
          case controllers_ForumPost_redirect71015_route(params) =>
            named("ForumPost.redirect") {
              call(params.fromPath[ForumPostId]("id", None)) { (id) =>
                  ForumPost_57.redirect(id)
              }
            }
        
      },
    
      "upload" -> {
        
          // @LINE:139
          case controllers_Ublog_image72000_route(params) =>
            named("Ublog.image") {
              call(params.fromPath[UblogPostId]("id", None)) { (id) =>
                  Ublog_7.image(id)
              }
            }
        
          // @LINE:284
          case controllers_RelayTour_image72001_route(params) =>
            named("RelayTour.image") {
              call(params.fromPath[RelayTourId]("id", None), params.fromQuery[Option[String]]("tag", Some(None))) { (id, tag) =>
                  RelayTour_42.image(id, tag)
              }
            }
        
          // @LINE:358
          case controllers_Streamer_pictureApply72002_route(_) =>
            named("Streamer.pictureApply") {
              call { 
                  Streamer_27.pictureApply
              }
            }
        
          // @LINE:670
          case controllers_Coach_pictureApply72003_route(_) =>
            named("Coach.pictureApply") {
              call { 
                  Coach_60.pictureApply
              }
            }
        
          // @LINE:890
          case controllers_Main_uploadImage72004_route(params) =>
            named("Main.uploadImage") {
              call(params.fromPath[String]("rel", None)) { (rel) =>
                  Main_19.uploadImage(rel)
              }
            }
        
          // @LINE:901
          case controllers_TitleVerify_image72005_route(params) =>
            named("TitleVerify.image") {
              call(params.fromPath[TitleRequestId]("id", None), params.fromQuery[String]("tag", None)) { (id, tag) =>
                  TitleVerify_0.image(id, tag)
              }
            }
        
      },
    
      "feed" -> {
        
          // @LINE:142
          case controllers_Feed_index73000_route(params) =>
            named("Feed.index") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Feed_12.index(page)
              }
            }
        
          // @LINE:143
          case controllers_Feed_createForm73001_route(_) =>
            named("Feed.createForm") {
              call { 
                  Feed_12.createForm
              }
            }
        
          // @LINE:144
          case controllers_Feed_create73002_route(_) =>
            named("Feed.create") {
              call { 
                  Feed_12.create
              }
            }
        
          // @LINE:145
          case controllers_Feed_edit73003_route(params) =>
            named("Feed.edit") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Feed_12.edit(id)
              }
            }
        
          // @LINE:146
          case controllers_Feed_update73004_route(params) =>
            named("Feed.update") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Feed_12.update(id)
              }
            }
        
          // @LINE:147
          case controllers_Feed_delete73005_route(params) =>
            named("Feed.delete") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Feed_12.delete(id)
              }
            }
        
      },
    
      "team" -> {
        
          // @LINE:691
          case prefixed_team_Routes_0_74000(handler) => handler
        
      },
    
      "lobby" -> {
        
          // @LINE:5
          case controllers_Lobby_seeks75000_route(_) =>
            named("Lobby.seeks") {
              call { 
                  Lobby_59.seeks
              }
            }
        
      },
    
      "timeline" -> {
        
          // @LINE:15
          case controllers_Timeline_home76000_route(_) =>
            named("Timeline.home") {
              call { 
                  Timeline_17.home
              }
            }
        
          // @LINE:17
          case controllers_Timeline_unsub76001_route(params) =>
            named("Timeline.unsub") {
              call(params.fromPath[String]("channel", None)) { (channel) =>
                  Timeline_17.unsub(channel)
              }
            }
        
      },
    
      "report" -> {
        
          // @LINE:693
          case prefixed_report_Routes_2_77000(handler) => handler
        
      },
    
      "developers" -> {
        
          // @LINE:880
          case controllers_Main_webmasters78000_route(_) =>
            named("Main.webmasters") {
              call { 
                  Main_19.webmasters
              }
            }
        
      },
    
      "class" -> {
        
          // @LINE:694
          case prefixed_clas_Routes_3_79000(handler) => handler
        
      },
    
      "round" -> {
        
          // @LINE:402
          case controllers_Round_help80000_route(_) =>
            named("Round.help") {
              call { 
                  Round_34.help
              }
            }
        
      },
    
      "account" -> {
        
          // @LINE:12
          case controllers_Account_info81000_route(_) =>
            named("Account.info") {
              call { 
                  Account_10.info
              }
            }
        
          // @LINE:507
          case controllers_Pref_network81001_route(_) =>
            named("Pref.network") {
              call { 
                  Pref_3.network
              }
            }
        
          // @LINE:508
          case controllers_Pref_networkPost81002_route(_) =>
            named("Pref.networkPost") {
              call { 
                  Pref_3.networkPost
              }
            }
        
          // @LINE:509
          case controllers_Pref_form81003_route(params) =>
            named("Pref.form") {
              call(params.fromPath[String]("categ", None)) { (categ) =>
                  Pref_3.form(categ)
              }
            }
        
          // @LINE:510
          case controllers_Pref_formApply81004_route(_) =>
            named("Pref.formApply") {
              call { 
                  Pref_3.formApply
              }
            }
        
          // @LINE:511
          case controllers_Pref_notifyFormApply81005_route(_) =>
            named("Pref.notifyFormApply") {
              call { 
                  Pref_3.notifyFormApply
              }
            }
        
          // @LINE:803
          case controllers_Account_passwd81006_route(_) =>
            named("Account.passwd") {
              call { 
                  Account_10.passwd
              }
            }
        
          // @LINE:804
          case controllers_Account_passwdApply81007_route(_) =>
            named("Account.passwdApply") {
              call { 
                  Account_10.passwdApply
              }
            }
        
          // @LINE:805
          case controllers_Account_email81008_route(_) =>
            named("Account.email") {
              call { 
                  Account_10.email
              }
            }
        
          // @LINE:806
          case controllers_Account_emailApply81009_route(_) =>
            named("Account.emailApply") {
              call { 
                  Account_10.emailApply
              }
            }
        
          // @LINE:808
          case controllers_Account_emailConfirm81010_route(params) =>
            named("Account.emailConfirm") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Account_10.emailConfirm(token)
              }
            }
        
          // @LINE:809
          case controllers_Account_close81011_route(_) =>
            named("Account.close") {
              call { 
                  Account_10.close
              }
            }
        
          // @LINE:810
          case controllers_Account_closeConfirm81012_route(_) =>
            named("Account.closeConfirm") {
              call { 
                  Account_10.closeConfirm
              }
            }
        
          // @LINE:811
          case controllers_Account_delete81013_route(_) =>
            named("Account.delete") {
              call { 
                  Account_10.delete
              }
            }
        
          // @LINE:812
          case controllers_Account_deleteConfirm81014_route(_) =>
            named("Account.deleteConfirm") {
              call { 
                  Account_10.deleteConfirm
              }
            }
        
          // @LINE:813
          case controllers_Account_deleteDone81015_route(_) =>
            named("Account.deleteDone") {
              call { 
                  Account_10.deleteDone
              }
            }
        
          // @LINE:814
          case controllers_Account_profile81016_route(_) =>
            named("Account.profile") {
              call { 
                  Account_10.profile
              }
            }
        
          // @LINE:815
          case controllers_Account_profileApply81017_route(_) =>
            named("Account.profileApply") {
              call { 
                  Account_10.profileApply
              }
            }
        
          // @LINE:816
          case controllers_Account_username81018_route(_) =>
            named("Account.username") {
              call { 
                  Account_10.username
              }
            }
        
          // @LINE:817
          case controllers_Account_usernameApply81019_route(_) =>
            named("Account.usernameApply") {
              call { 
                  Account_10.usernameApply
              }
            }
        
          // @LINE:818
          case controllers_Account_kid81020_route(_) =>
            named("Account.kid") {
              call { 
                  Account_10.kid
              }
            }
        
          // @LINE:819
          case controllers_Account_kidPost81021_route(_) =>
            named("Account.kidPost") {
              call { 
                  Account_10.kidPost
              }
            }
        
          // @LINE:820
          case controllers_Account_twoFactor81022_route(_) =>
            named("Account.twoFactor") {
              call { 
                  Account_10.twoFactor
              }
            }
        
          // @LINE:821
          case controllers_Account_setupTwoFactor81023_route(_) =>
            named("Account.setupTwoFactor") {
              call { 
                  Account_10.setupTwoFactor
              }
            }
        
          // @LINE:822
          case controllers_Account_disableTwoFactor81024_route(_) =>
            named("Account.disableTwoFactor") {
              call { 
                  Account_10.disableTwoFactor
              }
            }
        
          // @LINE:823
          case controllers_Account_reopen81025_route(_) =>
            named("Account.reopen") {
              call { 
                  Account_10.reopen
              }
            }
        
          // @LINE:824
          case controllers_Account_reopenApply81026_route(_) =>
            named("Account.reopenApply") {
              call { 
                  Account_10.reopenApply
              }
            }
        
          // @LINE:825
          case controllers_Account_reopenSent81027_route(_) =>
            named("Account.reopenSent") {
              call { 
                  Account_10.reopenSent
              }
            }
        
          // @LINE:826
          case controllers_Account_reopenLogin81028_route(params) =>
            named("Account.reopenLogin") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Account_10.reopenLogin(token)
              }
            }
        
          // @LINE:827
          case controllers_Account_data81029_route(_) =>
            named("Account.data") {
              call { 
                  Account_10.data
              }
            }
        
          // @LINE:830
          case controllers_Account_security81030_route(_) =>
            named("Account.security") {
              call { 
                  Account_10.security
              }
            }
        
          // @LINE:831
          case controllers_Account_signout81031_route(params) =>
            named("Account.signout") {
              call(params.fromPath[String]("sessionId", None)) { (sessionId) =>
                  Account_10.signout(sessionId)
              }
            }
        
          // @LINE:832
          case controllers_Account_nowPlaying81032_route(_) =>
            named("Account.nowPlaying") {
              call { 
                  Account_10.nowPlaying
              }
            }
        
          // @LINE:856
          case controllers_OAuthToken_index81033_route(_) =>
            named("OAuthToken.index") {
              call { 
                  OAuthToken_55.index
              }
            }
        
          // @LINE:857
          case controllers_OAuthToken_create81034_route(_) =>
            named("OAuthToken.create") {
              call { 
                  OAuthToken_55.create
              }
            }
        
          // @LINE:858
          case controllers_OAuthToken_createApply81035_route(_) =>
            named("OAuthToken.createApply") {
              call { 
                  OAuthToken_55.createApply
              }
            }
        
          // @LINE:859
          case controllers_OAuthToken_delete81036_route(params) =>
            named("OAuthToken.delete") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  OAuthToken_55.delete(id)
              }
            }
        
      },
    
      "api" -> {
        
          // @LINE:16
          case controllers_Timeline_api82000_route(_) =>
            named("Timeline.api") {
              call { 
                  Timeline_17.api
              }
            }
        
          // @LINE:24
          case controllers_Game_exportByIds82001_route(_) =>
            named("Game.exportByIds") {
              call { 
                  Game_8.exportByIds
              }
            }
        
          // @LINE:42
          case controllers_Tv_channels82002_route(_) =>
            named("Tv.channels") {
              call { 
                  Tv_20.channels
              }
            }
        
          // @LINE:43
          case controllers_Tv_feedDefault82003_route(_) =>
            named("Tv.feedDefault") {
              call { 
                  Tv_20.feedDefault
              }
            }
        
          // @LINE:44
          case controllers_Tv_feed82004_route(params) =>
            named("Tv.feed") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.feed(chanKey)
              }
            }
        
          // @LINE:45
          case controllers_Tv_apiGamesChannel82005_route(params) =>
            named("Tv.apiGamesChannel") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.apiGamesChannel(chanKey)
              }
            }
        
          // @LINE:48
          case controllers_Relation_apiFollowing82006_route(_) =>
            named("Relation.apiFollowing") {
              call { 
                  Relation_65.apiFollowing
              }
            }
        
          // @LINE:49
          case controllers_Relation_follow82007_route(params) =>
            named("Relation.follow") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Relation_65.follow(user)
              }
            }
        
          // @LINE:50
          case controllers_Relation_unfollow82008_route(params) =>
            named("Relation.unfollow") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Relation_65.unfollow(user)
              }
            }
        
          // @LINE:51
          case controllers_Relation_block82009_route(params) =>
            named("Relation.block") {
              call(params.fromPath[UserStr]("userId", None)) { (userId) =>
                  Relation_65.block(userId)
              }
            }
        
          // @LINE:52
          case controllers_Relation_unblock82010_route(params) =>
            named("Relation.unblock") {
              call(params.fromPath[UserStr]("userId", None)) { (userId) =>
                  Relation_65.unblock(userId)
              }
            }
        
          // @LINE:74
          case controllers_User_mod82011_route(params) =>
            named("User.mod") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  User_23.mod(username)
              }
            }
        
          // @LINE:92
          case controllers_User_topNbApi82012_route(params) =>
            named("User.topNbApi") {
              call(params.fromPath[Int]("nb", None), params.fromPath[PerfKey]("perfKey", None)) { (nb, perfKey) =>
                  User_23.topNbApi(nb, perfKey)
              }
            }
        
          // @LINE:95
          case controllers_User_autocomplete82013_route(_) =>
            named("User.autocomplete") {
              call { 
                  User_23.autocomplete
              }
            }
        
          // @LINE:96
          case controllers_User_apiList82014_route(_) =>
            named("User.apiList") {
              call { 
                  User_23.apiList
              }
            }
        
          // @LINE:104
          case controllers_Fide_apiShow82015_route(params) =>
            named("Fide.apiShow") {
              call(params.fromPath[chess.FideId]("id", None)) { (id) =>
                  Fide_36.apiShow(id)
              }
            }
        
          // @LINE:105
          case controllers_Fide_apiSearch82016_route(params) =>
            named("Fide.apiSearch") {
              call(params.fromQuery[String]("q", None)) { (q) =>
                  Fide_36.apiSearch(q)
              }
            }
        
          // @LINE:196
          case controllers_Puzzle_apiStreak82017_route(_) =>
            named("Puzzle.apiStreak") {
              call { 
                  Puzzle_52.apiStreak
              }
            }
        
          // @LINE:197
          case controllers_Puzzle_apiStreakResult82018_route(params) =>
            named("Puzzle.apiStreakResult") {
              call(params.fromPath[Int]("score", None)) { (score) =>
                  Puzzle_52.apiStreakResult(score)
              }
            }
        
          // @LINE:205
          case controllers_Storm_apiGet82019_route(_) =>
            named("Storm.apiGet") {
              call { 
                  Storm_39.apiGet
              }
            }
        
          // @LINE:206
          case controllers_Storm_apiDashboardOf82020_route(params) =>
            named("Storm.apiDashboardOf") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("days", Some(30))) { (username, days) =>
                  Storm_39.apiDashboardOf(username, days)
              }
            }
        
          // @LINE:212
          case controllers_Racer_apiCreate82021_route(_) =>
            named("Racer.apiCreate") {
              call { 
                  Racer_49.apiCreate
              }
            }
        
          // @LINE:259
          case controllers_Study_apiPgn82022_route(params) =>
            named("Study.apiPgn") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.apiPgn(id)
              }
            }
        
          // @LINE:260
          case controllers_Study_apiChapterPgn82023_route(params) =>
            named("Study.apiChapterPgn") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.apiChapterPgn(id, chapterId)
              }
            }
        
          // @LINE:261
          case controllers_Study_apiChapterDelete82024_route(params) =>
            named("Study.apiChapterDelete") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.apiChapterDelete(id, chapterId)
              }
            }
        
          // @LINE:262
          case controllers_Study_apiListByOwner82025_route(params) =>
            named("Study.apiListByOwner") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Study_63.apiListByOwner(user)
              }
            }
        
          // @LINE:263
          case controllers_Study_apiImportPgn82026_route(params) =>
            named("Study.apiImportPgn") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.apiImportPgn(id)
              }
            }
        
          // @LINE:274
          case controllers_RelayTour_apiBy82027_route(params) =>
            named("RelayTour.apiBy") {
              call(params.fromPath[UserStr]("user", None), params.fromQuery[Int]("page", Some(1))) { (user, page) =>
                  RelayTour_42.apiBy(user, page)
              }
            }
        
          // @LINE:279
          case controllers_RelayTour_apiShow82028_route(params) =>
            named("RelayTour.apiShow") {
              call(params.fromPath[RelayTourId]("id", None)) { (id) =>
                  RelayTour_42.apiShow(id)
              }
            }
        
          // @LINE:280
          case controllers_RelayTour_pgn82029_route(params) =>
            named("RelayTour.pgn") {
              call(params.fromPath[RelayTourId]("tourId", None)) { (tourId) =>
                  RelayTour_42.pgn(tourId)
              }
            }
        
          // @LINE:292
          case controllers_RelayRound_apiShow82030_route(params) =>
            named("RelayRound.apiShow") {
              call(params.fromPath[String]("ts", None), params.fromPath[String]("rs", None), params.fromPath[RelayRoundId]("roundId", None)) { (ts, rs, roundId) =>
                  RelayRound_58.apiShow(ts, rs, roundId)
              }
            }
        
          // @LINE:298
          case controllers_RelayRound_reset82031_route(params) =>
            named("RelayRound.reset") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.reset(roundId)
              }
            }
        
          // @LINE:300
          case controllers_RelayRound_push82032_route(params) =>
            named("RelayRound.push") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.push(roundId)
              }
            }
        
          // @LINE:303
          case controllers_RelayRound_apiPgn82033_route(params) =>
            named("RelayRound.apiPgn") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.apiPgn(roundId)
              }
            }
        
          // @LINE:304
          case controllers_RelayRound_stream82034_route(params) =>
            named("RelayRound.stream") {
              call(params.fromPath[RelayRoundId]("roundId", None)) { (roundId) =>
                  RelayRound_58.stream(roundId)
              }
            }
        
          // @LINE:305
          case controllers_RelayTour_apiIndex82035_route(_) =>
            named("RelayTour.apiIndex") {
              call { 
                  RelayTour_42.apiIndex
              }
            }
        
          // @LINE:306
          case controllers_RelayTour_apiTop82036_route(params) =>
            named("RelayTour.apiTop") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  RelayTour_42.apiTop(page)
              }
            }
        
          // @LINE:307
          case controllers_RelayTour_apiSearch82037_route(params) =>
            named("RelayTour.apiSearch") {
              call(params.fromQuery[Int]("page", Some(1)), params.fromQuery[String]("q", Some(""))) { (page, q) =>
                  RelayTour_42.apiSearch(page, q)
              }
            }
        
          // @LINE:308
          case controllers_RelayRound_apiMyRounds82038_route(_) =>
            named("RelayRound.apiMyRounds") {
              call { 
                  RelayRound_58.apiMyRounds
              }
            }
        
          // @LINE:330
          case controllers_Plan_apiStripeCheckout82039_route(_) =>
            named("Plan.apiStripeCheckout") {
              call { 
                  Plan_46.apiStripeCheckout
              }
            }
        
          // @LINE:331
          case controllers_Plan_apiCurrencies82040_route(_) =>
            named("Plan.apiCurrencies") {
              call { 
                  Plan_46.apiCurrencies
              }
            }
        
          // @LINE:348
          case controllers_Streamer_featured82041_route(_) =>
            named("Streamer.featured") {
              call { 
                  Streamer_27.featured
              }
            }
        
          // @LINE:349
          case controllers_Streamer_live82042_route(_) =>
            named("Streamer.live") {
              call { 
                  Streamer_27.live
              }
            }
        
          // @LINE:351
          case controllers_Streamer_onYouTubeVideo82043_route(_) =>
            named("Streamer.onYouTubeVideo") {
              call { 
                  Streamer_27.onYouTubeVideo
              }
            }
        
          // @LINE:352
          case controllers_Streamer_youTubePubSubChallenge82044_route(_) =>
            named("Streamer.youTubePubSubChallenge") {
              call { 
                  Streamer_27.youTubePubSubChallenge
              }
            }
        
          // @LINE:454
          case controllers_Swiss_scheduleNextRound82045_route(params) =>
            named("Swiss.scheduleNextRound") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.scheduleNextRound(id)
              }
            }
        
          // @LINE:475
          case controllers_TeamApi_all82046_route(params) =>
            named("TeamApi.all") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  TeamApi_1.all(page)
              }
            }
        
          // @LINE:476
          case controllers_TeamApi_search82047_route(params) =>
            named("TeamApi.search") {
              call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
                  TeamApi_1.search(text, page)
              }
            }
        
          // @LINE:477
          case controllers_TeamApi_teamsOf82048_route(params) =>
            named("TeamApi.teamsOf") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  TeamApi_1.teamsOf(username)
              }
            }
        
          // @LINE:478
          case controllers_TeamApi_show82049_route(params) =>
            named("TeamApi.show") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  TeamApi_1.show(id)
              }
            }
        
          // @LINE:479
          case controllers_TeamApi_users82050_route(params) =>
            named("TeamApi.users") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  TeamApi_1.users(id)
              }
            }
        
          // @LINE:480
          case controllers_Tournament_byTeam82051_route(params) =>
            named("Tournament.byTeam") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Tournament_5.byTeam(id)
              }
            }
        
          // @LINE:481
          case controllers_Swiss_byTeam82052_route(params) =>
            named("Swiss.byTeam") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Swiss_32.byTeam(id)
              }
            }
        
          // @LINE:482
          case controllers_TeamApi_requests82053_route(params) =>
            named("TeamApi.requests") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  TeamApi_1.requests(id)
              }
            }
        
          // @LINE:483
          case controllers_TeamApi_update82054_route(params) =>
            named("TeamApi.update") {
              call(params.fromPath[TeamId]("id", None), params.fromPath[String]("name", None)) { (id, name) =>
                  TeamApi_1.update(id, name)
              }
            }
        
          // @LINE:484
          case controllers_TeamApi_requestProcess82055_route(params) =>
            named("TeamApi.requestProcess") {
              call(params.fromPath[TeamId]("id", None), params.fromPath[UserStr]("userId", None), params.fromPath[String]("decision", None)) { (id, userId, decision) =>
                  TeamApi_1.requestProcess(id, userId, decision)
              }
            }
        
          // @LINE:485
          case controllers_TeamApi_kickUser82056_route(params) =>
            named("TeamApi.kickUser") {
              call(params.fromPath[TeamId]("id", None), params.fromPath[UserStr]("user", None)) { (id, user) =>
                  TeamApi_1.kickUser(id, user)
              }
            }
        
          // @LINE:623
          case controllers_Mod_eventStream82057_route(_) =>
            named("Mod.eventStream") {
              call { 
                  Mod_62.eventStream
              }
            }
        
          // @LINE:624
          case controllers_Mod_markedUsersStream82058_route(_) =>
            named("Mod.markedUsersStream") {
              call { 
                  Mod_62.markedUsersStream
              }
            }
        
          // @LINE:629
          case controllers_Irwin_eventStream82059_route(_) =>
            named("Irwin.eventStream") {
              call { 
                  Irwin_50.eventStream
              }
            }
        
          // @LINE:686
          case controllers_Api_mobileHome82060_route(_) =>
            named("Api.mobileHome") {
              call { 
                  Api_66.mobileHome
              }
            }
        
          // @LINE:687
          case controllers_Api_mobileWatch82061_route(_) =>
            named("Api.mobileWatch") {
              call { 
                  Api_66.mobileWatch
              }
            }
        
          // @LINE:688
          case controllers_Api_mobileProfile82062_route(params) =>
            named("Api.mobileProfile") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Api_66.mobileProfile(username)
              }
            }
        
          // @LINE:689
          case controllers_Api_mobileGames82063_route(_) =>
            named("Api.mobileGames") {
              call { 
                  Api_66.mobileGames
              }
            }
        
          // @LINE:700
          case controllers_Api_index82064_route(_) =>
            named("Api.index") {
              call { 
                  Api_66.index
              }
            }
        
          // @LINE:701
          case controllers_Api_usersByIds82065_route(_) =>
            named("Api.usersByIds") {
              call { 
                  Api_66.usersByIds
              }
            }
        
          // @LINE:702
          case controllers_Puzzle_apiDaily82066_route(_) =>
            named("Puzzle.apiDaily") {
              call { 
                  Puzzle_52.apiDaily
              }
            }
        
          // @LINE:703
          case controllers_Puzzle_activity82067_route(_) =>
            named("Puzzle.activity") {
              call { 
                  Puzzle_52.activity
              }
            }
        
          // @LINE:704
          case controllers_Puzzle_apiDashboard82068_route(params) =>
            named("Puzzle.apiDashboard") {
              call(params.fromPath[Days]("days", None)) { (days) =>
                  Puzzle_52.apiDashboard(days)
              }
            }
        
          // @LINE:705
          case controllers_Puzzle_apiShow82069_route(params) =>
            named("Puzzle.apiShow") {
              call(params.fromPath[PuzzleId]("id", None)) { (id) =>
                  Puzzle_52.apiShow(id)
              }
            }
        
          // @LINE:706
          case controllers_Puzzle_apiNext82070_route(_) =>
            named("Puzzle.apiNext") {
              call { 
                  Puzzle_52.apiNext
              }
            }
        
          // @LINE:707
          case controllers_Puzzle_apiBatchSelect82071_route(params) =>
            named("Puzzle.apiBatchSelect") {
              call(params.fromPath[String]("angle", None)) { (angle) =>
                  Puzzle_52.apiBatchSelect(angle)
              }
            }
        
          // @LINE:708
          case controllers_Puzzle_apiBatchSolve82072_route(params) =>
            named("Puzzle.apiBatchSolve") {
              call(params.fromPath[String]("angle", None)) { (angle) =>
                  Puzzle_52.apiBatchSolve(angle)
              }
            }
        
          // @LINE:709
          case controllers_Puzzle_apiReplay82073_route(params) =>
            named("Puzzle.apiReplay") {
              call(params.fromPath[Days]("days", None), params.fromPath[String]("theme", None)) { (days, theme) =>
                  Puzzle_52.apiReplay(days, theme)
              }
            }
        
          // @LINE:710
          case controllers_UserTournament_apiTournamentsByOwner82074_route(params) =>
            named("UserTournament.apiTournamentsByOwner") {
              call(params.fromPath[UserStr]("user", None), params.fromQuery[List[Int]]("status", None)) { (user, status) =>
                  UserTournament_51.apiTournamentsByOwner(user, status)
              }
            }
        
          // @LINE:711
          case controllers_UserTournament_apiTournamentsByPlayer82075_route(params) =>
            named("UserTournament.apiTournamentsByPlayer") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  UserTournament_51.apiTournamentsByPlayer(user)
              }
            }
        
          // @LINE:712
          case controllers_Api_user82076_route(params) =>
            named("Api.user") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Api_66.user(user)
              }
            }
        
          // @LINE:713
          case controllers_Api_activity82077_route(params) =>
            named("Api.activity") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Api_66.activity(user)
              }
            }
        
          // @LINE:714
          case controllers_User_apiReadNote82078_route(params) =>
            named("User.apiReadNote") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  User_23.apiReadNote(user)
              }
            }
        
          // @LINE:715
          case controllers_User_apiWriteNote82079_route(params) =>
            named("User.apiWriteNote") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  User_23.apiWriteNote(user)
              }
            }
        
          // @LINE:716
          case controllers_User_ratingHistory82080_route(params) =>
            named("User.ratingHistory") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  User_23.ratingHistory(user)
              }
            }
        
          // @LINE:717
          case controllers_User_tvExport82081_route(params) =>
            named("User.tvExport") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  User_23.tvExport(user)
              }
            }
        
          // @LINE:718
          case controllers_Api_perfStat82082_route(params) =>
            named("Api.perfStat") {
              call(params.fromPath[UserStr]("user", None), params.fromPath[PerfKey]("perfKey", None)) { (user, perfKey) =>
                  Api_66.perfStat(user, perfKey)
              }
            }
        
          // @LINE:719
          case controllers_Mod_apiUserLog82083_route(params) =>
            named("Mod.apiUserLog") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Mod_62.apiUserLog(user)
              }
            }
        
          // @LINE:720
          case controllers_Api_game82084_route(params) =>
            named("Api.game") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  Api_66.game(id)
              }
            }
        
          // @LINE:721
          case controllers_Api_currentTournaments82085_route(_) =>
            named("Api.currentTournaments") {
              call { 
                  Api_66.currentTournaments
              }
            }
        
          // @LINE:722
          case controllers_Tournament_apiShow82086_route(params) =>
            named("Tournament.apiShow") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiShow(id)
              }
            }
        
          // @LINE:723
          case controllers_Api_tournamentGames82087_route(params) =>
            named("Api.tournamentGames") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Api_66.tournamentGames(id)
              }
            }
        
          // @LINE:724
          case controllers_Api_tournamentResults82088_route(params) =>
            named("Api.tournamentResults") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Api_66.tournamentResults(id)
              }
            }
        
          // @LINE:725
          case controllers_Api_tournamentTeams82089_route(params) =>
            named("Api.tournamentTeams") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Api_66.tournamentTeams(id)
              }
            }
        
          // @LINE:726
          case controllers_Tournament_apiCreate82090_route(_) =>
            named("Tournament.apiCreate") {
              call { 
                  Tournament_5.apiCreate
              }
            }
        
          // @LINE:727
          case controllers_Tournament_apiUpdate82091_route(params) =>
            named("Tournament.apiUpdate") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiUpdate(id)
              }
            }
        
          // @LINE:728
          case controllers_Tournament_apiJoin82092_route(params) =>
            named("Tournament.apiJoin") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiJoin(id)
              }
            }
        
          // @LINE:729
          case controllers_Tournament_apiWithdraw82093_route(params) =>
            named("Tournament.apiWithdraw") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiWithdraw(id)
              }
            }
        
          // @LINE:730
          case controllers_Tournament_apiTerminate82094_route(params) =>
            named("Tournament.apiTerminate") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiTerminate(id)
              }
            }
        
          // @LINE:731
          case controllers_Tournament_apiTeamBattleUpdate82095_route(params) =>
            named("Tournament.apiTeamBattleUpdate") {
              call(params.fromPath[TourId]("id", None)) { (id) =>
                  Tournament_5.apiTeamBattleUpdate(id)
              }
            }
        
          // @LINE:732
          case controllers_Swiss_apiCreate82096_route(params) =>
            named("Swiss.apiCreate") {
              call(params.fromPath[TeamId]("teamId", None)) { (teamId) =>
                  Swiss_32.apiCreate(teamId)
              }
            }
        
          // @LINE:733
          case controllers_Swiss_apiUpdate82097_route(params) =>
            named("Swiss.apiUpdate") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.apiUpdate(id)
              }
            }
        
          // @LINE:734
          case controllers_Swiss_join82098_route(params) =>
            named("Swiss.join") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.join(id)
              }
            }
        
          // @LINE:735
          case controllers_Swiss_withdraw82099_route(params) =>
            named("Swiss.withdraw") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.withdraw(id)
              }
            }
        
          // @LINE:736
          case controllers_Swiss_apiTerminate82100_route(params) =>
            named("Swiss.apiTerminate") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.apiTerminate(id)
              }
            }
        
          // @LINE:737
          case controllers_Swiss_apiShow82101_route(params) =>
            named("Swiss.apiShow") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Swiss_32.apiShow(id)
              }
            }
        
          // @LINE:738
          case controllers_Api_swissGames82102_route(params) =>
            named("Api.swissGames") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Api_66.swissGames(id)
              }
            }
        
          // @LINE:739
          case controllers_Api_swissResults82103_route(params) =>
            named("Api.swissResults") {
              call(params.fromPath[SwissId]("id", None)) { (id) =>
                  Api_66.swissResults(id)
              }
            }
        
          // @LINE:740
          case controllers_Simul_apiList82104_route(_) =>
            named("Simul.apiList") {
              call { 
                  Simul_56.apiList
              }
            }
        
          // @LINE:741
          case controllers_Api_status82105_route(_) =>
            named("Api.status") {
              call { 
                  Api_66.status
              }
            }
        
          // @LINE:742
          case controllers_Api_usersStatus82106_route(_) =>
            named("Api.usersStatus") {
              call { 
                  Api_66.usersStatus
              }
            }
        
          // @LINE:743
          case controllers_Api_crosstable82107_route(params) =>
            named("Api.crosstable") {
              call(params.fromPath[UserStr]("u1", None), params.fromPath[UserStr]("u2", None)) { (u1, u2) =>
                  Api_66.crosstable(u1, u2)
              }
            }
        
          // @LINE:744
          case controllers_Api_gamesByUsersStream82108_route(_) =>
            named("Api.gamesByUsersStream") {
              call { 
                  Api_66.gamesByUsersStream
              }
            }
        
          // @LINE:745
          case controllers_Api_gamesByIdsStream82109_route(params) =>
            named("Api.gamesByIdsStream") {
              call(params.fromPath[String]("streamId", None)) { (streamId) =>
                  Api_66.gamesByIdsStream(streamId)
              }
            }
        
          // @LINE:746
          case controllers_Api_gamesByIdsStreamAddIds82110_route(params) =>
            named("Api.gamesByIdsStreamAddIds") {
              call(params.fromPath[String]("streamId", None)) { (streamId) =>
                  Api_66.gamesByIdsStreamAddIds(streamId)
              }
            }
        
          // @LINE:747
          case controllers_Api_eventStream82111_route(_) =>
            named("Api.eventStream") {
              call { 
                  Api_66.eventStream
              }
            }
        
          // @LINE:748
          case controllers_Api_moveStream82112_route(params) =>
            named("Api.moveStream") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  Api_66.moveStream(id)
              }
            }
        
          // @LINE:749
          case controllers_Account_apiMe82113_route(_) =>
            named("Account.apiMe") {
              call { 
                  Account_10.apiMe
              }
            }
        
          // @LINE:750
          case controllers_Account_apiNowPlaying82114_route(_) =>
            named("Account.apiNowPlaying") {
              call { 
                  Account_10.apiNowPlaying
              }
            }
        
          // @LINE:751
          case controllers_Account_apiEmail82115_route(_) =>
            named("Account.apiEmail") {
              call { 
                  Account_10.apiEmail
              }
            }
        
          // @LINE:752
          case controllers_Account_apiKid82116_route(_) =>
            named("Account.apiKid") {
              call { 
                  Account_10.apiKid
              }
            }
        
          // @LINE:753
          case controllers_Account_apiKidPost82117_route(_) =>
            named("Account.apiKidPost") {
              call { 
                  Account_10.apiKidPost
              }
            }
        
          // @LINE:754
          case controllers_Pref_apiGet82118_route(_) =>
            named("Pref.apiGet") {
              call { 
                  Pref_3.apiGet
              }
            }
        
          // @LINE:755
          case controllers_Pref_apiSet82119_route(params) =>
            named("Pref.apiSet") {
              call(params.fromPath[String]("name", None)) { (name) =>
                  Pref_3.apiSet(name)
              }
            }
        
          // @LINE:756
          case controllers_Challenge_apiList82120_route(_) =>
            named("Challenge.apiList") {
              call { 
                  Challenge_35.apiList
              }
            }
        
          // @LINE:757
          case controllers_Setup_apiAi82121_route(_) =>
            named("Setup.apiAi") {
              call { 
                  Setup_54.apiAi
              }
            }
        
          // @LINE:758
          case controllers_Challenge_openCreate82122_route(_) =>
            named("Challenge.openCreate") {
              call { 
                  Challenge_35.openCreate
              }
            }
        
          // @LINE:759
          case controllers_Challenge_apiCreate82123_route(params) =>
            named("Challenge.apiCreate") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Challenge_35.apiCreate(user)
              }
            }
        
          // @LINE:760
          case controllers_Challenge_apiShow82124_route(params) =>
            named("Challenge.apiShow") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.apiShow(id)
              }
            }
        
          // @LINE:761
          case controllers_Challenge_apiAccept82125_route(params) =>
            named("Challenge.apiAccept") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.apiAccept(id)
              }
            }
        
          // @LINE:762
          case controllers_Challenge_apiDecline82126_route(params) =>
            named("Challenge.apiDecline") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.apiDecline(id)
              }
            }
        
          // @LINE:763
          case controllers_Challenge_apiCancel82127_route(params) =>
            named("Challenge.apiCancel") {
              call(params.fromPath[ChallengeId]("id", None)) { (id) =>
                  Challenge_35.apiCancel(id)
              }
            }
        
          // @LINE:764
          case controllers_Challenge_apiStartClocks82128_route(params) =>
            named("Challenge.apiStartClocks") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  Challenge_35.apiStartClocks(id)
              }
            }
        
          // @LINE:765
          case controllers_Round_apiAddTime82129_route(params) =>
            named("Round.apiAddTime") {
              call(params.fromPath[GameId]("id", None), params.fromPath[Int]("seconds", None)) { (id, seconds) =>
                  Round_34.apiAddTime(id, seconds)
              }
            }
        
          // @LINE:766
          case controllers_Api_cloudEval82130_route(_) =>
            named("Api.cloudEval") {
              call { 
                  Api_66.cloudEval
              }
            }
        
          // @LINE:767
          case controllers_Importer_apiSendGame82131_route(_) =>
            named("Importer.apiSendGame") {
              call { 
                  Importer_16.apiSendGame
              }
            }
        
          // @LINE:768
          case controllers_BulkPairing_list82132_route(_) =>
            named("BulkPairing.list") {
              call { 
                  BulkPairing_25.list
              }
            }
        
          // @LINE:769
          case controllers_BulkPairing_create82133_route(_) =>
            named("BulkPairing.create") {
              call { 
                  BulkPairing_25.create
              }
            }
        
          // @LINE:770
          case controllers_BulkPairing_show82134_route(params) =>
            named("BulkPairing.show") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  BulkPairing_25.show(id)
              }
            }
        
          // @LINE:771
          case controllers_BulkPairing_delete82135_route(params) =>
            named("BulkPairing.delete") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  BulkPairing_25.delete(id)
              }
            }
        
          // @LINE:772
          case controllers_BulkPairing_games82136_route(params) =>
            named("BulkPairing.games") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  BulkPairing_25.games(id)
              }
            }
        
          // @LINE:773
          case controllers_BulkPairing_startClocks82137_route(params) =>
            named("BulkPairing.startClocks") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  BulkPairing_25.startClocks(id)
              }
            }
        
          // @LINE:775
          case controllers_Game_apiExportByUser82138_route(params) =>
            named("Game.apiExportByUser") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Game_8.apiExportByUser(username)
              }
            }
        
          // @LINE:776
          case controllers_Game_apiExportByUserImportedGames82139_route(_) =>
            named("Game.apiExportByUserImportedGames") {
              call { 
                  Game_8.apiExportByUserImportedGames()
              }
            }
        
          // @LINE:777
          case controllers_Game_apiExportByUserBookmarks82140_route(_) =>
            named("Game.apiExportByUserBookmarks") {
              call { 
                  Game_8.apiExportByUserBookmarks()
              }
            }
        
          // @LINE:780
          case controllers_Analyse_externalEngineList82141_route(_) =>
            named("Analyse.externalEngineList") {
              call { 
                  Analyse_28.externalEngineList
              }
            }
        
          // @LINE:781
          case controllers_Analyse_externalEngineCreate82142_route(_) =>
            named("Analyse.externalEngineCreate") {
              call { 
                  Analyse_28.externalEngineCreate
              }
            }
        
          // @LINE:782
          case controllers_Analyse_externalEngineShow82143_route(params) =>
            named("Analyse.externalEngineShow") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Analyse_28.externalEngineShow(id)
              }
            }
        
          // @LINE:783
          case controllers_Analyse_externalEngineUpdate82144_route(params) =>
            named("Analyse.externalEngineUpdate") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Analyse_28.externalEngineUpdate(id)
              }
            }
        
          // @LINE:784
          case controllers_Analyse_externalEngineDelete82145_route(params) =>
            named("Analyse.externalEngineDelete") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Analyse_28.externalEngineDelete(id)
              }
            }
        
          // @LINE:787
          case controllers_PlayApi_botGameStream82146_route(params) =>
            named("PlayApi.botGameStream") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  PlayApi_14.botGameStream(id)
              }
            }
        
          // @LINE:788
          case controllers_PlayApi_botMove82147_route(params) =>
            named("PlayApi.botMove") {
              call(params.fromPath[GameId]("id", None), params.fromPath[String]("uci", None), params.fromQuery[Option[Boolean]]("offeringDraw", Some(None))) { (id, uci, offeringDraw) =>
                  PlayApi_14.botMove(id, uci, offeringDraw)
              }
            }
        
          // @LINE:789
          case controllers_PlayApi_botOnlineApi82148_route(_) =>
            named("PlayApi.botOnlineApi") {
              call { 
                  PlayApi_14.botOnlineApi
              }
            }
        
          // @LINE:790
          case controllers_PlayApi_botCommand82149_route(params) =>
            named("PlayApi.botCommand") {
              call(params.fromPath[String]("cmd", None)) { (cmd) =>
                  PlayApi_14.botCommand(cmd)
              }
            }
        
          // @LINE:791
          case controllers_PlayApi_botCommandGet82150_route(params) =>
            named("PlayApi.botCommandGet") {
              call(params.fromPath[String]("cmd", None)) { (cmd) =>
                  PlayApi_14.botCommandGet(cmd)
              }
            }
        
          // @LINE:795
          case controllers_PlayApi_boardGameStream82151_route(params) =>
            named("PlayApi.boardGameStream") {
              call(params.fromPath[GameId]("id", None)) { (id) =>
                  PlayApi_14.boardGameStream(id)
              }
            }
        
          // @LINE:796
          case controllers_PlayApi_boardMove82152_route(params) =>
            named("PlayApi.boardMove") {
              call(params.fromPath[GameId]("id", None), params.fromPath[String]("uci", None), params.fromQuery[Option[Boolean]]("offeringDraw", Some(None))) { (id, uci, offeringDraw) =>
                  PlayApi_14.boardMove(id, uci, offeringDraw)
              }
            }
        
          // @LINE:797
          case controllers_Setup_boardApiHook82153_route(_) =>
            named("Setup.boardApiHook") {
              call { 
                  Setup_54.boardApiHook
              }
            }
        
          // @LINE:798
          case controllers_Setup_boardApiHookCancel82154_route(_) =>
            named("Setup.boardApiHookCancel") {
              call { 
                  Setup_54.boardApiHookCancel
              }
            }
        
          // @LINE:799
          case controllers_PlayApi_boardCommandPost82155_route(params) =>
            named("PlayApi.boardCommandPost") {
              call(params.fromPath[String]("cmd", None)) { (cmd) =>
                  PlayApi_14.boardCommandPost(cmd)
              }
            }
        
          // @LINE:800
          case controllers_PlayApi_boardCommandGet82156_route(params) =>
            named("PlayApi.boardCommandGet") {
              call(params.fromPath[String]("cmd", None)) { (cmd) =>
                  PlayApi_14.boardCommandGet(cmd)
              }
            }
        
          // @LINE:854
          case controllers_OAuth_tokenApply82157_route(_) =>
            named("OAuth.tokenApply") {
              call { 
                  OAuth_61.tokenApply
              }
            }
        
          // @LINE:855
          case controllers_OAuth_tokenRevoke82158_route(_) =>
            named("OAuth.tokenRevoke") {
              call { 
                  OAuth_61.tokenRevoke
              }
            }
        
          // @LINE:860
          case controllers_OAuth_challengeTokens82159_route(_) =>
            named("OAuth.challengeTokens") {
              call { 
                  OAuth_61.challengeTokens
              }
            }
        
          // @LINE:861
          case controllers_OAuth_testTokens82160_route(_) =>
            named("OAuth.testTokens") {
              call { 
                  OAuth_61.testTokens
              }
            }
        
      },
    
      "get-fishnet" -> {
        
          // @LINE:886
          case controllers_Main_getFishnet83000_route(_) =>
            named("Main.getFishnet") {
              call { 
                  Main_19.getFishnet
              }
            }
        
      },
    
      "cms" -> {
        
          // @LINE:872
          case controllers_Cms_index84000_route(_) =>
            named("Cms.index") {
              call { 
                  Cms_4.index
              }
            }
        
          // @LINE:873
          case controllers_Cms_createForm84001_route(params) =>
            named("Cms.createForm") {
              call(params.fromQuery[Option[CmsPageKey]]("key", None)) { (key) =>
                  Cms_4.createForm(key)
              }
            }
        
          // @LINE:874
          case controllers_Cms_create84002_route(_) =>
            named("Cms.create") {
              call { 
                  Cms_4.create
              }
            }
        
          // @LINE:875
          case controllers_Cms_edit84003_route(params) =>
            named("Cms.edit") {
              call(params.fromPath[CmsPageId]("id", None)) { (id) =>
                  Cms_4.edit(id)
              }
            }
        
          // @LINE:876
          case controllers_Cms_update84004_route(params) =>
            named("Cms.update") {
              call(params.fromPath[CmsPageId]("id", None)) { (id) =>
                  Cms_4.update(id)
              }
            }
        
          // @LINE:877
          case controllers_Cms_delete84005_route(params) =>
            named("Cms.delete") {
              call(params.fromPath[CmsPageId]("id", None)) { (id) =>
                  Cms_4.delete(id)
              }
            }
        
      },
    
      "signup" -> {
        
          // @LINE:549
          case controllers_Auth_signup85000_route(_) =>
            named("Auth.signup") {
              call { 
                  Auth_15.signup
              }
            }
        
          // @LINE:550
          case controllers_Auth_signupPost85001_route(_) =>
            named("Auth.signupPost") {
              call { 
                  Auth_15.signupPost
              }
            }
        
          // @LINE:552
          case controllers_Auth_checkYourEmail85002_route(_) =>
            named("Auth.checkYourEmail") {
              call { 
                  Auth_15.checkYourEmail
              }
            }
        
          // @LINE:553
          case controllers_Auth_fixEmail85003_route(_) =>
            named("Auth.fixEmail") {
              call { 
                  Auth_15.fixEmail
              }
            }
        
          // @LINE:554
          case controllers_Auth_signupConfirmEmail85004_route(params) =>
            named("Auth.signupConfirmEmail") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Auth_15.signupConfirmEmail(token)
              }
            }
        
          // @LINE:555
          case controllers_Auth_signupConfirmEmailPost85005_route(params) =>
            named("Auth.signupConfirmEmailPost") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Auth_15.signupConfirmEmailPost(token)
              }
            }
        
      },
    
      "login" -> {
        
          // @LINE:544
          case controllers_Auth_login86000_route(_) =>
            named("Auth.login") {
              call { 
                  Auth_15.login
              }
            }
        
          // @LINE:545
          case controllers_Auth_authenticate86001_route(_) =>
            named("Auth.authenticate") {
              call { 
                  Auth_15.authenticate
              }
            }
        
      },
    
      "terms-of-service" -> {
        
          // @LINE:925
          case controllers_Cms_tos87000_route(_) =>
            named("Cms.tos") {
              call { 
                  Cms_4.tos
              }
            }
        
      },
    
      "translation" -> {
        
          // @LINE:541
          case controllers_I18n_select88000_route(_) =>
            named("I18n.select") {
              call { 
                  I18n_18.select
              }
            }
        
      },
    
      "bookmark" -> {
        
          // @LINE:28
          case controllers_Game_bookmark89000_route(params) =>
            named("Game.bookmark") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Game_8.bookmark(gameId)
              }
            }
        
      },
    
      "game" -> {
        
          // @LINE:490
          case controllers_Game_exportOne90000_route(params) =>
            named("Game.exportOne") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Game_8.exportOne(gameId)
              }
            }
        
          // @LINE:491
          case controllers_Game_exportOne90001_route(params) =>
            named("Game.exportOne") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Game_8.exportOne(gameId)
              }
            }
        
          // @LINE:492
          case controllers_Export_legacyGameThumbnail90002_route(params) =>
            named("Export.legacyGameThumbnail") {
              call(params.fromPath[GameId]("gameId", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (gameId, theme, piece) =>
                  Export_22.legacyGameThumbnail(gameId, theme, piece)
              }
            }
        
          // @LINE:493
          case controllers_Export_gameThumbnail90003_route(params) =>
            named("Export.gameThumbnail") {
              call(params.fromPath[GameId]("gameId", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (gameId, theme, piece) =>
                  Export_22.gameThumbnail(gameId, theme, piece)
              }
            }
        
          // @LINE:494
          case controllers_Export_gif90004_route(params) =>
            named("Export.gif") {
              call(params.fromPath[GameId]("gameId", None), Param[Color]("color", Right(Color.white)), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (gameId, color, theme, piece) =>
                  Export_22.gif(gameId, color, theme, piece)
              }
            }
        
          // @LINE:495
          case controllers_Export_gif90005_route(params) =>
            named("Export.gif") {
              call(params.fromPath[GameId]("gameId", None), params.fromPath[Color]("color", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (gameId, color, theme, piece) =>
                  Export_22.gif(gameId, color, theme, piece)
              }
            }
        
      },
    
      "mobile" -> {
        
          // @LINE:881
          case controllers_Main_mobile91000_route(_) =>
            named("Main.mobile") {
              call { 
                  Main_19.mobile
              }
            }
        
          // @LINE:920
          case controllers_Push_mobileRegister91001_route(params) =>
            named("Push.mobileRegister") {
              call(params.fromPath[String]("platform", None), params.fromPath[String]("deviceId", None)) { (platform, deviceId) =>
                  Push_26.mobileRegister(platform, deviceId)
              }
            }
        
          // @LINE:921
          case controllers_Push_mobileUnregister91002_route(_) =>
            named("Push.mobileUnregister") {
              call { 
                  Push_26.mobileUnregister
              }
            }
        
      },
    
      "recap" -> {
        
          // @LINE:845
          case controllers_Recap_home92000_route(_) =>
            named("Recap.home") {
              call { 
                  Recap_67.home
              }
            }
        
          // @LINE:846
          case controllers_Recap_user92001_route(params) =>
            named("Recap.user") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Recap_67.user(username)
              }
            }
        
      },
    
      "racer" -> {
        
          // @LINE:210
          case controllers_Racer_home93000_route(_) =>
            named("Racer.home") {
              call { 
                  Racer_49.home
              }
            }
        
          // @LINE:211
          case controllers_Racer_create93001_route(_) =>
            named("Racer.create") {
              call { 
                  Racer_49.create
              }
            }
        
          // @LINE:213
          case controllers_Racer_show93002_route(params) =>
            named("Racer.show") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Racer_49.show(id)
              }
            }
        
          // @LINE:214
          case controllers_Racer_rematch93003_route(params) =>
            named("Racer.rematch") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Racer_49.rematch(id)
              }
            }
        
          // @LINE:215
          case controllers_Racer_lobby93004_route(_) =>
            named("Racer.lobby") {
              call { 
                  Racer_49.lobby
              }
            }
        
      },
    
      "fishnet" -> {
        
          // @LINE:499
          case controllers_Fishnet_acquire94000_route(params) =>
            named("Fishnet.acquire") {
              call(params.fromQuery[Boolean]("slow", Some(false))) { (slow) =>
                  Fishnet_64.acquire(slow)
              }
            }
        
          // @LINE:500
          case controllers_Fishnet_analysis94001_route(params) =>
            named("Fishnet.analysis") {
              call(params.fromPath[String]("workId", None), params.fromQuery[Boolean]("slow", Some(false)), params.fromQuery[Boolean]("stop", Some(false))) { (workId, slow, stop) =>
                  Fishnet_64.analysis(workId, slow, stop)
              }
            }
        
          // @LINE:501
          case controllers_Fishnet_abort94002_route(params) =>
            named("Fishnet.abort") {
              call(params.fromPath[String]("workId", None)) { (workId) =>
                  Fishnet_64.abort(workId)
              }
            }
        
          // @LINE:502
          case controllers_Fishnet_keyExists94003_route(params) =>
            named("Fishnet.keyExists") {
              call(params.fromPath[String]("key", None)) { (key) =>
                  Fishnet_64.keyExists(key)
              }
            }
        
          // @LINE:503
          case controllers_Fishnet_status94004_route(_) =>
            named("Fishnet.status") {
              call { 
                  Fishnet_64.status
              }
            }
        
      },
    
      "games" -> {
        
          // @LINE:20
          case controllers_Search_index95000_route(params) =>
            named("Search.index") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Search_47.index(page)
              }
            }
        
          // @LINE:23
          case controllers_Game_exportByIds95001_route(_) =>
            named("Game.exportByIds") {
              call { 
                  Game_8.exportByIds
              }
            }
        
          // @LINE:25
          case controllers_Game_exportByUser95002_route(params) =>
            named("Game.exportByUser") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Game_8.exportByUser(username)
              }
            }
        
          // @LINE:39
          case controllers_Tv_games95003_route(_) =>
            named("Tv.games") {
              call { 
                  Tv_20.games
              }
            }
        
          // @LINE:40
          case controllers_Tv_gamesChannel95004_route(params) =>
            named("Tv.gamesChannel") {
              call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
                  Tv_20.gamesChannel(chanKey)
              }
            }
        
          // @LINE:41
          case controllers_Tv_gameChannelReplacement95005_route(params) =>
            named("Tv.gameChannelReplacement") {
              call(params.fromPath[String]("chanKey", None), params.fromPath[GameId]("gameId", None), params.fromQuery[List[GameId]]("exclude", None)) { (chanKey, gameId, exclude) =>
                  Tv_20.gameChannelReplacement(chanKey, gameId, exclude)
              }
            }
        
      },
    
      "tutor" -> {
        
          // @LINE:834
          case controllers_Tutor_home96000_route(_) =>
            named("Tutor.home") {
              call { 
                  Tutor_9.home()
              }
            }
        
          // @LINE:835
          case controllers_Tutor_user96001_route(params) =>
            named("Tutor.user") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Tutor_9.user(username)
              }
            }
        
          // @LINE:836
          case controllers_Tutor_refresh96002_route(params) =>
            named("Tutor.refresh") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Tutor_9.refresh(username)
              }
            }
        
          // @LINE:837
          case controllers_Tutor_perf96003_route(params) =>
            named("Tutor.perf") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None)) { (username, perf) =>
                  Tutor_9.perf(username, perf)
              }
            }
        
          // @LINE:838
          case controllers_Tutor_skills96004_route(params) =>
            named("Tutor.skills") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None)) { (username, perf) =>
                  Tutor_9.skills(username, perf)
              }
            }
        
          // @LINE:839
          case controllers_Tutor_openings96005_route(params) =>
            named("Tutor.openings") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None)) { (username, perf) =>
                  Tutor_9.openings(username, perf)
              }
            }
        
          // @LINE:840
          case controllers_Tutor_opening96006_route(params) =>
            named("Tutor.opening") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None), params.fromPath[Color]("color", None), params.fromPath[String]("opening", None)) { (username, perf, color, opening) =>
                  Tutor_9.opening(username, perf, color, opening)
              }
            }
        
          // @LINE:841
          case controllers_Tutor_phases96007_route(params) =>
            named("Tutor.phases") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None)) { (username, perf) =>
                  Tutor_9.phases(username, perf)
              }
            }
        
          // @LINE:842
          case controllers_Tutor_time96008_route(params) =>
            named("Tutor.time") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[PerfKey]("perf", None)) { (username, perf) =>
                  Tutor_9.time(username, perf)
              }
            }
        
      },
    
      "study" -> {
        
          // @LINE:226
          case controllers_Study_allDefault97000_route(params) =>
            named("Study.allDefault") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Study_63.allDefault(page)
              }
            }
        
          // @LINE:227
          case controllers_Study_staffPicks97001_route(_) =>
            named("Study.staffPicks") {
              call { 
                  Study_63.staffPicks
              }
            }
        
          // @LINE:228
          case controllers_Study_all97002_route(params) =>
            named("Study.all") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.all(order, page)
              }
            }
        
          // @LINE:229
          case controllers_Study_mine97003_route(params) =>
            named("Study.mine") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.mine(order, page)
              }
            }
        
          // @LINE:230
          case controllers_Study_mineMember97004_route(params) =>
            named("Study.mineMember") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.mineMember(order, page)
              }
            }
        
          // @LINE:231
          case controllers_Study_minePublic97005_route(params) =>
            named("Study.minePublic") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.minePublic(order, page)
              }
            }
        
          // @LINE:232
          case controllers_Study_minePrivate97006_route(params) =>
            named("Study.minePrivate") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.minePrivate(order, page)
              }
            }
        
          // @LINE:233
          case controllers_Study_mineLikes97007_route(params) =>
            named("Study.mineLikes") {
              call(params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
                  Study_63.mineLikes(order, page)
              }
            }
        
          // @LINE:234
          case controllers_Study_byOwnerDefault97008_route(params) =>
            named("Study.byOwnerDefault") {
              call(params.fromPath[UserStr]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
                  Study_63.byOwnerDefault(username, page)
              }
            }
        
          // @LINE:235
          case controllers_Study_exportPgn97009_route(params) =>
            named("Study.exportPgn") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Study_63.exportPgn(username)
              }
            }
        
          // @LINE:236
          case controllers_Study_byOwner97010_route(params) =>
            named("Study.byOwner") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (username, order, page) =>
                  Study_63.byOwner(username, order, page)
              }
            }
        
          // @LINE:237
          case controllers_Study_search97011_route(params) =>
            named("Study.search") {
              call(params.fromQuery[String]("q", Some("")), params.fromQuery[Int]("page", Some(1))) { (q, page) =>
                  Study_63.search(q, page)
              }
            }
        
          // @LINE:238
          case controllers_Study_show97012_route(params) =>
            named("Study.show") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.show(id)
              }
            }
        
          // @LINE:239
          case controllers_Study_create97013_route(_) =>
            named("Study.create") {
              call { 
                  Study_63.create
              }
            }
        
          // @LINE:240
          case controllers_Study_createAs97014_route(_) =>
            named("Study.createAs") {
              call { 
                  Study_63.createAs
              }
            }
        
          // @LINE:241
          case controllers_Study_pgn97015_route(params) =>
            named("Study.pgn") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.pgn(id)
              }
            }
        
          // @LINE:242
          case controllers_Study_chapterPgn97016_route(params) =>
            named("Study.chapterPgn") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.chapterPgn(id, chapterId)
              }
            }
        
          // @LINE:243
          case controllers_Study_chapterGif97017_route(params) =>
            named("Study.chapterGif") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None), params.fromQuery[Option[String]]("theme", None), params.fromQuery[Option[String]]("piece", None)) { (id, chapterId, theme, piece) =>
                  Study_63.chapterGif(id, chapterId, theme, piece)
              }
            }
        
          // @LINE:244
          case controllers_Study_delete97018_route(params) =>
            named("Study.delete") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.delete(id)
              }
            }
        
          // @LINE:245
          case controllers_Study_cloneStudy97019_route(params) =>
            named("Study.cloneStudy") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.cloneStudy(id)
              }
            }
        
          // @LINE:246
          case controllers_Study_cloneApply97020_route(params) =>
            named("Study.cloneApply") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.cloneApply(id)
              }
            }
        
          // @LINE:247
          case controllers_Study_chapter97021_route(params) =>
            named("Study.chapter") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.chapter(id, chapterId)
              }
            }
        
          // @LINE:248
          case controllers_Study_chapterConfig97022_route(params) =>
            named("Study.chapterConfig") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.chapterConfig(id, chapterId)
              }
            }
        
          // @LINE:249
          case controllers_Study_embed97023_route(params) =>
            named("Study.embed") {
              call(params.fromPath[StudyId]("id", None), params.fromPath[StudyChapterId]("chapterId", None)) { (id, chapterId) =>
                  Study_63.embed(id, chapterId)
              }
            }
        
          // @LINE:250
          case controllers_Study_clearChat97024_route(params) =>
            named("Study.clearChat") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.clearChat(id)
              }
            }
        
          // @LINE:251
          case controllers_Study_importPgn97025_route(params) =>
            named("Study.importPgn") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.importPgn(id)
              }
            }
        
          // @LINE:252
          case controllers_Study_admin97026_route(params) =>
            named("Study.admin") {
              call(params.fromPath[StudyId]("id", None)) { (id) =>
                  Study_63.admin(id)
              }
            }
        
          // @LINE:253
          case controllers_Study_topics97027_route(_) =>
            named("Study.topics") {
              call { 
                  Study_63.topics
              }
            }
        
          // @LINE:254
          case controllers_Study_setTopics97028_route(_) =>
            named("Study.setTopics") {
              call { 
                  Study_63.setTopics
              }
            }
        
          // @LINE:255
          case controllers_Study_byTopic97029_route(params) =>
            named("Study.byTopic") {
              call(params.fromPath[String]("topic", None), params.fromPath[StudyOrder]("order", None), params.fromQuery[Int]("page", Some(1))) { (topic, order, page) =>
                  Study_63.byTopic(topic, order, page)
              }
            }
        
          // @LINE:256
          case controllers_Study_topicAutocomplete97030_route(_) =>
            named("Study.topicAutocomplete") {
              call { 
                  Study_63.topicAutocomplete
              }
            }
        
          // @LINE:257
          case controllers_Study_glyphs97031_route(params) =>
            named("Study.glyphs") {
              call(params.fromPath[String]("lang", None)) { (lang) =>
                  Study_63.glyphs(lang)
              }
            }
        
      },
    
      "practice" -> {
        
          // @LINE:335
          case controllers_Practice_index98000_route(_) =>
            named("Practice.index") {
              call { 
                  Practice_43.index
              }
            }
        
          // @LINE:336
          case controllers_Practice_chapter98001_route(params) =>
            named("Practice.chapter") {
              call(params.fromPath[StudyId]("studyId", None), params.fromPath[StudyChapterId]("chapterId", None)) { (studyId, chapterId) =>
                  Practice_43.chapter(studyId, chapterId)
              }
            }
        
          // @LINE:337
          case controllers_Practice_config98002_route(_) =>
            named("Practice.config") {
              call { 
                  Practice_43.config
              }
            }
        
          // @LINE:338
          case controllers_Practice_configSave98003_route(_) =>
            named("Practice.configSave") {
              call { 
                  Practice_43.configSave
              }
            }
        
          // @LINE:339
          case controllers_Practice_reset98004_route(_) =>
            named("Practice.reset") {
              call { 
                  Practice_43.reset
              }
            }
        
          // @LINE:340
          case controllers_Practice_showSection98005_route(params) =>
            named("Practice.showSection") {
              call(params.fromPath[String]("sectionId", None)) { (sectionId) =>
                  Practice_43.showSection(sectionId)
              }
            }
        
          // @LINE:341
          case controllers_Practice_showStudySlug98006_route(params) =>
            named("Practice.showStudySlug") {
              call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None)) { (sectionId, studySlug) =>
                  Practice_43.showStudySlug(sectionId, studySlug)
              }
            }
        
          // @LINE:342
          case controllers_Practice_show98007_route(params) =>
            named("Practice.show") {
              call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None), params.fromPath[StudyId]("studyId", None)) { (sectionId, studySlug, studyId) =>
                  Practice_43.show(sectionId, studySlug, studyId)
              }
            }
        
          // @LINE:343
          case controllers_Practice_showChapter98008_route(params) =>
            named("Practice.showChapter") {
              call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None), params.fromPath[StudyId]("studyId", None), params.fromPath[StudyChapterId]("chapterId", None)) { (sectionId, studySlug, studyId, chapterId) =>
                  Practice_43.showChapter(sectionId, studySlug, studyId, chapterId)
              }
            }
        
          // @LINE:344
          case controllers_Practice_complete98009_route(params) =>
            named("Practice.complete") {
              call(params.fromPath[StudyChapterId]("chapterId", None), params.fromPath[Int]("moves", None)) { (chapterId, moves) =>
                  Practice_43.complete(chapterId, moves)
              }
            }
        
      },
    
      "setup" -> {
        
          // @LINE:514
          case controllers_Setup_ai99000_route(_) =>
            named("Setup.ai") {
              call { 
                  Setup_54.ai
              }
            }
        
          // @LINE:515
          case controllers_Setup_friend99001_route(params) =>
            named("Setup.friend") {
              call(params.fromQuery[Option[UserStr]]("user", Some(None))) { (user) =>
                  Setup_54.friend(user)
              }
            }
        
          // @LINE:516
          case controllers_Setup_like99002_route(params) =>
            named("Setup.like") {
              call(params.fromPath[Sri]("sri", None), params.fromPath[GameId]("gameId", None)) { (sri, gameId) =>
                  Setup_54.like(sri, gameId)
              }
            }
        
          // @LINE:517
          case controllers_Setup_hook99003_route(params) =>
            named("Setup.hook") {
              call(params.fromPath[Sri]("sri", None)) { (sri) =>
                  Setup_54.hook(sri)
              }
            }
        
          // @LINE:518
          case controllers_Setup_filterForm99004_route(_) =>
            named("Setup.filterForm") {
              call { 
                  Setup_54.filterForm
              }
            }
        
          // @LINE:519
          case controllers_Setup_validateFen99005_route(_) =>
            named("Setup.validateFen") {
              call { 
                  Setup_54.validateFen
              }
            }
        
      },
    
      "oauth" -> {
        
          // @LINE:849
          case controllers_OAuth_authorize100000_route(_) =>
            named("OAuth.authorize") {
              call { 
                  OAuth_61.authorize
              }
            }
        
          // @LINE:850
          case controllers_OAuth_legacyTokenApply100001_route(_) =>
            named("OAuth.legacyTokenApply") {
              call { 
                  OAuth_61.legacyTokenApply
              }
            }
        
          // @LINE:851
          case controllers_OAuth_legacyAuthorize100002_route(_) =>
            named("OAuth.legacyAuthorize") {
              call { 
                  OAuth_61.legacyAuthorize
              }
            }
        
          // @LINE:852
          case controllers_OAuth_authorizeApply100003_route(_) =>
            named("OAuth.authorizeApply") {
              call { 
                  OAuth_61.authorizeApply
              }
            }
        
          // @LINE:853
          case controllers_OAuth_revokeClient100004_route(_) =>
            named("OAuth.revokeClient") {
              call { 
                  OAuth_61.revokeClient
              }
            }
        
      },
    
      "password" -> {
        
          // @LINE:556
          case controllers_Auth_passwordReset101000_route(_) =>
            named("Auth.passwordReset") {
              call { 
                  Auth_15.passwordReset
              }
            }
        
          // @LINE:557
          case controllers_Auth_passwordResetApply101001_route(_) =>
            named("Auth.passwordResetApply") {
              call { 
                  Auth_15.passwordResetApply
              }
            }
        
          // @LINE:558
          case controllers_Auth_passwordResetSent101002_route(params) =>
            named("Auth.passwordResetSent") {
              call(params.fromPath[String]("email", None)) { (email) =>
                  Auth_15.passwordResetSent(email)
              }
            }
        
          // @LINE:559
          case controllers_Auth_passwordResetConfirm101003_route(params) =>
            named("Auth.passwordResetConfirm") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Auth_15.passwordResetConfirm(token)
              }
            }
        
          // @LINE:560
          case controllers_Auth_passwordResetConfirmApply101004_route(params) =>
            named("Auth.passwordResetConfirmApply") {
              call(params.fromPath[String]("token", None)) { (token) =>
                  Auth_15.passwordResetConfirmApply(token)
              }
            }
        
      },
    
      "costs" -> {
        
          // @LINE:887
          case controllers_Main_costs102000_route(_) =>
            named("Main.costs") {
              call { 
                  Main_19.costs
              }
            }
        
      },
    
      "round-next" -> {
        
          // @LINE:400
          case controllers_Round_next103000_route(params) =>
            named("Round.next") {
              call(params.fromPath[GameId]("gameId", None)) { (gameId) =>
                  Round_34.next(gameId)
              }
            }
        
      },
    
      "whats-next" -> {
        
          // @LINE:401
          case controllers_Round_whatsNext104000_route(params) =>
            named("Round.whatsNext") {
              call(params.fromPath[GameFullId]("fullId", None)) { (fullId) =>
                  Round_34.whatsNext(fullId)
              }
            }
        
      },
    
  )

  val routes: PartialFunction[RequestHeader, Handler] =
    {
      val emptyPathRouter = pathRouters get ""
      Function unlift { (req: RequestHeader) =>
        pathRouters.get(req.path.drop(1).takeWhile(_ != '/')).orElse(emptyPathRouter).flatMap(_ lift req)
      }
    }
}
