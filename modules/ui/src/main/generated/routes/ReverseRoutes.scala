// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.{Call, PathBindable}
import play.core.routing.{dynamicString}



// @LINE:4
package routes {


  // @LINE:636
  object ForumPost {

  
    // @LINE:636
    def search(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:649
    def edit(id:ForumPostId): Call = {
      
      Call("POST", "/" + "forum/post/" + dynamicString(implicitly[PathBindable[ForumPostId]].unbind("id", id)))
    }
  
    // @LINE:646
    def delete(id:ForumPostId): Call = {
      
      Call("POST", "/" + "forum/delete/" + dynamicString(implicitly[PathBindable[ForumPostId]].unbind("id", id)))
    }
  
    // @LINE:650
    def redirect(id:ForumPostId): Call = {
      
      Call("GET", "/" + "forum/redirect/post/" + dynamicString(implicitly[PathBindable[ForumPostId]].unbind("id", id)))
    }
  
    // @LINE:647
    def relocate(id:ForumPostId): Call = {
      
      Call("POST", "/" + "forum/relocate/" + dynamicString(implicitly[PathBindable[ForumPostId]].unbind("id", id)))
    }
  
    // @LINE:645
    def create(categId:ForumCategId, slug:ForumTopicSlug, page:Int = 1): Call = {
      
      Call("POST", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/" + dynamicString(implicitly[PathBindable[ForumTopicSlug]].unbind("slug", slug)) + "/new" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:648
    def react(categId:ForumCategId, id:ForumPostId, reaction:String, v:Boolean): Call = {
      
      Call("POST", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/react/" + dynamicString(implicitly[PathBindable[ForumPostId]].unbind("id", id)) + "/" + dynamicString(reaction) + "/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
  }

  // @LINE:142
  object Feed {

  
    // @LINE:143
    def createForm: Call = {
      
      Call("GET", "/" + "feed/new")
    }
  
    // @LINE:142
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "feed" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:145
    def edit(id:String): Call = {
      
      Call("GET", "/" + "feed/" + dynamicString(id) + "/edit")
    }
  
    // @LINE:144
    def create: Call = {
      
      Call("POST", "/" + "feed/new")
    }
  
    // @LINE:147
    def delete(id:String): Call = {
      
      Call("POST", "/" + "feed/" + dynamicString(id) + "/delete")
    }
  
    // @LINE:148
    def atom: Call = {
      
      Call("GET", "/" + "feed.atom")
    }
  
    // @LINE:146
    def update(id:String): Call = {
      
      Call("POST", "/" + "feed/" + dynamicString(id) + "/edit")
    }
  
  }

  // @LINE:856
  object OAuthToken {

  
    // @LINE:856
    def index: Call = {
      
      Call("GET", "/" + "account/oauth/token")
    }
  
    // @LINE:857
    def create: Call = {
      
      Call("GET", "/" + "account/oauth/token/create")
    }
  
    // @LINE:858
    def createApply: Call = {
      
      Call("POST", "/" + "account/oauth/token/create")
    }
  
    // @LINE:859
    def delete(id:String): Call = {
      
      Call("POST", "/" + "account/oauth/token/" + dynamicString(id) + "/delete")
    }
  
  }

  // @LINE:872
  object Cms {

  
    // @LINE:938
    def help: Call = {
      
      Call("GET", "/" + "help/contribute")
    }
  
    // @LINE:873
    def createForm(key:Option[CmsPageKey]): Call = {
      
      Call("GET", "/" + "cms/new" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[CmsPageKey]]].unbind("key", key)))))
    }
  
    // @LINE:926
    def menuPage(key:CmsPageKey): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[CmsPageKey]].unbind("key", key))
    }
  
    // @LINE:874
    def create: Call = {
      
      Call("POST", "/" + "cms/new")
    }
  
    // @LINE:877
    def delete(id:CmsPageId): Call = {
      
      Call("POST", "/" + "cms/" + dynamicString(implicitly[PathBindable[CmsPageId]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:935
    def variant(key:chess.variant.Variant.LilaKey): Call = {
      
      Call("GET", "/" + "variant/" + dynamicString(implicitly[PathBindable[chess.variant.Variant.LilaKey]].unbind("key", key)))
    }
  
    // @LINE:934
    def variantHome: Call = {
      
      Call("GET", "/" + "variant")
    }
  
    // @LINE:876
    def update(id:CmsPageId): Call = {
      
      Call("POST", "/" + "cms/" + dynamicString(implicitly[PathBindable[CmsPageId]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:925
    def tos: Call = {
      
      Call("GET", "/" + "terms-of-service")
    }
  
    // @LINE:875
    def edit(id:CmsPageId): Call = {
      
      Call("GET", "/" + "cms/" + dynamicString(implicitly[PathBindable[CmsPageId]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:929
    def source: Call = {
      
      Call("GET", "/" + "source")
    }
  
    // @LINE:931
    def lonePage(key:CmsPageKey): Call = {
      
      Call("GET", "/" + "page/" + dynamicString(implicitly[PathBindable[CmsPageKey]].unbind("key", key)))
    }
  
    // @LINE:872
    def index: Call = {
      
      Call("GET", "/" + "cms")
    }
  
  }

  // @LINE:845
  object Recap {

  
    // @LINE:845
    def home: Call = {
      
      Call("GET", "/" + "recap")
    }
  
    // @LINE:846
    def user(username:UserStr): Call = {
      
      Call("GET", "/" + "recap/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
  }

  // @LINE:335
  object Practice {

  
    // @LINE:343
    def showChapter(sectionId:String, studySlug:String, studyId:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "practice/" + dynamicString(sectionId) + "/" + dynamicString(studySlug) + "/" + dynamicString(implicitly[PathBindable[StudyId]].unbind("studyId", studyId)) + "/" + dynamicString(implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId)))
    }
  
    // @LINE:337
    def config: Call = {
      
      Call("GET", "/" + "practice/config")
    }
  
    // @LINE:338
    def configSave: Call = {
      
      Call("POST", "/" + "practice/config")
    }
  
    // @LINE:336
    def chapter(studyId:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "practice/load/" + dynamicString(implicitly[PathBindable[StudyId]].unbind("studyId", studyId)) + "/" + dynamicString(implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId)))
    }
  
    // @LINE:340
    def showSection(sectionId:String): Call = {
      
      Call("GET", "/" + "practice/" + dynamicString(sectionId))
    }
  
    // @LINE:342
    def show(sectionId:String, studySlug:String, studyId:StudyId): Call = {
      
      Call("GET", "/" + "practice/" + dynamicString(sectionId) + "/" + dynamicString(studySlug) + "/" + dynamicString(implicitly[PathBindable[StudyId]].unbind("studyId", studyId)))
    }
  
    // @LINE:339
    def reset: Call = {
      
      Call("POST", "/" + "practice/reset")
    }
  
    // @LINE:341
    def showStudySlug(sectionId:String, studySlug:String): Call = {
      
      Call("GET", "/" + "practice/" + dynamicString(sectionId) + "/" + dynamicString(studySlug))
    }
  
    // @LINE:335
    def index: Call = {
      
      Call("GET", "/" + "practice")
    }
  
    // @LINE:344
    def complete(chapterId:StudyChapterId, moves:Int): Call = {
      
      Call("POST", "/" + "practice/complete/" + dynamicString(implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId)) + "/" + dynamicString(implicitly[PathBindable[Int]].unbind("moves", moves)))
    }
  
  }

  // @LINE:151
  object Opening {

  
    // @LINE:153
    def wikiWrite(key:String, moves:String): Call = {
      
      Call("POST", "/" + "opening/wiki/" + dynamicString(key) + "/" + dynamicString(moves))
    }
  
    // @LINE:151
    def index(q:Option[String] = None): Call = {
      
      Call("GET", "/" + "opening" + play.core.routing.queryString(List(if(q == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("q", q)))))
    }
  
    // @LINE:152
    def config(key:String): Call = {
      
      Call("POST", "/" + "opening/config/" + dynamicString(key))
    }
  
    // @LINE:154
    def tree: Call = {
      
      Call("GET", "/" + "opening/tree")
    }
  
    // @LINE:155
    def byKeyAndMoves(key:String, moves:String): Call = {
    
      (key: @unchecked, moves: @unchecked) match {
      
        // @LINE:155
        case (key, moves) if moves == "" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("moves", ""))); _rrc
          Call("GET", "/" + "opening/" + dynamicString(key))
      
        // @LINE:156
        case (key, moves)  =>
          
          Call("GET", "/" + "opening/" + dynamicString(key) + "/" + dynamicString(moves))
      
      }
    
    }
  
  }

  // @LINE:318
  object Plan {

  
    // @LINE:318
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "patron" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:322
    def cancel: Call = {
      
      Call("POST", "/" + "patron/cancel")
    }
  
    // @LINE:323
    def webhook: Call = {
      
      Call("POST", "/" + "patron/webhook")
    }
  
    // @LINE:330
    def apiStripeCheckout: Call = {
      
      Call("POST", "/" + "api/patron/stripe/checkout")
    }
  
    // @LINE:324
    def stripeCheckout: Call = {
      
      Call("POST", "/" + "patron/stripe/checkout")
    }
  
    // @LINE:328
    def payPalCheckout: Call = {
      
      Call("POST", "/" + "patron/paypal/checkout")
    }
  
    // @LINE:329
    def payPalCapture(id:String): Call = {
      
      Call("POST", "/" + "patron/paypal/capture/" + dynamicString(id))
    }
  
    // @LINE:325
    def updatePayment: Call = {
      
      Call("POST", "/" + "patron/stripe/update-payment")
    }
  
    // @LINE:320
    def list: Call = {
      
      Call("GET", "/" + "patron/list")
    }
  
    // @LINE:319
    def thanks: Call = {
      
      Call("GET", "/" + "patron/thanks")
    }
  
    // @LINE:326
    def updatePaymentCallback: Call = {
      
      Call("GET", "/" + "patron/stripe/update-payment")
    }
  
    // @LINE:321
    def switch: Call = {
      
      Call("POST", "/" + "patron/switch")
    }
  
    // @LINE:331
    def apiCurrencies: Call = {
      
      Call("GET", "/" + "api/patron/currencies")
    }
  
    // @LINE:332
    def features: Call = {
      
      Call("GET", "/" + "features")
    }
  
    // @LINE:327
    def payPalIpn: Call = {
      
      Call("POST", "/" + "patron/ipn")
    }
  
  }

  // @LINE:594
  object GameMod {

  
    // @LINE:594
    def index(username:UserStr): Call = {
      
      Call("GET", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/games")
    }
  
    // @LINE:595
    def post(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/games")
    }
  
  }

  // @LINE:676
  object Importer {

  
    // @LINE:676
    def importGame: Call = {
      
      Call("GET", "/" + "paste")
    }
  
    // @LINE:677
    def sendGame: Call = {
      
      Call("POST", "/" + "import")
    }
  
    // @LINE:678
    def masterGame(id:GameId, color:Color): Call = {
      
      Call("GET", "/" + "import/master/" + implicitly[PathBindable[GameId]].unbind("id", id) + "/" + dynamicString(implicitly[PathBindable[Color]].unbind("color", color)))
    }
  
    // @LINE:767
    def apiSendGame: Call = {
      
      Call("POST", "/" + "api/import")
    }
  
  }

  // @LINE:893
  object TitleVerify {

  
    // @LINE:898
    def update(id:TitleRequestId): Call = {
      
      Call("POST", "/" + "verify-title/" + dynamicString(implicitly[PathBindable[TitleRequestId]].unbind("id", id)))
    }
  
    // @LINE:895
    def create: Call = {
      
      Call("POST", "/" + "verify-title/form")
    }
  
    // @LINE:896
    def queue: Call = {
      
      Call("GET", "/" + "verify-title/queue")
    }
  
    // @LINE:894
    def form: Call = {
      
      Call("GET", "/" + "verify-title/form")
    }
  
    // @LINE:901
    def image(id:TitleRequestId, tag:String): Call = {
      
      Call("POST", "/" + "upload/image/verify-title/" + dynamicString(implicitly[PathBindable[TitleRequestId]].unbind("id", id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tag", tag)))))
    }
  
    // @LINE:897
    def show(id:TitleRequestId): Call = {
      
      Call("GET", "/" + "verify-title/" + dynamicString(implicitly[PathBindable[TitleRequestId]].unbind("id", id)))
    }
  
    // @LINE:900
    def process(id:TitleRequestId): Call = {
      
      Call("POST", "/" + "verify-title/" + dynamicString(implicitly[PathBindable[TitleRequestId]].unbind("id", id)) + "/process")
    }
  
    // @LINE:899
    def cancel(id:TitleRequestId): Call = {
      
      Call("POST", "/" + "verify-title/" + dynamicString(implicitly[PathBindable[TitleRequestId]].unbind("id", id)) + "/cancel")
    }
  
    // @LINE:893
    def index: Call = {
      
      Call("GET", "/" + "verify-title")
    }
  
  }

  // @LINE:541
  object I18n {

  
    // @LINE:541
    def select: Call = {
      
      Call("POST", "/" + "translation/select")
    }
  
  }

  // @LINE:864
  object Event {

  
    // @LINE:864
    def show(id:String): Call = {
      
      Call("GET", "/" + "event/" + id)
    }
  
    // @LINE:868
    def cloneE(id:String): Call = {
      
      Call("GET", "/" + "event/manager/clone/" + id)
    }
  
    // @LINE:866
    def edit(id:String): Call = {
      
      Call("GET", "/" + "event/manager/" + id)
    }
  
    // @LINE:870
    def create: Call = {
      
      Call("POST", "/" + "event/manager")
    }
  
    // @LINE:865
    def manager: Call = {
      
      Call("GET", "/" + "event/manager")
    }
  
    // @LINE:869
    def form: Call = {
      
      Call("GET", "/" + "event/manager/new")
    }
  
    // @LINE:867
    def update(id:String): Call = {
      
      Call("POST", "/" + "event/manager/" + id)
    }
  
  }

  // @LINE:70
  object UserTournament {

  
    // @LINE:70
    def path(username:UserStr, path:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/tournaments/" + dynamicString(path) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:710
    def apiTournamentsByOwner(user:UserStr, status:List[Int]): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/tournament/created" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[List[Int]]].unbind("status", status)))))
    }
  
    // @LINE:711
    def apiTournamentsByPlayer(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/tournament/played")
    }
  
  }

  // @LINE:347
  object Streamer {

  
    // @LINE:347
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "streamer" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:359
    def show(username:UserStr): Call = {
      
      Call("GET", "/" + "streamer/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:354
    def edit: Call = {
      
      Call("GET", "/" + "streamer/edit")
    }
  
    // @LINE:361
    def checkOnline(username:UserStr): Call = {
      
      Call("POST", "/" + "streamer/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/check")
    }
  
    // @LINE:351
    def onYouTubeVideo: Call = {
      
      Call("POST", "/" + "api/x/streamer/youtube-pubsub")
    }
  
    // @LINE:357
    def subscribe(streamer:UserStr, set:Boolean = true): Call = {
      
      Call("POST", "/" + "streamer/subscribe/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("streamer", streamer)) + play.core.routing.queryString(List(if(set == true) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("set", set)))))
    }
  
    // @LINE:355
    def create: Call = {
      
      Call("POST", "/" + "streamer/new")
    }
  
    // @LINE:348
    def featured: Call = {
      
      Call("GET", "/" + "api/streamer/featured")
    }
  
    // @LINE:349
    def live: Call = {
      
      Call("GET", "/" + "api/streamer/live")
    }
  
    // @LINE:360
    def redirect(username:UserStr): Call = {
      
      Call("GET", "/" + "streamer/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/redirect")
    }
  
    // @LINE:358
    def pictureApply: Call = {
      
      Call("POST", "/" + "upload/image/streamer")
    }
  
    // @LINE:356
    def editApply: Call = {
      
      Call("POST", "/" + "streamer/edit")
    }
  
    // @LINE:352
    def youTubePubSubChallenge: Call = {
      
      Call("GET", "/" + "api/x/streamer/youtube-pubsub")
    }
  
  }

  // @LINE:15
  object Timeline {

  
    // @LINE:15
    def home: Call = {
      
      Call("GET", "/" + "timeline")
    }
  
    // @LINE:16
    def api: Call = {
      
      Call("GET", "/" + "api/timeline")
    }
  
    // @LINE:17
    def unsub(channel:String): Call = {
      
      Call("POST", "/" + "timeline/unsub/" + dynamicString(channel))
    }
  
  }

  // @LINE:63
  object Insight {

  
    // @LINE:63
    def refresh(username:UserStr): Call = {
      
      Call("POST", "/" + "insights/refresh/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:64
    def json(username:UserStr): Call = {
      
      Call("POST", "/" + "insights/data/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:65
    def index(username:UserStr): Call = {
      
      Call("GET", "/" + "insights/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:66
    def path(username:UserStr, metric:String, dimension:String, filters:String): Call = {
    
      (username: @unchecked, metric: @unchecked, dimension: @unchecked, filters: @unchecked) match {
      
        // @LINE:66
        case (username, metric, dimension, filters) if filters == "" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("filters", ""))); _rrc
          Call("GET", "/" + "insights/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(metric) + "/" + dynamicString(dimension))
      
        // @LINE:67
        case (username, metric, dimension, filters)  =>
          
          Call("GET", "/" + "insights/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(metric) + "/" + dynamicString(dimension) + "/" + filters)
      
      }
    
    }
  
  }

  // @LINE:226
  object Study {

  
    // @LINE:244
    def delete(id:StudyId): Call = {
      
      Call("POST", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/delete")
    }
  
    // @LINE:245
    def cloneStudy(id:StudyId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/clone")
    }
  
    // @LINE:259
    def apiPgn(id:StudyId): Call = {
      
      Call("GET", "/" + "api/study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + ".pgn")
    }
  
    // @LINE:249
    def embed(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "study/embed/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId))
    }
  
    // @LINE:258
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/study")
    }
  
    // @LINE:256
    def topicAutocomplete: Call = {
      
      Call("GET", "/" + "study/topic/autocomplete")
    }
  
    // @LINE:237
    def search(q:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "study/search" + play.core.routing.queryString(List(if(q == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:242
    def chapterPgn(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId) + ".pgn")
    }
  
    // @LINE:233
    def mineLikes(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/likes/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:239
    def create: Call = {
      
      Call("POST", "/" + "study")
    }
  
    // @LINE:261
    def apiChapterDelete(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("DELETE", "/" + "api/study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId))
    }
  
    // @LINE:236
    def byOwner(username:UserStr, order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:262
    def apiListByOwner(user:UserStr): Call = {
      
      Call("GET", "/" + "api/study/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:227
    def staffPicks: Call = {
      
      Call("GET", "/" + "study/staff-picks")
    }
  
    // @LINE:240
    def createAs: Call = {
      
      Call("POST", "/" + "study/as")
    }
  
    // @LINE:257
    def glyphs(lang:String): Call = {
      
      Call("GET", "/" + "study/glyphs/" + dynamicString(lang) + ".json")
    }
  
    // @LINE:228
    def all(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/all/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:229
    def mine(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/mine/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:247
    def chapter(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId))
    }
  
    // @LINE:246
    def cloneApply(id:StudyId): Call = {
      
      Call("POST", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/cloneApply")
    }
  
    // @LINE:255
    def byTopic(topic:String, order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/topic/" + dynamicString(topic) + "/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:230
    def mineMember(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/member/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:263
    def apiImportPgn(id:StudyId): Call = {
      
      Call("POST", "/" + "api/study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/import-pgn")
    }
  
    // @LINE:234
    def byOwnerDefault(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:251
    def importPgn(id:StudyId): Call = {
      
      Call("POST", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/import-pgn")
    }
  
    // @LINE:238
    def show(id:StudyId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id))
    }
  
    // @LINE:232
    def minePrivate(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/private/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:226
    def allDefault(page:Int = 1): Call = {
      
      Call("GET", "/" + "study" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:241
    def pgn(id:StudyId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + ".pgn")
    }
  
    // @LINE:250
    def clearChat(id:StudyId): Call = {
      
      Call("POST", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/clear-chat")
    }
  
    // @LINE:252
    def admin(id:StudyId): Call = {
      
      Call("POST", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/admin")
    }
  
    // @LINE:243
    def chapterGif(id:StudyId, chapterId:StudyChapterId, theme:Option[String], piece:Option[String]): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId) + ".gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
    }
  
    // @LINE:248
    def chapterConfig(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId) + "/config")
    }
  
    // @LINE:253
    def topics: Call = {
      
      Call("GET", "/" + "study/topic")
    }
  
    // @LINE:260
    def apiChapterPgn(id:StudyId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "api/study/" + implicitly[PathBindable[StudyId]].unbind("id", id) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId) + ".pgn")
    }
  
    // @LINE:235
    def exportPgn(username:UserStr): Call = {
      
      Call("GET", "/" + "study/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/export.pgn")
    }
  
    // @LINE:254
    def setTopics: Call = {
      
      Call("POST", "/" + "study/topic")
    }
  
    // @LINE:231
    def minePublic(order:StudyOrder, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/public/" + dynamicString(implicitly[PathBindable[StudyOrder]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:514
  object Setup {

  
    // @LINE:515
    def friend(user:Option[UserStr] = None): Call = {
      
      Call("POST", "/" + "setup/friend" + play.core.routing.queryString(List(if(user == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("user", user)))))
    }
  
    // @LINE:519
    def validateFen: Call = {
      
      Call("GET", "/" + "setup/validate-fen")
    }
  
    // @LINE:797
    def boardApiHook: Call = {
      
      Call("POST", "/" + "api/board/seek")
    }
  
    // @LINE:757
    def apiAi: Call = {
      
      Call("POST", "/" + "api/challenge/ai")
    }
  
    // @LINE:516
    def like(sri:Sri, gameId:GameId): Call = {
      
      Call("POST", "/" + "setup/hook/" + dynamicString(implicitly[PathBindable[Sri]].unbind("sri", sri)) + "/like/" + dynamicString(implicitly[PathBindable[GameId]].unbind("gameId", gameId)))
    }
  
    // @LINE:518
    def filterForm: Call = {
      
      Call("GET", "/" + "setup/filter")
    }
  
    // @LINE:798
    def boardApiHookCancel: Call = {
      
      Call("DELETE", "/" + "api/board/seek")
    }
  
    // @LINE:517
    def hook(sri:Sri): Call = {
      
      Call("POST", "/" + "setup/hook/" + dynamicString(implicitly[PathBindable[Sri]].unbind("sri", sri)))
    }
  
    // @LINE:514
    def ai: Call = {
      
      Call("POST", "/" + "setup/ai")
    }
  
  }

  // @LINE:168
  object Export {

  
    // @LINE:494
    def gif(gameId:GameId, color:Color, theme:Option[String], piece:Option[String]): Call = {
    
      (gameId: @unchecked, color: @unchecked, theme: @unchecked, piece: @unchecked) match {
      
        // @LINE:494
        case (gameId, color, theme, piece) if color == Color.white =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", Color.white))); _rrc
          Call("GET", "/" + "game/export/gif/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + ".gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
      
        // @LINE:495
        case (gameId, color, theme, piece)  =>
          
          Call("GET", "/" + "game/export/gif/" + dynamicString(implicitly[PathBindable[Color]].unbind("color", color)) + "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + ".gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
      
      }
    
    }
  
    // @LINE:493
    def gameThumbnail(gameId:GameId, theme:Option[String], piece:Option[String]): Call = {
      
      Call("GET", "/" + "game/export/gif/thumbnail/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + ".gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
    }
  
    // @LINE:492
    def legacyGameThumbnail(gameId:GameId, theme:Option[String], piece:Option[String]): Call = {
      
      Call("GET", "/" + "game/export/png/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + ".png" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
    }
  
    // @LINE:168
    def puzzleThumbnail(id:PuzzleId, theme:Option[String], piece:Option[String]): Call = {
      
      Call("GET", "/" + "training/export/gif/thumbnail/" + dynamicString(implicitly[PathBindable[PuzzleId]].unbind("id", id)) + ".gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
    }
  
    // @LINE:496
    def fenThumbnail(fen:String, color:Option[Color], lastMove:Option[Uci], variant:Option[chess.variant.Variant.LilaKey], theme:Option[String], piece:Option[String]): Call = {
      
      Call("GET", "/" + "export/fen.gif" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("fen", fen)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Color]]].unbind("color", color)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Uci]]].unbind("lastMove", lastMove)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[chess.variant.Variant.LilaKey]]].unbind("variant", variant)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("theme", theme)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("piece", piece)))))
    }
  
  }

  // @LINE:159
  object Coordinate {

  
    // @LINE:159
    def home: Call = {
      
      Call("GET", "/" + "training/coordinate")
    }
  
    // @LINE:160
    def score: Call = {
      
      Call("POST", "/" + "training/coordinate/score")
    }
  
    // @LINE:161
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/training/coordinate")
    }
  
  }

  // @LINE:667
  object Coach {

  
    // @LINE:671
    def show(username:UserStr): Call = {
      
      Call("GET", "/" + "coach/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:673
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/coach")
    }
  
    // @LINE:668
    def edit: Call = {
      
      Call("GET", "/" + "coach/edit")
    }
  
    // @LINE:672
    def search(lang:String, order:String, country:FlagCode, page:Int = 1): Call = {
      
      Call("GET", "/" + "coach/" + dynamicString(lang) + "/" + dynamicString(implicitly[PathBindable[FlagCode]].unbind("country", country)) + "/" + dynamicString(order) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:667
    def all(page:Int = 1): Call = {
      
      Call("GET", "/" + "coach" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:670
    def pictureApply: Call = {
      
      Call("POST", "/" + "upload/image/coach")
    }
  
    // @LINE:669
    def editApply: Call = {
      
      Call("POST", "/" + "coach/edit")
    }
  
  }

  // @LINE:544
  object Auth {

  
    // @LINE:553
    def fixEmail: Call = {
      
      Call("POST", "/" + "signup/fix-email")
    }
  
    // @LINE:558
    def passwordResetSent(email:String): Call = {
      
      Call("GET", "/" + "password/reset/sent/" + dynamicString(email))
    }
  
    // @LINE:546
    def loginLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/login")
    }
  
    // @LINE:566
    def magicLinkApply: Call = {
      
      Call("POST", "/" + "auth/magic-link/send")
    }
  
    // @LINE:556
    def passwordReset: Call = {
      
      Call("GET", "/" + "password/reset")
    }
  
    // @LINE:567
    def magicLinkSent: Call = {
      
      Call("GET", "/" + "auth/magic-link/sent")
    }
  
    // @LINE:559
    def passwordResetConfirm(token:String): Call = {
      
      Call("GET", "/" + "password/reset/confirm/" + dynamicString(token))
    }
  
    // @LINE:563
    def loginWithToken(token:String): Call = {
      
      Call("GET", "/" + "auth/token/" + dynamicString(token))
    }
  
    // @LINE:549
    def signup: Call = {
      
      Call("GET", "/" + "signup")
    }
  
    // @LINE:552
    def checkYourEmail: Call = {
      
      Call("GET", "/" + "signup/check-your-email")
    }
  
    // @LINE:557
    def passwordResetApply: Call = {
      
      Call("POST", "/" + "password/reset/send")
    }
  
    // @LINE:555
    def signupConfirmEmailPost(token:String): Call = {
      
      Call("POST", "/" + "signup/confirm/" + dynamicString(token))
    }
  
    // @LINE:548
    def logout: Call = {
      
      Call("POST", "/" + "logout")
    }
  
    // @LINE:564
    def loginWithTokenPost(token:String, referrer:Option[String]): Call = {
      
      Call("POST", "/" + "auth/token/" + dynamicString(token) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("referrer", referrer)))))
    }
  
    // @LINE:565
    def magicLink: Call = {
      
      Call("GET", "/" + "auth/magic-link")
    }
  
    // @LINE:560
    def passwordResetConfirmApply(token:String): Call = {
      
      Call("POST", "/" + "password/reset/confirm/" + dynamicString(token))
    }
  
    // @LINE:550
    def signupPost: Call = {
      
      Call("POST", "/" + "signup")
    }
  
    // @LINE:551
    def signupLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/signup")
    }
  
    // @LINE:554
    def signupConfirmEmail(token:String): Call = {
      
      Call("GET", "/" + "signup/confirm/" + dynamicString(token))
    }
  
    // @LINE:545
    def authenticate: Call = {
      
      Call("POST", "/" + "login")
    }
  
    // @LINE:561
    def setFingerPrint(fp:String, ms:Int): Call = {
      
      Call("POST", "/" + "auth/set-fp/" + dynamicString(fp) + "/" + dynamicString(implicitly[PathBindable[Int]].unbind("ms", ms)))
    }
  
    // @LINE:547
    def logoutGet: Call = {
      
      Call("GET", "/" + "logout")
    }
  
    // @LINE:544
    def login: Call = {
      
      Call("GET", "/" + "login")
    }
  
    // @LINE:562
    def makeLoginToken: Call = {
      
      Call("POST", "/" + "auth/token")
    }
  
  }

  // @LINE:219
  object UserAnalysis {

  
    // @LINE:219
    def help: Call = {
      
      Call("GET", "/" + "analysis/help")
    }
  
    // @LINE:386
    def game(gameId:GameId, color:Color): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color) + "/analysis")
    }
  
    // @LINE:220
    def pgn(pgn:String): Call = {
      
      Call("GET", "/" + "analysis/pgn/" + pgn)
    }
  
    // @LINE:223
    def embed: Call = {
      
      Call("GET", "/" + "embed/analysis")
    }
  
    // @LINE:388
    def forecastsPost(fullId:GameFullId): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId) + "/forecasts")
    }
  
    // @LINE:221
    def parseArg(something:String): Call = {
      
      Call("GET", "/" + "analysis/" + something)
    }
  
    // @LINE:387
    def forecastsGet(fullId:GameFullId): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId) + "/forecasts")
    }
  
    // @LINE:389
    def forecastsOnMyTurn(fullId:GameFullId, uci:String): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId) + "/forecasts/" + dynamicString(uci))
    }
  
    // @LINE:222
    def index: Call = {
      
      Call("GET", "/" + "analysis")
    }
  
  }

  // @LINE:385
  object Editor {

  
    // @LINE:385
    def game(gameId:GameId): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/edit")
    }
  
    // @LINE:681
    def data: Call = {
      
      Call("GET", "/" + "editor.json")
    }
  
    // @LINE:682
    def load(urlFen:String): Call = {
      
      Call("GET", "/" + "editor/" + urlFen)
    }
  
    // @LINE:683
    def index: Call = {
      
      Call("GET", "/" + "editor")
    }
  
  }

  // @LINE:834
  object Tutor {

  
    // @LINE:839
    def openings(username:UserStr, perf:PerfKey): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + "/opening")
    }
  
    // @LINE:837
    def perf(username:UserStr, perf:PerfKey): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)))
    }
  
    // @LINE:836
    def refresh(username:UserStr): Call = {
      
      Call("POST", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/refresh")
    }
  
    // @LINE:838
    def skills(username:UserStr, perf:PerfKey): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + "/skill")
    }
  
    // @LINE:835
    def user(username:UserStr): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:841
    def phases(username:UserStr, perf:PerfKey): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + "/phase")
    }
  
    // @LINE:840
    def opening(username:UserStr, perf:PerfKey, color:Color, opening:String): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + "/opening/" + dynamicString(implicitly[PathBindable[Color]].unbind("color", color)) + "/" + dynamicString(opening))
    }
  
    // @LINE:834
    def home(): Call = {
      
      Call("GET", "/" + "tutor")
    }
  
    // @LINE:842
    def time(username:UserStr, perf:PerfKey): Call = {
      
      Call("GET", "/" + "tutor/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + "/time")
    }
  
  }

  // @LINE:522
  object Challenge {

  
    // @LINE:758
    def openCreate: Call = {
      
      Call("POST", "/" + "api/challenge/open")
    }
  
    // @LINE:759
    def apiCreate(user:UserStr): Call = {
      
      Call("POST", "/" + "api/challenge/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:761
    def apiAccept(id:ChallengeId): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/accept")
    }
  
    // @LINE:527
    def toFriend(id:ChallengeId): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/to-friend")
    }
  
    // @LINE:528
    def offerRematchForGame(id:GameId): Call = {
      
      Call("POST", "/" + "challenge/rematch-of/" + implicitly[PathBindable[GameId]].unbind("id", id))
    }
  
    // @LINE:763
    def apiCancel(id:ChallengeId): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/cancel")
    }
  
    // @LINE:524
    def accept(id:ChallengeId, color:Option[Color] = None): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/accept" + play.core.routing.queryString(List(if(color == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Color]]].unbind("color", color)))))
    }
  
    // @LINE:760
    def apiShow(id:ChallengeId): Call = {
      
      Call("GET", "/" + "api/challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/show")
    }
  
    // @LINE:525
    def decline(id:ChallengeId): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/decline")
    }
  
    // @LINE:522
    def all: Call = {
      
      Call("GET", "/" + "challenge")
    }
  
    // @LINE:756
    def apiList: Call = {
      
      Call("GET", "/" + "api/challenge")
    }
  
    // @LINE:526
    def cancel(id:ChallengeId): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/cancel")
    }
  
    // @LINE:762
    def apiDecline(id:ChallengeId): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + "/decline")
    }
  
    // @LINE:523
    def show(id:ChallengeId, color:Option[Color] = None): Call = {
      
      Call("GET", "/" + "challenge/" + implicitly[PathBindable[ChallengeId]].unbind("id", id) + play.core.routing.queryString(List(if(color == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Color]]].unbind("color", color)))))
    }
  
    // @LINE:764
    def apiStartClocks(id:GameId): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[PathBindable[GameId]].unbind("id", id) + "/start-clocks")
    }
  
  }

  // @LINE:442
  object Swiss {

  
    // @LINE:481
    def byTeam(id:TeamId): Call = {
      
      Call("GET", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/swiss")
    }
  
    // @LINE:452
    def pageOf(id:SwissId, user:UserStr): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/page-of/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:448
    def edit(id:SwissId): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:453
    def player(id:SwissId, user:UserStr): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/player/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:455
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/swiss")
    }
  
    // @LINE:449
    def update(id:SwissId): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:454
    def scheduleNextRound(id:SwissId): Call = {
      
      Call("POST", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/schedule-next-round")
    }
  
    // @LINE:445
    def show(id:SwissId): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id))
    }
  
    // @LINE:444
    def create(teamId:TeamId): Call = {
      
      Call("POST", "/" + "swiss/new/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("teamId", teamId)))
    }
  
    // @LINE:737
    def apiShow(id:SwissId): Call = {
      
      Call("GET", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id))
    }
  
    // @LINE:443
    def form(teamId:TeamId): Call = {
      
      Call("GET", "/" + "swiss/new/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("teamId", teamId)))
    }
  
    // @LINE:446
    def round(id:SwissId, round:Int): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/round/" + dynamicString(implicitly[PathBindable[Int]].unbind("round", round)))
    }
  
    // @LINE:451
    def standing(id:SwissId, page:Int): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/standing/" + dynamicString(implicitly[PathBindable[Int]].unbind("page", page)))
    }
  
    // @LINE:733
    def apiUpdate(id:SwissId): Call = {
      
      Call("POST", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:734
    def join(id:SwissId): Call = {
      
      Call("POST", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/join")
    }
  
    // @LINE:736
    def apiTerminate(id:SwissId): Call = {
      
      Call("POST", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/terminate")
    }
  
    // @LINE:442
    def home: Call = {
      
      Call("GET", "/" + "swiss")
    }
  
    // @LINE:447
    def exportTrf(id:SwissId): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + ".trf")
    }
  
    // @LINE:735
    def withdraw(id:SwissId): Call = {
      
      Call("POST", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:732
    def apiCreate(teamId:TeamId): Call = {
      
      Call("POST", "/" + "api/swiss/new/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("teamId", teamId)))
    }
  
    // @LINE:450
    def terminate(id:SwissId): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/terminate")
    }
  
  }

  // @LINE:48
  object Relation {

  
    // @LINE:54
    def unfollowBc(user:UserStr): Call = {
      
      Call("POST", "/" + "rel/unfollow/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:57
    def following(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/following" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:49
    def follow(user:UserStr): Call = {
      
      Call("POST", "/" + "api/rel/follow/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:59
    def blocks(page:Int = 1): Call = {
      
      Call("GET", "/" + "rel/blocks" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:50
    def unfollow(user:UserStr): Call = {
      
      Call("POST", "/" + "api/rel/unfollow/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:60
    def bcAction(action:String, user:UserStr): Call = {
      
      Call("POST", "/" + "rel/" + dynamicString(action) + "/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:55
    def followBc(user:UserStr): Call = {
      
      Call("POST", "/" + "rel/follow/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:58
    def followers(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/followers" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:52
    def unblock(userId:UserStr): Call = {
      
      Call("POST", "/" + "api/rel/unblock/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("userId", userId)))
    }
  
    // @LINE:48
    def apiFollowing: Call = {
      
      Call("GET", "/" + "api/rel/following")
    }
  
    // @LINE:51
    def block(userId:UserStr): Call = {
      
      Call("POST", "/" + "api/rel/block/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("userId", userId)))
    }
  
  }

  // @LINE:365
  object JsBot {

  
    // @LINE:366
    def assetKeys: Call = {
      
      Call("GET", "/" + "bots/assets")
    }
  
    // @LINE:368
    def devBotHistory(id:Option[UserStr]): Call = {
      
      Call("GET", "/" + "bots/dev/history" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("id", id)))))
    }
  
    // @LINE:371
    def devPostAsset(tpe:String, key:String): Call = {
      
      Call("POST", "/" + "bots/dev/asset/" + tpe + "/" + key)
    }
  
    // @LINE:370
    def devAssets: Call = {
      
      Call("GET", "/" + "bots/dev/assets")
    }
  
    // @LINE:367
    def devIndex: Call = {
      
      Call("GET", "/" + "bots/dev")
    }
  
    // @LINE:372
    def devNameAsset(key:String, name:String): Call = {
      
      Call("POST", "/" + "bots/dev/asset/mv/" + key + "/" + dynamicString(name))
    }
  
    // @LINE:365
    def index: Call = {
      
      Call("GET", "/" + "bots")
    }
  
    // @LINE:369
    def devPostBot: Call = {
      
      Call("POST", "/" + "bots/dev/bot")
    }
  
  }

  // @LINE:107
  object Dasher {

  
    // @LINE:107
    def get: Call = {
      
      Call("GET", "/" + "dasher")
    }
  
  }

  // @LINE:287
  object RelayRound {

  
    // @LINE:288
    def create(tourId:RelayTourId): Call = {
      
      Call("POST", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/new")
    }
  
    // @LINE:300
    def push(roundId:RelayRoundId): Call = {
      
      Call("POST", "/" + "api/broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/push")
    }
  
    // @LINE:303
    def apiPgn(roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "api/broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + ".pgn")
    }
  
    // @LINE:308
    def apiMyRounds: Call = {
      
      Call("GET", "/" + "api/broadcast/my-rounds")
    }
  
    // @LINE:287
    def form(tourId:RelayTourId): Call = {
      
      Call("GET", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/new")
    }
  
    // @LINE:304
    def stream(roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "api/stream/broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + ".pgn")
    }
  
    // @LINE:297
    def reset(roundId:RelayRoundId): Call = {
    
      (roundId: @unchecked) match {
      
        // @LINE:297
        case (roundId)  =>
          
          Call("POST", "/" + "broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/reset")
      
      }
    
    }
  
    // @LINE:292
    def apiShow(ts:String, rs:String, roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "api/broadcast/" + dynamicString(ts) + "/" + dynamicString(rs) + "/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId))
    }
  
    // @LINE:294
    def chapter(ts:String, rs:String, roundId:RelayRoundId, chapterId:StudyChapterId): Call = {
      
      Call("GET", "/" + "broadcast/" + dynamicString(ts) + "/" + dynamicString(rs) + "/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/" + implicitly[PathBindable[StudyChapterId]].unbind("chapterId", chapterId))
    }
  
    // @LINE:301
    def pgn(ts:String, rs:String, roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "broadcast/" + dynamicString(ts) + "/" + dynamicString(rs) + "/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + ".pgn")
    }
  
    // @LINE:302
    def teamsView(roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "broadcast/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/teams")
    }
  
    // @LINE:293
    def embedShow(ts:String, rs:String, roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "embed/broadcast/" + dynamicString(ts) + "/" + dynamicString(rs) + "/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId))
    }
  
    // @LINE:291
    def show(ts:String, rs:String, roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "broadcast/" + dynamicString(ts) + "/" + dynamicString(rs) + "/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId))
    }
  
    // @LINE:295
    def edit(roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/edit")
    }
  
    // @LINE:299
    def stats(roundId:RelayRoundId): Call = {
      
      Call("GET", "/" + "broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/stats")
    }
  
    // @LINE:296
    def update(roundId:RelayRoundId): Call = {
      
      Call("POST", "/" + "broadcast/round/" + implicitly[PathBindable[RelayRoundId]].unbind("roundId", roundId) + "/edit")
    }
  
  }

  // @LINE:375
  object Round {

  
    // @LINE:765
    def apiAddTime(id:GameId, seconds:Int): Call = {
      
      Call("POST", "/" + "api/round/" + implicitly[PathBindable[GameId]].unbind("id", id) + "/add-time/" + dynamicString(implicitly[PathBindable[Int]].unbind("seconds", seconds)))
    }
  
    // @LINE:402
    def help: Call = {
      
      Call("GET", "/" + "round/help")
    }
  
    // @LINE:401
    def whatsNext(fullId:GameFullId): Call = {
      
      Call("GET", "/" + "whats-next/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId))
    }
  
    // @LINE:375
    def watcher(gameId:GameId, color:Color): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:375
        case (gameId, color) if color == Color.white =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", Color.white))); _rrc
          Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
      
        // @LINE:376
        case (gameId, color)  =>
          
          Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color))
      
      }
    
    }
  
    // @LINE:378
    def sides(gameId:GameId, color:Color): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color) + "/sides")
    }
  
    // @LINE:382
    def mini(gameId:GameId, color:Color): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:382
        case (gameId, color) if color == Color.white =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", Color.white))); _rrc
          Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/mini")
      
        // @LINE:383
        case (gameId, color)  =>
          
          Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color) + "/mini")
      
      }
    
    }
  
    // @LINE:384
    def miniFullId(fullId:GameFullId): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId) + "/mini")
    }
  
    // @LINE:380
    def readNote(gameId:GameId): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/note")
    }
  
    // @LINE:381
    def writeNote(gameId:GameId): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/note")
    }
  
    // @LINE:377
    def player(fullId:GameFullId): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId))
    }
  
    // @LINE:400
    def next(gameId:GameId): Call = {
      
      Call("GET", "/" + "round-next/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
    }
  
    // @LINE:379
    def continue(gameId:GameId, mode:String): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/continue/" + dynamicString(mode))
    }
  
    // @LINE:390
    def resign(fullId:GameFullId): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameFullId]].unbind("fullId", fullId) + "/resign")
    }
  
  }

  // @LINE:920
  object Push {

  
    // @LINE:920
    def mobileRegister(platform:String, deviceId:String): Call = {
      
      Call("POST", "/" + "mobile/register/" + dynamicString(platform) + "/" + dynamicString(deviceId))
    }
  
    // @LINE:921
    def mobileUnregister: Call = {
      
      Call("POST", "/" + "mobile/unregister")
    }
  
    // @LINE:922
    def webSubscribe: Call = {
      
      Call("POST", "/" + "push/subscribe")
    }
  
  }

  // @LINE:475
  object TeamApi {

  
    // @LINE:476
    def search(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "api/team/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:485
    def kickUser(id:TeamId, user:UserStr): Call = {
      
      Call("POST", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/kick/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:478
    def show(id:TeamId): Call = {
      
      Call("GET", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)))
    }
  
    // @LINE:477
    def teamsOf(username:UserStr): Call = {
      
      Call("GET", "/" + "api/team/of/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:482
    def requests(id:TeamId): Call = {
      
      Call("GET", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/requests")
    }
  
    // @LINE:483
    def update(id:TeamId, name:String): Call = {
      
      Call("POST", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/update/" + dynamicString(name))
    }
  
    // @LINE:484
    def requestProcess(id:TeamId, userId:UserStr, decision:String): Call = {
      
      Call("POST", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/request/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("userId", userId)) + "/" + dynamicString(decision))
    }
  
    // @LINE:479
    def users(id:TeamId): Call = {
      
      Call("GET", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/users")
    }
  
    // @LINE:475
    def all(page:Int = 1): Call = {
      
      Call("GET", "/" + "api/team/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:499
  object Fishnet {

  
    // @LINE:501
    def abort(workId:String): Call = {
      
      Call("POST", "/" + "fishnet/abort/" + workId)
    }
  
    // @LINE:499
    def acquire(slow:Boolean = false): Call = {
      
      Call("POST", "/" + "fishnet/acquire" + play.core.routing.queryString(List(if(slow == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("slow", slow)))))
    }
  
    // @LINE:502
    def keyExists(key:String): Call = {
      
      Call("GET", "/" + "fishnet/key/" + key)
    }
  
    // @LINE:500
    def analysis(workId:String, slow:Boolean = false, stop:Boolean = false): Call = {
      
      Call("POST", "/" + "fishnet/analysis/" + workId + play.core.routing.queryString(List(if(slow == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("slow", slow)), if(stop == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("stop", stop)))))
    }
  
    // @LINE:503
    def status: Call = {
      
      Call("GET", "/" + "fishnet/status")
    }
  
  }

  // @LINE:655
  object Msg {

  
    // @LINE:661
    def convoDelete(username:UserStr): Call = {
    
      (username: @unchecked) match {
      
        // @LINE:661
        case (username)  =>
          
          Call("DELETE", "/" + "inbox/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
      
      }
    
    }
  
    // @LINE:658
    def search(q:String): Call = {
      
      Call("GET", "/" + "inbox/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:659
    def unreadCount: Call = {
      
      Call("GET", "/" + "inbox/unread-count")
    }
  
    // @LINE:655
    def compatCreate: Call = {
      
      Call("POST", "/" + "inbox/new")
    }
  
    // @LINE:657
    def home: Call = {
      
      Call("GET", "/" + "inbox")
    }
  
    // @LINE:660
    def convo(username:UserStr, before:Option[Long] = None): Call = {
      
      Call("GET", "/" + "inbox/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + play.core.routing.queryString(List(if(before == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Long]]].unbind("before", before)))))
    }
  
    // @LINE:663
    def apiPost(username:UserStr): Call = {
      
      Call("POST", "/" + "inbox/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
  }

  // @LINE:4
  object Lobby {

  
    // @LINE:4
    def home: Call = {
      
      Call("GET", "/")
    }
  
    // @LINE:5
    def seeks: Call = {
      
      Call("GET", "/" + "lobby/seeks")
    }
  
    // @LINE:9
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang))
    }
  
  }

  // @LINE:266
  object RelayTour {

  
    // @LINE:271
    def help: Call = {
      
      Call("GET", "/" + "broadcast/help")
    }
  
    // @LINE:284
    def image(id:RelayTourId, tag:Option[String] = None): Call = {
      
      Call("POST", "/" + "upload/image/broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("id", id) + play.core.routing.queryString(List(if(tag == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("tag", tag)))))
    }
  
    // @LINE:281
    def edit(tourId:RelayTourId): Call = {
      
      Call("GET", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/edit")
    }
  
    // @LINE:268
    def create: Call = {
      
      Call("POST", "/" + "broadcast/new")
    }
  
    // @LINE:309
    def indexLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/broadcast")
    }
  
    // @LINE:278
    def embedShow(ts:String, id:RelayTourId): Call = {
      
      Call("GET", "/" + "embed/broadcast/" + dynamicString(ts) + "/" + implicitly[PathBindable[RelayTourId]].unbind("id", id))
    }
  
    // @LINE:274
    def apiBy(user:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "api/broadcast/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:306
    def apiTop(page:Int = 1): Call = {
      
      Call("GET", "/" + "api/broadcast/top" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:273
    def by(user:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "broadcast/by/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:283
    def delete(tourId:RelayTourId): Call = {
      
      Call("POST", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/delete")
    }
  
    // @LINE:282
    def update(tourId:RelayTourId): Call = {
      
      Call("POST", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/edit")
    }
  
    // @LINE:267
    def form: Call = {
      
      Call("GET", "/" + "broadcast/new")
    }
  
    // @LINE:275
    def subscribed(page:Int = 1): Call = {
      
      Call("GET", "/" + "broadcast/subscribed" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:272
    def app: Call = {
      
      Call("GET", "/" + "broadcast/app")
    }
  
    // @LINE:266
    def index(page:Int = 1, q:String = ""): Call = {
      
      Call("GET", "/" + "broadcast" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(q == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:286
    def subscribe(tourId:RelayTourId, set:Boolean): Call = {
      
      Call("POST", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/subscribe" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("set", set)))))
    }
  
    // @LINE:305
    def apiIndex: Call = {
      
      Call("GET", "/" + "api/broadcast")
    }
  
    // @LINE:280
    def pgn(tourId:RelayTourId): Call = {
      
      Call("GET", "/" + "api/broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + ".pgn")
    }
  
    // @LINE:289
    def playersView(tourId:RelayTourId): Call = {
      
      Call("GET", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/players")
    }
  
    // @LINE:307
    def apiSearch(page:Int = 1, q:String = ""): Call = {
      
      Call("GET", "/" + "api/broadcast/search" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(q == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:279
    def apiShow(id:RelayTourId): Call = {
      
      Call("GET", "/" + "api/broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("id", id))
    }
  
    // @LINE:276
    def allPrivate(page:Int = 1): Call = {
      
      Call("GET", "/" + "broadcast/all-private" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:285
    def cloneTour(tourId:RelayTourId): Call = {
      
      Call("POST", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/clone")
    }
  
    // @LINE:270
    def calendarMonth(year:Int, month:Int): Call = {
      
      Call("GET", "/" + "broadcast/calendar/" + dynamicString(implicitly[PathBindable[Int]].unbind("year", year)) + "/" + dynamicString(implicitly[PathBindable[Int]].unbind("month", month)))
    }
  
    // @LINE:277
    def show(ts:String, id:RelayTourId): Call = {
      
      Call("GET", "/" + "broadcast/" + dynamicString(ts) + "/" + implicitly[PathBindable[RelayTourId]].unbind("id", id))
    }
  
    // @LINE:290
    def player(tourId:RelayTourId, id:String): Call = {
      
      Call("GET", "/" + "broadcast/" + implicitly[PathBindable[RelayTourId]].unbind("tourId", tourId) + "/players/" + dynamicString(id))
    }
  
    // @LINE:269
    def calendar: Call = {
      
      Call("GET", "/" + "broadcast/calendar")
    }
  
  }

  // @LINE:787
  object PlayApi {

  
    // @LINE:788
    def botMove(id:GameId, uci:String, offeringDraw:Option[Boolean] = None): Call = {
      
      Call("POST", "/" + "api/bot/game/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)) + "/move/" + dynamicString(uci) + play.core.routing.queryString(List(if(offeringDraw == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Boolean]]].unbind("offeringDraw", offeringDraw)))))
    }
  
    // @LINE:792
    def botOnline: Call = {
      
      Call("GET", "/" + "player/bots")
    }
  
    // @LINE:789
    def botOnlineApi: Call = {
      
      Call("GET", "/" + "api/bot/online")
    }
  
    // @LINE:795
    def boardGameStream(id:GameId): Call = {
      
      Call("GET", "/" + "api/board/game/stream/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)))
    }
  
    // @LINE:790
    def botCommand(cmd:String): Call = {
      
      Call("POST", "/" + "api/bot/" + cmd)
    }
  
    // @LINE:787
    def botGameStream(id:GameId): Call = {
      
      Call("GET", "/" + "api/bot/game/stream/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)))
    }
  
    // @LINE:799
    def boardCommandPost(cmd:String): Call = {
      
      Call("POST", "/" + "api/board/" + cmd)
    }
  
    // @LINE:796
    def boardMove(id:GameId, uci:String, offeringDraw:Option[Boolean] = None): Call = {
      
      Call("POST", "/" + "api/board/game/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)) + "/move/" + dynamicString(uci) + play.core.routing.queryString(List(if(offeringDraw == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Boolean]]].unbind("offeringDraw", offeringDraw)))))
    }
  
    // @LINE:800
    def boardCommandGet(cmd:String): Call = {
      
      Call("GET", "/" + "api/board/" + cmd)
    }
  
    // @LINE:791
    def botCommandGet(cmd:String): Call = {
      
      Call("GET", "/" + "api/bot/" + cmd)
    }
  
  }

  // @LINE:950
  object ExternalAssets {

  
    // @LINE:950
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "public"))); _rrc
      Call("GET", "/" + "assets/" + file)
    }
  
  }

  // @LINE:210
  object Racer {

  
    // @LINE:213
    def show(id:String): Call = {
      
      Call("GET", "/" + "racer/" + dynamicString(id))
    }
  
    // @LINE:216
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/racer")
    }
  
    // @LINE:211
    def create: Call = {
      
      Call("POST", "/" + "racer")
    }
  
    // @LINE:214
    def rematch(id:String): Call = {
      
      Call("GET", "/" + "racer/" + dynamicString(id) + "/rematch")
    }
  
    // @LINE:215
    def lobby: Call = {
      
      Call("POST", "/" + "racer/lobby")
    }
  
    // @LINE:210
    def home: Call = {
      
      Call("GET", "/" + "racer")
    }
  
    // @LINE:212
    def apiCreate: Call = {
      
      Call("POST", "/" + "api/racer")
    }
  
  }

  // @LINE:83
  object Ublog {

  
    // @LINE:127
    def form(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog/new")
    }
  
    // @LINE:130
    def redirect(id:UblogPostId): Call = {
      
      Call("GET", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/redirect")
    }
  
    // @LINE:117
    def friends(page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/friends" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:136
    def modPost(id:UblogPostId): Call = {
      
      Call("POST", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/adjust")
    }
  
    // @LINE:139
    def image(id:UblogPostId): Call = {
      
      Call("POST", "/" + "upload/image/ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id))
    }
  
    // @LINE:128
    def create(username:UserStr): Call = {
      
      Call("POST", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog/new")
    }
  
    // @LINE:135
    def modBlog(blogId:String): Call = {
      
      Call("POST", "/" + "ublog/" + dynamicString(blogId) + "/tier")
    }
  
    // @LINE:84
    def userAtom(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog.atom")
    }
  
    // @LINE:118
    def liked(page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/liked" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:114
    def thisMonth(filter:Option[BlogQualityFilter] = None, by:BlogsBy = BlogsBy.newest, page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/monthly" + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[BlogQualityFilter]]].unbind("filter", filter)), if(by == BlogsBy.newest) None else Some(implicitly[play.api.mvc.QueryStringBindable[BlogsBy]].unbind("by", by)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:126
    def drafts(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog/drafts" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:122
    def communityAtom(lang:Language): Call = {
    
      (lang: @unchecked) match {
      
        // @LINE:122
        case (lang)  =>
          
          Call("GET", "/" + "blog/community.atom" + play.core.routing.queryString(List(if(lang == Language("all")) None else Some(implicitly[play.api.mvc.QueryStringBindable[Language]].unbind("lang", lang)))))
      
      }
    
    }
  
    // @LINE:132
    def update(id:UblogPostId): Call = {
      
      Call("POST", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:113
    def topic(topic:String, filter:Option[BlogQualityFilter] = None, by:BlogsBy = BlogsBy.newest, page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/topic/" + dynamicString(topic) + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[BlogQualityFilter]]].unbind("filter", filter)), if(by == BlogsBy.newest) None else Some(implicitly[play.api.mvc.QueryStringBindable[BlogsBy]].unbind("by", by)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:125
    def post(username:UserStr, slug:String, id:UblogPostId): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog/" + dynamicString(slug) + "/" + dynamicString(implicitly[PathBindable[UblogPostId]].unbind("id", id)))
    }
  
    // @LINE:120
    def communityAll(filter:Option[BlogQualityFilter] = None, page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/community" + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[BlogQualityFilter]]].unbind("filter", filter)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:115
    def byMonth(year:Int, month:Int, filter:Option[BlogQualityFilter] = None, by:BlogsBy = BlogsBy.newest, page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/monthly/" + dynamicString(implicitly[PathBindable[Int]].unbind("year", year)) + "/" + dynamicString(implicitly[PathBindable[Int]].unbind("month", month)) + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[BlogQualityFilter]]].unbind("filter", filter)), if(by == BlogsBy.newest) None else Some(implicitly[play.api.mvc.QueryStringBindable[BlogsBy]].unbind("by", by)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:124
    def historicalBlogPost(id:String, slug:String): Call = {
      
      Call("GET", "/" + "blog/" + dynamicString(id) + "/" + dynamicString(slug))
    }
  
    // @LINE:119
    def search(text:String = "", by:BlogsBy = BlogsBy.score, page:Int = 1): Call = {
      
      Call("GET", "/" + "blog/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(by == BlogsBy.score) None else Some(implicitly[play.api.mvc.QueryStringBindable[BlogsBy]].unbind("by", by)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:83
    def index(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blog" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:137
    def modPull(id:UblogPostId): Call = {
      
      Call("POST", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/pull")
    }
  
    // @LINE:121
    def communityLang(lang:Language, filter:Option[BlogQualityFilter] = None, page:Int = 1): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/blog/community" + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[BlogQualityFilter]]].unbind("filter", filter)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:138
    def modShowCarousel: Call = {
      
      Call("GET", "/" + "ublog/carousel")
    }
  
    // @LINE:134
    def like(id:UblogPostId, v:Boolean): Call = {
      
      Call("POST", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/like" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:131
    def edit(id:UblogPostId): Call = {
      
      Call("GET", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:133
    def delete(id:UblogPostId): Call = {
      
      Call("POST", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/del")
    }
  
    // @LINE:129
    def discuss(id:UblogPostId): Call = {
      
      Call("GET", "/" + "ublog/" + implicitly[PathBindable[UblogPostId]].unbind("id", id) + "/discuss")
    }
  
    // @LINE:112
    def topics: Call = {
      
      Call("GET", "/" + "blog/topic")
    }
  
  }

  // @LINE:23
  object Game {

  
    // @LINE:28
    def bookmark(gameId:GameId): Call = {
      
      Call("POST", "/" + "bookmark/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
    }
  
    // @LINE:398
    def delete(gameId:GameId): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/delete")
    }
  
    // @LINE:490
    def exportOne(gameId:GameId): Call = {
    
      (gameId: @unchecked) match {
      
        // @LINE:490
        case (gameId)  =>
          
          Call("GET", "/" + "game/export/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
      
      }
    
    }
  
    // @LINE:777
    def apiExportByUserBookmarks(): Call = {
      
      Call("GET", "/" + "api/games/export/bookmarks")
    }
  
    // @LINE:776
    def apiExportByUserImportedGames(): Call = {
      
      Call("GET", "/" + "api/games/export/imports")
    }
  
    // @LINE:25
    def exportByUser(username:UserStr): Call = {
      
      Call("GET", "/" + "games/export/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:23
    def exportByIds: Call = {
    
      () match {
      
        // @LINE:23
        case ()  =>
          
          Call("POST", "/" + "games/export/_ids")
      
      }
    
    }
  
    // @LINE:775
    def apiExportByUser(username:UserStr): Call = {
      
      Call("GET", "/" + "api/games/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
  }

  // @LINE:405
  object Tournament {

  
    // @LINE:480
    def byTeam(id:TeamId): Call = {
      
      Call("GET", "/" + "api/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/arena")
    }
  
    // @LINE:429
    def shields: Call = {
      
      Call("GET", "/" + "tournament/shields")
    }
  
    // @LINE:427
    def help: Call = {
      
      Call("GET", "/" + "tournament/help")
    }
  
    // @LINE:409
    def teamBattleForm(teamId:TeamId): Call = {
      
      Call("GET", "/" + "tournament/team-battle/new/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("teamId", teamId)))
    }
  
    // @LINE:413
    def history(freq:String, page:Int = 1): Call = {
    
      (freq: @unchecked, page: @unchecked) match {
      
        // @LINE:413
        case (freq, page) if freq == "unique" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("freq", "unique"))); _rrc
          Call("GET", "/" + "tournament/history" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
      
        // @LINE:414
        case (freq, page)  =>
          
          Call("GET", "/" + "tournament/history/" + dynamicString(freq) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
      
      }
    
    }
  
    // @LINE:421
    def teamInfo(id:TourId, team:TeamId): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("team", team)))
    }
  
    // @LINE:426
    def moderation(id:TourId, view:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/mod/" + dynamicString(view))
    }
  
    // @LINE:423
    def edit(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:431
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/tournament")
    }
  
    // @LINE:416
    def standing(id:TourId, page:Int): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/standing/" + dynamicString(implicitly[PathBindable[Int]].unbind("page", page)))
    }
  
    // @LINE:419
    def pause(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:428
    def leaderboard: Call = {
      
      Call("GET", "/" + "tournament/leaderboard")
    }
  
    // @LINE:731
    def apiTeamBattleUpdate(id:TourId): Call = {
      
      Call("POST", "/" + "api/tournament/team-battle/" + dynamicString(implicitly[PathBindable[TourId]].unbind("id", id)))
    }
  
    // @LINE:418
    def join(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/join")
    }
  
    // @LINE:727
    def apiUpdate(id:TourId): Call = {
      
      Call("POST", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
    // @LINE:728
    def apiJoin(id:TourId): Call = {
      
      Call("POST", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/join")
    }
  
    // @LINE:406
    def featured: Call = {
      
      Call("GET", "/" + "tournament/featured")
    }
  
    // @LINE:430
    def categShields(categ:String): Call = {
      
      Call("GET", "/" + "tournament/shields/" + dynamicString(categ))
    }
  
    // @LINE:422
    def terminate(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/terminate")
    }
  
    // @LINE:424
    def update(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:722
    def apiShow(id:TourId): Call = {
      
      Call("GET", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
    // @LINE:730
    def apiTerminate(id:TourId): Call = {
      
      Call("POST", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/terminate")
    }
  
    // @LINE:408
    def webCreate: Call = {
      
      Call("POST", "/" + "tournament/new")
    }
  
    // @LINE:420
    def player(id:TourId, user:UserStr): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/player/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:411
    def teamBattleUpdate(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/team-battle/edit/" + dynamicString(implicitly[PathBindable[TourId]].unbind("id", id)))
    }
  
    // @LINE:407
    def form: Call = {
      
      Call("GET", "/" + "tournament/new")
    }
  
    // @LINE:417
    def pageOf(id:TourId, user:UserStr): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/page-of/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:729
    def apiWithdraw(id:TourId): Call = {
      
      Call("POST", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:405
    def home: Call = {
      
      Call("GET", "/" + "tournament")
    }
  
    // @LINE:410
    def teamBattleEdit(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/team-battle/edit/" + dynamicString(implicitly[PathBindable[TourId]].unbind("id", id)))
    }
  
    // @LINE:415
    def show(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
    // @LINE:726
    def apiCreate: Call = {
      
      Call("POST", "/" + "api/tournament")
    }
  
    // @LINE:425
    def battleTeams(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/teams")
    }
  
    // @LINE:412
    def calendar: Call = {
      
      Call("GET", "/" + "tournament/calendar")
    }
  
  }

  // @LINE:506
  object Pref {

  
    // @LINE:510
    def formApply: Call = {
      
      Call("POST", "/" + "account/preferences")
    }
  
    // @LINE:507
    def network: Call = {
      
      Call("GET", "/" + "account/preferences/network")
    }
  
    // @LINE:506
    def set(name:String): Call = {
      
      Call("POST", "/" + "pref/" + dynamicString(name))
    }
  
    // @LINE:511
    def notifyFormApply: Call = {
      
      Call("POST", "/" + "account/preferences/notification")
    }
  
    // @LINE:754
    def apiGet: Call = {
      
      Call("GET", "/" + "api/account/preferences")
    }
  
    // @LINE:755
    def apiSet(name:String): Call = {
      
      Call("POST", "/" + "api/account/preferences/" + dynamicString(name))
    }
  
    // @LINE:509
    def form(categ:String): Call = {
      
      Call("GET", "/" + "account/preferences/" + dynamicString(categ))
    }
  
    // @LINE:508
    def networkPost: Call = {
      
      Call("POST", "/" + "account/preferences/network")
    }
  
  }

  // @LINE:638
  object ForumTopic {

  
    // @LINE:641
    def participants(topicId:ForumTopicId): Call = {
      
      Call("GET", "/" + "forum/participants/" + dynamicString(implicitly[PathBindable[ForumTopicId]].unbind("topicId", topicId)))
    }
  
    // @LINE:651
    def diagnostic: Call = {
      
      Call("POST", "/" + "diagnostic")
    }
  
    // @LINE:644
    def sticky(categId:ForumCategId, slug:ForumTopicSlug): Call = {
      
      Call("POST", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/" + dynamicString(implicitly[PathBindable[ForumTopicSlug]].unbind("slug", slug)) + "/sticky")
    }
  
    // @LINE:638
    def form(categId:ForumCategId): Call = {
      
      Call("GET", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/form")
    }
  
    // @LINE:642
    def show(categId:ForumCategId, slug:ForumTopicSlug, page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/" + dynamicString(implicitly[PathBindable[ForumTopicSlug]].unbind("slug", slug)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:652
    def clearDiagnostic(slug:ForumTopicSlug): Call = {
      
      Call("POST", "/" + "diagnostic/clear/" + dynamicString(implicitly[PathBindable[ForumTopicSlug]].unbind("slug", slug)))
    }
  
    // @LINE:643
    def close(categId:ForumCategId, slug:ForumTopicSlug): Call = {
      
      Call("POST", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/" + dynamicString(implicitly[PathBindable[ForumTopicSlug]].unbind("slug", slug)) + "/close")
    }
  
    // @LINE:639
    def create(categId:ForumCategId): Call = {
      
      Call("POST", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/new")
    }
  
  }

  // @LINE:570
  object Mod {

  
    // @LINE:571
    def altMany: Call = {
      
      Call("POST", "/" + "mod/alt-many")
    }
  
    // @LINE:611
    def permissions(username:UserStr): Call = {
      
      Call("GET", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/permissions")
    }
  
    // @LINE:583
    def spontaneousInquiry(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/inquiry")
    }
  
    // @LINE:620
    def singleIpBan(v:Boolean, ip:String): Call = {
      
      Call("POST", "/" + "mod/ip/ban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)) + "/" + dynamicString(ip))
    }
  
    // @LINE:614
    def publicChat: Call = {
      
      Call("GET", "/" + "mod/public-chat")
    }
  
    // @LINE:610
    def chatUser(username:UserStr): Call = {
      
      Call("GET", "/" + "mod/chat-user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:593
    def impersonate(username:String): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(username) + "/impersonate")
    }
  
    // @LINE:574
    def troll(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/troll/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:604
    def gamifyPeriod(period:String): Call = {
      
      Call("GET", "/" + "mod/leaderboard/" + dynamicString(period))
    }
  
    // @LINE:622
    def presetsUpdate(group:String): Call = {
      
      Call("POST", "/" + "mod/presets/" + dynamicString(group))
    }
  
    // @LINE:623
    def eventStream: Call = {
      
      Call("GET", "/" + "api/stream/mod")
    }
  
    // @LINE:624
    def markedUsersStream: Call = {
      
      Call("GET", "/" + "api/stream/mod-marked-since")
    }
  
    // @LINE:576
    def deletePmsAndChats(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/delete-pms-and-chats")
    }
  
    // @LINE:719
    def apiUserLog(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/mod-log")
    }
  
    // @LINE:600
    def inquiryToZulip: Call = {
      
      Call("POST", "/" + "mod/inquiry-to-zulip")
    }
  
    // @LINE:572
    def engine(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/engine/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:617
    def print(fh:String): Call = {
      
      Call("GET", "/" + "mod/print/" + dynamicString(fh))
    }
  
    // @LINE:601
    def createNameCloseVote(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/create-name-close-vote")
    }
  
    // @LINE:602
    def askUsertableCheck(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/ask-usertable-check")
    }
  
    // @LINE:603
    def gamify: Call = {
      
      Call("GET", "/" + "mod/leaderboard")
    }
  
    // @LINE:573
    def booster(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/booster/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:584
    def communicationPublic(username:UserStr): Call = {
      
      Call("GET", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/communication")
    }
  
    // @LINE:599
    def setEmail(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/email")
    }
  
    // @LINE:577
    def warn(username:UserStr, subject:String): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/warn" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("subject", subject)))))
    }
  
    // @LINE:589
    def prizeban(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/prizeban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:605
    def activity: Call = {
      
      Call("GET", "/" + "mod/activity")
    }
  
    // @LINE:570
    def alt(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/alt/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:597
    def log(mod:Option[UserStr] = None, id:Option[String] = None): Call = {
      
      Call("GET", "/" + "mod/log" + play.core.routing.queryString(List(if(mod == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("mod", mod)), if(id == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("id", id)))))
    }
  
    // @LINE:607
    def queues(period:String): Call = {
      
      Call("GET", "/" + "mod/queues/" + dynamicString(period))
    }
  
    // @LINE:579
    def disableTwoFactor(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/disable-2fa")
    }
  
    // @LINE:606
    def activityOf(who:String, period:String): Call = {
      
      Call("GET", "/" + "mod/activity/" + dynamicString(who) + "/" + dynamicString(period))
    }
  
    // @LINE:615
    def publicChatTimeout: Call = {
      
      Call("POST", "/" + "mod/public-chat/timeout")
    }
  
    // @LINE:581
    def reopenAccount(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/reopen")
    }
  
    // @LINE:587
    def rankban(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/rankban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:613
    def gdprErase(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/gdpr-erase")
    }
  
    // @LINE:590
    def reportban(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/reportban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:578
    def kid(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/kid" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:591
    def blankPassword(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/blank-password")
    }
  
    // @LINE:608
    def search: Call = {
      
      Call("GET", "/" + "mod/search")
    }
  
    // @LINE:616
    def emailConfirm: Call = {
      
      Call("GET", "/" + "mod/email-confirm")
    }
  
    // @LINE:588
    def arenaBan(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/arenaban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:592
    def freePatron(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/free-patron")
    }
  
    // @LINE:580
    def closeAccount(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/close")
    }
  
    // @LINE:609
    def notes(page:Int = 1, q:String = ""): Call = {
      
      Call("GET", "/" + "mod/notes" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(q == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:621
    def presets(group:String): Call = {
      
      Call("GET", "/" + "mod/presets/" + dynamicString(group))
    }
  
    // @LINE:598
    def refreshUserAssess(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/refreshUserAssess")
    }
  
    // @LINE:582
    def setTitle(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/title")
    }
  
    // @LINE:585
    def communicationPrivate(username:UserStr): Call = {
      
      Call("GET", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/communication/private")
    }
  
    // @LINE:586
    def fullCommsExport(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/communication/full-comms-export")
    }
  
    // @LINE:612
    def savePermissions(username:UserStr): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/permissions")
    }
  
    // @LINE:575
    def isolate(username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/isolate/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:596
    def table: Call = {
      
      Call("GET", "/" + "mod/table")
    }
  
    // @LINE:618
    def printBan(v:Boolean, fh:String): Call = {
      
      Call("POST", "/" + "mod/print/ban/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)) + "/" + dynamicString(fh))
    }
  
    // @LINE:619
    def singleIp(ip:String): Call = {
      
      Call("GET", "/" + "mod/ip/" + dynamicString(ip))
    }
  
  }

  // @LINE:164
  object Puzzle {

  
    // @LINE:185
    def vote(id:PuzzleId): Call = {
      
      Call("POST", "/" + "training/" + implicitly[PathBindable[PuzzleId]].unbind("id", id) + "/vote")
    }
  
    // @LINE:167
    def help: Call = {
      
      Call("GET", "/" + "training/help")
    }
  
    // @LINE:179
    def mobileBcLoad(numericalId:Long): Call = {
      
      Call("GET", "/" + "training/" + implicitly[PathBindable[Long]].unbind("numericalId", numericalId) + "/load")
    }
  
    // @LINE:184
    def mobileBcRound(numericalId:Long): Call = {
      
      Call("POST", "/" + "training/" + implicitly[PathBindable[Long]].unbind("numericalId", numericalId) + "/round2")
    }
  
    // @LINE:707
    def apiBatchSelect(angle:String): Call = {
      
      Call("GET", "/" + "api/puzzle/batch/" + dynamicString(angle))
    }
  
    // @LINE:181
    def show(angleOrId:String): Call = {
      
      Call("GET", "/" + "training/" + dynamicString(angleOrId))
    }
  
    // @LINE:190
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/training")
    }
  
    // @LINE:178
    def mobileBcNew: Call = {
      
      Call("GET", "/" + "training/new")
    }
  
    // @LINE:182
    def angleAndColor(angle:String, color:String): Call = {
      
      Call("GET", "/" + "training/" + dynamicString(angle) + "/" + color)
    }
  
    // @LINE:702
    def apiDaily: Call = {
      
      Call("GET", "/" + "api/puzzle/daily")
    }
  
    // @LINE:198
    def streakLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/streak")
    }
  
    // @LINE:174
    def replay(days:Days, theme:String): Call = {
      
      Call("GET", "/" + "training/replay/" + implicitly[PathBindable[Days]].unbind("days", days) + "/" + dynamicString(theme))
    }
  
    // @LINE:175
    def history(page:Int = 1, u:Option[UserStr]): Call = {
      
      Call("GET", "/" + "training/history" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("u", u)))))
    }
  
    // @LINE:705
    def apiShow(id:PuzzleId): Call = {
      
      Call("GET", "/" + "api/puzzle/" + implicitly[PathBindable[PuzzleId]].unbind("id", id))
    }
  
    // @LINE:197
    def apiStreakResult(score:Int): Call = {
      
      Call("POST", "/" + "api/streak/" + dynamicString(implicitly[PathBindable[Int]].unbind("score", score)))
    }
  
    // @LINE:703
    def activity: Call = {
      
      Call("GET", "/" + "api/puzzle/activity")
    }
  
    // @LINE:166
    def frame: Call = {
      
      Call("GET", "/" + "training/frame")
    }
  
    // @LINE:196
    def apiStreak: Call = {
      
      Call("GET", "/" + "api/streak")
    }
  
    // @LINE:704
    def apiDashboard(days:Days): Call = {
      
      Call("GET", "/" + "api/puzzle/dashboard/" + implicitly[PathBindable[Days]].unbind("days", days))
    }
  
    // @LINE:172
    def dashboard(days:Days, path:String, u:Option[UserStr]): Call = {
    
      (days: @unchecked, path: @unchecked, u: @unchecked) match {
      
        // @LINE:172
        case (days, path, u) if path == "home" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "home"))); _rrc
          Call("GET", "/" + "training/dashboard/" + implicitly[PathBindable[Days]].unbind("days", days) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("u", u)))))
      
        // @LINE:173
        case (days, path, u)  =>
          
          Call("GET", "/" + "training/dashboard/" + implicitly[PathBindable[Days]].unbind("days", days) + "/" + dynamicString(path) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("u", u)))))
      
      }
    
    }
  
    // @LINE:171
    def ofPlayer(name:Option[UserStr] = None, page:Int = 1): Call = {
      
      Call("GET", "/" + "training/of-player" + play.core.routing.queryString(List(if(name == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("name", name)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:177
    def mobileBcBatchSolve: Call = {
      
      Call("POST", "/" + "training/batch")
    }
  
    // @LINE:708
    def apiBatchSolve(angle:String): Call = {
      
      Call("POST", "/" + "api/puzzle/batch/" + dynamicString(angle))
    }
  
    // @LINE:188
    def complete(theme:String, id:PuzzleId): Call = {
      
      Call("POST", "/" + "training/complete/" + dynamicString(theme) + "/" + implicitly[PathBindable[PuzzleId]].unbind("id", id))
    }
  
    // @LINE:176
    def mobileBcBatchSelect: Call = {
      
      Call("GET", "/" + "training/batch")
    }
  
    // @LINE:191
    def themesLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/training/themes")
    }
  
    // @LINE:189
    def setDifficulty(theme:String): Call = {
      
      Call("POST", "/" + "training/difficulty/" + dynamicString(theme))
    }
  
    // @LINE:186
    def report(id:PuzzleId): Call = {
      
      Call("POST", "/" + "training/" + implicitly[PathBindable[PuzzleId]].unbind("id", id) + "/report")
    }
  
    // @LINE:187
    def voteTheme(id:PuzzleId, theme:String): Call = {
      
      Call("POST", "/" + "training/" + implicitly[PathBindable[PuzzleId]].unbind("id", id) + "/vote/" + dynamicString(theme))
    }
  
    // @LINE:706
    def apiNext: Call = {
      
      Call("GET", "/" + "api/puzzle/next")
    }
  
    // @LINE:192
    def showLang(lang:Language, angleOrId:String): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/training/" + dynamicString(angleOrId))
    }
  
    // @LINE:164
    def home: Call = {
      
      Call("GET", "/" + "training")
    }
  
    // @LINE:165
    def daily: Call = {
      
      Call("GET", "/" + "training/daily")
    }
  
    // @LINE:169
    def themes: Call = {
      
      Call("GET", "/" + "training/themes")
    }
  
    // @LINE:183
    def showWithAngle(angle:String, id:PuzzleId): Call = {
      
      Call("GET", "/" + "training/" + dynamicString(angle) + "/" + implicitly[PathBindable[PuzzleId]].unbind("id", id))
    }
  
    // @LINE:170
    def openings(order:String = "popular"): Call = {
      
      Call("GET", "/" + "training/openings" + play.core.routing.queryString(List(if(order == "popular") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("order", order)))))
    }
  
    // @LINE:709
    def apiReplay(days:Days, theme:String): Call = {
      
      Call("GET", "/" + "api/puzzle/replay/" + implicitly[PathBindable[Days]].unbind("days", days) + "/" + dynamicString(theme))
    }
  
    // @LINE:195
    def streak: Call = {
      
      Call("GET", "/" + "streak")
    }
  
    // @LINE:180
    def mobileBcVote(numericalId:Long): Call = {
      
      Call("POST", "/" + "training/" + implicitly[PathBindable[Long]].unbind("numericalId", numericalId) + "/vote")
    }
  
  }

  // @LINE:942
  object DgtCtrl {

  
    // @LINE:942
    def index: Call = {
      
      Call("GET", "/" + "dgt")
    }
  
    // @LINE:943
    def play: Call = {
      
      Call("GET", "/" + "dgt/play")
    }
  
    // @LINE:944
    def config: Call = {
      
      Call("GET", "/" + "dgt/config")
    }
  
    // @LINE:945
    def generateToken: Call = {
      
      Call("POST", "/" + "dgt/config/token")
    }
  
  }

  // @LINE:392
  object Analyse {

  
    // @LINE:780
    def externalEngineList: Call = {
      
      Call("GET", "/" + "api/external-engine")
    }
  
    // @LINE:782
    def externalEngineShow(id:String): Call = {
      
      Call("GET", "/" + "api/external-engine/" + dynamicString(id))
    }
  
    // @LINE:783
    def externalEngineUpdate(id:String): Call = {
      
      Call("PUT", "/" + "api/external-engine/" + dynamicString(id))
    }
  
    // @LINE:392
    def embed(gameId:GameId, color:Color): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:392
        case (gameId, color) if color == Color.white =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", Color.white))); _rrc
          Call("GET", "/" + "embed/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
      
        // @LINE:393
        case (gameId, color)  =>
          
          Call("GET", "/" + "embed/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color))
      
      }
    
    }
  
    // @LINE:781
    def externalEngineCreate: Call = {
      
      Call("POST", "/" + "api/external-engine")
    }
  
    // @LINE:488
    def requestAnalysis(gameId:GameId): Call = {
      
      Call("POST", "/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/request-analysis")
    }
  
    // @LINE:784
    def externalEngineDelete(id:String): Call = {
      
      Call("DELETE", "/" + "api/external-engine/" + dynamicString(id))
    }
  
    // @LINE:395
    def embedReplayGame(gameId:GameId, color:Color): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:395
        case (gameId, color) if color == Color.white =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", Color.white))); _rrc
          Call("GET", "/" + "embed/game/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId))
      
        // @LINE:396
        case (gameId, color)  =>
          
          Call("GET", "/" + "embed/game/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + implicitly[PathBindable[Color]].unbind("color", color))
      
      }
    
    }
  
  }

  // @LINE:891
  object Github {

  
    // @LINE:891
    def secretScanning: Call = {
      
      Call("POST", "/" + "github/secret-scanning")
    }
  
  }

  // @LINE:74
  object User {

  
    // @LINE:86
    def show(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:80
    def perfStat(username:UserStr, perfKey:PerfKey): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/perf/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:92
    def topNbApi(nb:Int, perfKey:PerfKey): Call = {
      
      Call("GET", "/" + "api/player/top/" + dynamicString(implicitly[PathBindable[Int]].unbind("nb", nb)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:74
    def mod(username:UserStr): Call = {
      
      Call("GET", "/" + "api/stream/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/mod")
    }
  
    // @LINE:82
    def download(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/download")
    }
  
    // @LINE:714
    def apiReadNote(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/note")
    }
  
    // @LINE:89
    def search(term:String): Call = {
      
      Call("GET", "/" + "player/search/" + dynamicString(term))
    }
  
    // @LINE:94
    def online: Call = {
      
      Call("GET", "/" + "player/online")
    }
  
    // @LINE:77
    def setDoxNote(id:String, v:Boolean): Call = {
      
      Call("POST", "/" + "note/setDox/" + dynamicString(id) + "/" + dynamicString(implicitly[PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:87
    def myself: Call = {
      
      Call("GET", "/" + "player/myself")
    }
  
    // @LINE:81
    def gamesAll(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:716
    def ratingHistory(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/rating-history")
    }
  
    // @LINE:955
    def redirect(path:String): Call = {
      
      Call("GET", "/" + path)
    }
  
    // @LINE:85
    def games(username:UserStr, filterName:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/" + dynamicString(filterName) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:717
    def tvExport(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/current-game")
    }
  
    // @LINE:88
    def opponents: Call = {
      
      Call("GET", "/" + "player/opponents")
    }
  
    // @LINE:79
    def tv(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/tv")
    }
  
    // @LINE:90
    def list: Call = {
      
      Call("GET", "/" + "player")
    }
  
    // @LINE:96
    def apiList: Call = {
      
      Call("GET", "/" + "api/player")
    }
  
    // @LINE:697
    def ratingDistribution(perf:PerfKey, username:Option[UserStr] = None): Call = {
      
      Call("GET", "/" + "stat/rating/distribution/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perf", perf)) + play.core.routing.queryString(List(if(username == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[UserStr]]].unbind("username", username)))))
    }
  
    // @LINE:95
    def autocomplete: Call = {
      
      Call("GET", "/" + "api/player/autocomplete")
    }
  
    // @LINE:93
    def topWeek: Call = {
      
      Call("GET", "/" + "player/top/week")
    }
  
    // @LINE:75
    def writeNote(username:UserStr): Call = {
      
      Call("POST", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/note")
    }
  
    // @LINE:715
    def apiWriteNote(user:UserStr): Call = {
      
      Call("POST", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/note")
    }
  
    // @LINE:76
    def deleteNote(id:String): Call = {
      
      Call("POST", "/" + "note/delete/" + dynamicString(id))
    }
  
    // @LINE:91
    def topNb(nb:Int, perfKey:PerfKey): Call = {
      
      Call("GET", "/" + "player/top/" + dynamicString(implicitly[PathBindable[Int]].unbind("nb", nb)) + "/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:78
    def showMini(username:UserStr): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/mini")
    }
  
  }

  // @LINE:627
  object Irwin {

  
    // @LINE:627
    def dashboard: Call = {
      
      Call("GET", "/" + "irwin")
    }
  
    // @LINE:628
    def saveReport: Call = {
      
      Call("POST", "/" + "irwin/report")
    }
  
    // @LINE:629
    def eventStream: Call = {
      
      Call("GET", "/" + "api/stream/irwin")
    }
  
    // @LINE:632
    def kaladin: Call = {
      
      Call("GET", "/" + "kaladin")
    }
  
  }

  // @LINE:71
  object Simul {

  
    // @LINE:472
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/simul")
    }
  
    // @LINE:460
    def create: Call = {
      
      Call("POST", "/" + "simul/new")
    }
  
    // @LINE:466
    def accept(id:SimulId, user:UserStr): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/accept/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:71
    def byUser(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/simuls/hosted" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:465
    def hostPing(id:SimulId): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/host-ping")
    }
  
    // @LINE:464
    def update(id:SimulId): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:471
    def withdraw(id:SimulId): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:470
    def join(id:SimulId, variant:chess.variant.Variant.LilaKey): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/join/" + dynamicString(implicitly[PathBindable[chess.variant.Variant.LilaKey]].unbind("variant", variant)))
    }
  
    // @LINE:459
    def form: Call = {
      
      Call("GET", "/" + "simul/new")
    }
  
    // @LINE:463
    def edit(id:SimulId): Call = {
      
      Call("GET", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:461
    def homeReload: Call = {
      
      Call("GET", "/" + "simul/reload")
    }
  
    // @LINE:740
    def apiList: Call = {
      
      Call("GET", "/" + "api/simul")
    }
  
    // @LINE:467
    def reject(id:SimulId, user:UserStr): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/reject/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:458
    def home: Call = {
      
      Call("GET", "/" + "simul")
    }
  
    // @LINE:462
    def show(id:SimulId): Call = {
      
      Call("GET", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id))
    }
  
    // @LINE:469
    def abort(id:SimulId): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/abort")
    }
  
    // @LINE:468
    def start(id:SimulId): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[PathBindable[SimulId]].unbind("id", id) + "/start")
    }
  
  }

  // @LINE:635
  object ForumCateg {

  
    // @LINE:635
    def index: Call = {
      
      Call("GET", "/" + "forum")
    }
  
    // @LINE:637
    def show(categId:ForumCategId, page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:640
    def modFeed(categId:ForumCategId, page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/" + dynamicString(implicitly[PathBindable[ForumCategId]].unbind("categId", categId)) + "/mod-feed" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:34
  object Main {

  
    // @LINE:885
    def lag: Call = {
      
      Call("GET", "/" + "lag")
    }
  
    // @LINE:907
    def externalLink(tag:String): Call = {
      
      Call("GET", "/" + "run/external-link/" + dynamicString(tag))
    }
  
    // @LINE:880
    def webmasters: Call = {
      
      Call("GET", "/" + "developers")
    }
  
    // @LINE:886
    def getFishnet: Call = {
      
      Call("GET", "/" + "get-fishnet")
    }
  
    // @LINE:890
    def uploadImage(rel:String): Call = {
      
      Call("POST", "/" + "upload/image/user/" + dynamicString(rel))
    }
  
    // @LINE:930
    def legacyQaQuestion(id:Int, slug:String): Call = {
      
      Call("GET", "/" + "qa/" + dynamicString(implicitly[PathBindable[Int]].unbind("id", id)) + "/" + dynamicString(slug))
    }
  
    // @LINE:882
    def redirectToAppStore: Call = {
      
      Call("GET", "/" + "app-store")
    }
  
    // @LINE:881
    def mobile: Call = {
      
      Call("GET", "/" + "mobile")
    }
  
    // @LINE:947
    def jslog(id:GameFullId): Call = {
      
      Call("POST", "/" + "jslog/" + implicitly[PathBindable[GameFullId]].unbind("id", id))
    }
  
    // @LINE:905
    def temporarilyDisabled(path:String): Call = {
    
      (path: @unchecked) match {
      
        // @LINE:905
        case (path) if path == "" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", ""))); _rrc
          Call("GET", "/" + "run/temporarily-disabled")
      
        // @LINE:906
        case (path)  =>
          
          Call("GET", "/" + "run/temporarily-disabled/" + path)
      
      }
    
    }
  
    // @LINE:884
    def mobileLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/mobile")
    }
  
    // @LINE:953
    def robots: Call = {
      
      Call("GET", "/" + "robots.txt")
    }
  
    // @LINE:928
    def faq: Call = {
      
      Call("GET", "/" + "faq")
    }
  
    // @LINE:887
    def costs: Call = {
      
      Call("GET", "/" + "costs")
    }
  
    // @LINE:34
    def movedPermanently(to:String): Call = {
    
      (to: @unchecked) match {
      
        // @LINE:34
        case (to) if to == "/api/tv/channels" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/api/tv/channels"))); _rrc
          Call("GET", "/" + "tv/channels")
      
        // @LINE:111
        case (to) if to == "/@/Lichess/blog" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/@/Lichess/blog"))); _rrc
          Call("GET", "/" + "blog")
      
        // @LINE:116
        case (to) if to == "/@/Lichess/blog.atom" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/@/Lichess/blog.atom"))); _rrc
          Call("GET", "/" + "blog.atom")
      
        // @LINE:353
        case (to) if to == "/api/streamer/live" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/api/streamer/live"))); _rrc
          Call("GET", "/" + "streamer/live")
      
      }
    
    }
  
    // @LINE:952
    def manifest: Call = {
      
      Call("GET", "/" + "manifest.json")
    }
  
    // @LINE:888
    def instantChess: Call = {
      
      Call("GET", "/" + "InstantChess.com")
    }
  
    // @LINE:904
    def captchaCheck(id:GameId): Call = {
      
      Call("GET", "/" + "run/captcha/" + implicitly[PathBindable[GameId]].unbind("id", id))
    }
  
    // @LINE:939
    def helpPath(path:String): Call = {
      
      Call("GET", "/" + "help/" + path)
    }
  
    // @LINE:927
    def contact: Call = {
      
      Call("GET", "/" + "contact")
    }
  
    // @LINE:889
    def dailyPuzzleSlackApp: Call = {
      
      Call("GET", "/" + "daily-puzzle-slack")
    }
  
    // @LINE:883
    def redirectToSwag: Call = {
      
      Call("GET", "/" + "swag")
    }
  
    // @LINE:917
    def prometheusMetrics(key:String): Call = {
      
      Call("GET", "/" + "prometheus-metrics/" + dynamicString(key))
    }
  
    // @LINE:908
    def toggleBlindMode: Call = {
      
      Call("POST", "/" + "run/toggle-blind-mode")
    }
  
    // @LINE:949
    def devAsset(v:String, file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "public"))); _rrc
      Call("GET", "/" + "assets/_" + v + "/" + file)
    }
  
  }

  // @LINE:201
  object Storm {

  
    // @LINE:207
    def homeLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/storm")
    }
  
    // @LINE:204
    def dashboardOf(username:UserStr, page:Int = 1): Call = {
      
      Call("GET", "/" + "storm/dashboard/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:202
    def record: Call = {
      
      Call("POST", "/" + "storm")
    }
  
    // @LINE:203
    def dashboard(page:Int = 1): Call = {
      
      Call("GET", "/" + "storm/dashboard" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:205
    def apiGet: Call = {
      
      Call("GET", "/" + "api/storm")
    }
  
    // @LINE:206
    def apiDashboardOf(username:UserStr, days:Int = 30): Call = {
      
      Call("GET", "/" + "api/storm/dashboard/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + play.core.routing.queryString(List(if(days == 30) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("days", days)))))
    }
  
    // @LINE:201
    def home: Call = {
      
      Call("GET", "/" + "storm")
    }
  
  }

  // @LINE:8
  object Tv {

  
    // @LINE:39
    def games: Call = {
      
      Call("GET", "/" + "games")
    }
  
    // @LINE:35
    def onChannel(chanKey:String): Call = {
      
      Call("GET", "/" + "tv/" + dynamicString(chanKey))
    }
  
    // @LINE:38
    def sides(gameId:GameId, color:Color): Call = {
      
      Call("GET", "/" + "tv/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + "/" + dynamicString(implicitly[PathBindable[Color]].unbind("color", color)) + "/sides")
    }
  
    // @LINE:37
    def feed(chanKey:String): Call = {
    
      (chanKey: @unchecked) match {
      
        // @LINE:37
        case (chanKey)  =>
          
          Call("GET", "/" + "tv/" + dynamicString(chanKey) + "/feed")
      
      }
    
    }
  
    // @LINE:45
    def apiGamesChannel(chanKey:String): Call = {
      
      Call("GET", "/" + "api/tv/" + dynamicString(chanKey))
    }
  
    // @LINE:41
    def gameChannelReplacement(chanKey:String, gameId:GameId, exclude:List[GameId]): Call = {
      
      Call("GET", "/" + "games/" + dynamicString(chanKey) + "/replacement/" + implicitly[PathBindable[GameId]].unbind("gameId", gameId) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[List[GameId]]].unbind("exclude", exclude)))))
    }
  
    // @LINE:31
    def indexLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/tv")
    }
  
    // @LINE:36
    def frame(chanKey:String): Call = {
      
      Call("GET", "/" + "tv/" + dynamicString(chanKey) + "/frame")
    }
  
    // @LINE:32
    def frameDefault: Call = {
      
      Call("GET", "/" + "tv/frame")
    }
  
    // @LINE:40
    def gamesChannel(chanKey:String): Call = {
      
      Call("GET", "/" + "games/" + dynamicString(chanKey))
    }
  
    // @LINE:33
    def feedDefault: Call = {
    
      () match {
      
        // @LINE:33
        case ()  =>
          
          Call("GET", "/" + "tv/feed")
      
      }
    
    }
  
    // @LINE:8
    def index: Call = {
      
      Call("GET", "/" + "tv")
    }
  
    // @LINE:42
    def channels: Call = {
      
      Call("GET", "/" + "api/tv/channels")
    }
  
  }

  // @LINE:20
  object Search {

  
    // @LINE:20
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "games/search" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:849
  object OAuth {

  
    // @LINE:861
    def testTokens: Call = {
      
      Call("POST", "/" + "api/token/test")
    }
  
    // @LINE:849
    def authorize: Call = {
      
      Call("GET", "/" + "oauth")
    }
  
    // @LINE:853
    def revokeClient: Call = {
      
      Call("POST", "/" + "oauth/revoke-client")
    }
  
    // @LINE:850
    def legacyTokenApply: Call = {
      
      Call("POST", "/" + "oauth")
    }
  
    // @LINE:852
    def authorizeApply: Call = {
      
      Call("POST", "/" + "oauth/authorize")
    }
  
    // @LINE:860
    def challengeTokens: Call = {
      
      Call("POST", "/" + "api/token/admin-challenge")
    }
  
    // @LINE:854
    def tokenApply: Call = {
      
      Call("POST", "/" + "api/token")
    }
  
    // @LINE:855
    def tokenRevoke: Call = {
      
      Call("DELETE", "/" + "api/token")
    }
  
    // @LINE:851
    def legacyAuthorize: Call = {
      
      Call("GET", "/" + "oauth/authorize")
    }
  
  }

  // @LINE:686
  object Api {

  
    // @LINE:686
    def mobileHome: Call = {
      
      Call("GET", "/" + "api/mobile/home")
    }
  
    // @LINE:718
    def perfStat(user:UserStr, perfKey:PerfKey): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/perf/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:723
    def tournamentGames(id:TourId): Call = {
      
      Call("GET", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/games")
    }
  
    // @LINE:713
    def activity(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/activity")
    }
  
    // @LINE:687
    def mobileWatch: Call = {
      
      Call("GET", "/" + "api/mobile/watch")
    }
  
    // @LINE:747
    def eventStream: Call = {
      
      Call("GET", "/" + "api/stream/event")
    }
  
    // @LINE:721
    def currentTournaments: Call = {
      
      Call("GET", "/" + "api/tournament")
    }
  
    // @LINE:688
    def mobileProfile(username:UserStr): Call = {
      
      Call("GET", "/" + "api/mobile/profile/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:724
    def tournamentResults(id:TourId): Call = {
      
      Call("GET", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/results")
    }
  
    // @LINE:701
    def usersByIds: Call = {
      
      Call("POST", "/" + "api/users")
    }
  
    // @LINE:712
    def user(user:UserStr): Call = {
      
      Call("GET", "/" + "api/user/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)))
    }
  
    // @LINE:689
    def mobileGames: Call = {
      
      Call("GET", "/" + "api/mobile/my-games")
    }
  
    // @LINE:744
    def gamesByUsersStream: Call = {
      
      Call("POST", "/" + "api/stream/games-by-users")
    }
  
    // @LINE:748
    def moveStream(id:GameId): Call = {
      
      Call("GET", "/" + "api/stream/game/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)))
    }
  
    // @LINE:743
    def crosstable(u1:UserStr, u2:UserStr): Call = {
      
      Call("GET", "/" + "api/crosstable/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("u1", u1)) + "/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("u2", u2)))
    }
  
    // @LINE:742
    def usersStatus: Call = {
      
      Call("GET", "/" + "api/users/status")
    }
  
    // @LINE:725
    def tournamentTeams(id:TourId): Call = {
      
      Call("GET", "/" + "api/tournament/" + implicitly[PathBindable[TourId]].unbind("id", id) + "/teams")
    }
  
    // @LINE:720
    def game(id:GameId): Call = {
      
      Call("GET", "/" + "api/game/" + dynamicString(implicitly[PathBindable[GameId]].unbind("id", id)))
    }
  
    // @LINE:746
    def gamesByIdsStreamAddIds(streamId:String): Call = {
      
      Call("POST", "/" + "api/stream/games/" + dynamicString(streamId) + "/add")
    }
  
    // @LINE:741
    def status: Call = {
      
      Call("GET", "/" + "api/status")
    }
  
    // @LINE:766
    def cloudEval: Call = {
      
      Call("GET", "/" + "api/cloud-eval")
    }
  
    // @LINE:745
    def gamesByIdsStream(streamId:String): Call = {
      
      Call("POST", "/" + "api/stream/games/" + dynamicString(streamId))
    }
  
    // @LINE:700
    def index: Call = {
      
      Call("GET", "/" + "api")
    }
  
    // @LINE:738
    def swissGames(id:SwissId): Call = {
      
      Call("GET", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/games")
    }
  
    // @LINE:739
    def swissResults(id:SwissId): Call = {
      
      Call("GET", "/" + "api/swiss/" + implicitly[PathBindable[SwissId]].unbind("id", id) + "/results")
    }
  
  }

  // @LINE:434
  object TournamentCrud {

  
    // @LINE:434
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "tournament/manager" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:436
    def edit(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/manager/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
    // @LINE:439
    def create: Call = {
      
      Call("POST", "/" + "tournament/manager")
    }
  
    // @LINE:437
    def update(id:TourId): Call = {
      
      Call("POST", "/" + "tournament/manager/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
    // @LINE:438
    def form: Call = {
      
      Call("GET", "/" + "tournament/manager/new")
    }
  
    // @LINE:435
    def cloneT(id:TourId): Call = {
      
      Call("GET", "/" + "tournament/manager/clone/" + implicitly[PathBindable[TourId]].unbind("id", id))
    }
  
  }

  // @LINE:531
  object Notify {

  
    // @LINE:531
    def recent(page:Int = 1): Call = {
      
      Call("GET", "/" + "notify" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:532
    def clear: Call = {
      
      Call("POST", "/" + "notify/clear")
    }
  
  }

  // @LINE:99
  object Fide {

  
    // @LINE:101
    def federation(name:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "fide/federation/" + dynamicString(name) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:104
    def apiShow(id:chess.FideId): Call = {
      
      Call("GET", "/" + "api/fide/player/" + dynamicString(implicitly[PathBindable[chess.FideId]].unbind("id", id)))
    }
  
    // @LINE:103
    def follow(fideId:chess.FideId, follow:Boolean): Call = {
      
      Call("POST", "/" + "fide/" + dynamicString(implicitly[PathBindable[chess.FideId]].unbind("fideId", fideId)) + "/follow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("follow", follow)))))
    }
  
    // @LINE:102
    def show(fideId:chess.FideId, name:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "fide/" + dynamicString(implicitly[PathBindable[chess.FideId]].unbind("fideId", fideId)) + "/" + dynamicString(name) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:99
    def index(page:Int = 1, q:Option[String] = None): Call = {
      
      Call("GET", "/" + "fide" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(q == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("q", q)))))
    }
  
    // @LINE:100
    def federations(page:Int = 1): Call = {
      
      Call("GET", "/" + "fide/federation" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:105
    def apiSearch(q:String): Call = {
      
      Call("GET", "/" + "api/fide/player" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
  }

  // @LINE:768
  object BulkPairing {

  
    // @LINE:770
    def show(id:String): Call = {
      
      Call("GET", "/" + "api/bulk-pairing/" + dynamicString(id))
    }
  
    // @LINE:769
    def create: Call = {
      
      Call("POST", "/" + "api/bulk-pairing")
    }
  
    // @LINE:772
    def games(id:String): Call = {
      
      Call("GET", "/" + "api/bulk-pairing/" + dynamicString(id) + "/games")
    }
  
    // @LINE:773
    def startClocks(id:String): Call = {
      
      Call("POST", "/" + "api/bulk-pairing/" + dynamicString(id) + "/start-clocks")
    }
  
    // @LINE:768
    def list: Call = {
      
      Call("GET", "/" + "api/bulk-pairing")
    }
  
    // @LINE:771
    def delete(id:String): Call = {
      
      Call("DELETE", "/" + "api/bulk-pairing/" + dynamicString(id))
    }
  
  }

  // @LINE:909
  object Dev {

  
    // @LINE:912
    def cli: Call = {
      
      Call("GET", "/" + "dev/cli")
    }
  
    // @LINE:913
    def cliPost: Call = {
      
      Call("POST", "/" + "dev/cli")
    }
  
    // @LINE:915
    def settingsPost(id:String): Call = {
      
      Call("POST", "/" + "dev/settings/" + dynamicString(id))
    }
  
    // @LINE:909
    def command: Call = {
      
      Call("POST", "/" + "run/cli")
    }
  
    // @LINE:914
    def settings: Call = {
      
      Call("GET", "/" + "dev/settings")
    }
  
  }

  // @LINE:535
  object Video {

  
    // @LINE:535
    def index: Call = {
      
      Call("GET", "/" + "video")
    }
  
    // @LINE:536
    def tags: Call = {
      
      Call("GET", "/" + "video/tags")
    }
  
    // @LINE:537
    def author(author:String): Call = {
      
      Call("GET", "/" + "video/author/" + dynamicString(author))
    }
  
    // @LINE:538
    def show(id:String): Call = {
      
      Call("GET", "/" + "video/" + dynamicString(id))
    }
  
  }

  // @LINE:12
  object Account {

  
    // @LINE:831
    def signout(sessionId:String): Call = {
      
      Call("POST", "/" + "account/signout/" + dynamicString(sessionId))
    }
  
    // @LINE:749
    def apiMe: Call = {
      
      Call("GET", "/" + "api/account")
    }
  
    // @LINE:819
    def kidPost: Call = {
      
      Call("POST", "/" + "account/kid")
    }
  
    // @LINE:811
    def delete: Call = {
      
      Call("GET", "/" + "account/delete")
    }
  
    // @LINE:816
    def username: Call = {
      
      Call("GET", "/" + "account/username")
    }
  
    // @LINE:805
    def email: Call = {
      
      Call("GET", "/" + "account/email")
    }
  
    // @LINE:826
    def reopenLogin(token:String): Call = {
      
      Call("GET", "/" + "account/reopen/login/" + dynamicString(token))
    }
  
    // @LINE:813
    def deleteDone: Call = {
      
      Call("GET", "/" + "account/delete/done")
    }
  
    // @LINE:821
    def setupTwoFactor: Call = {
      
      Call("POST", "/" + "account/twofactor/setup")
    }
  
    // @LINE:806
    def emailApply: Call = {
      
      Call("POST", "/" + "account/email")
    }
  
    // @LINE:750
    def apiNowPlaying: Call = {
      
      Call("GET", "/" + "api/account/playing")
    }
  
    // @LINE:814
    def profile: Call = {
      
      Call("GET", "/" + "account/profile")
    }
  
    // @LINE:832
    def nowPlaying: Call = {
      
      Call("GET", "/" + "account/now-playing")
    }
  
    // @LINE:804
    def passwdApply: Call = {
      
      Call("POST", "/" + "account/passwd")
    }
  
    // @LINE:830
    def security: Call = {
      
      Call("GET", "/" + "account/security")
    }
  
    // @LINE:809
    def close: Call = {
      
      Call("GET", "/" + "account/close")
    }
  
    // @LINE:818
    def kid: Call = {
      
      Call("GET", "/" + "account/kid")
    }
  
    // @LINE:751
    def apiEmail: Call = {
      
      Call("GET", "/" + "api/account/email")
    }
  
    // @LINE:753
    def apiKidPost: Call = {
      
      Call("POST", "/" + "api/account/kid")
    }
  
    // @LINE:820
    def twoFactor: Call = {
      
      Call("GET", "/" + "account/twofactor")
    }
  
    // @LINE:807
    def emailConfirmHelp: Call = {
      
      Call("GET", "/" + "contact/email-confirm/help")
    }
  
    // @LINE:803
    def passwd: Call = {
      
      Call("GET", "/" + "account/passwd")
    }
  
    // @LINE:822
    def disableTwoFactor: Call = {
      
      Call("POST", "/" + "account/twofactor/disable")
    }
  
    // @LINE:827
    def data: Call = {
      
      Call("GET", "/" + "account/personal-data")
    }
  
    // @LINE:817
    def usernameApply: Call = {
      
      Call("POST", "/" + "account/username")
    }
  
    // @LINE:752
    def apiKid: Call = {
      
      Call("GET", "/" + "api/account/kid")
    }
  
    // @LINE:810
    def closeConfirm: Call = {
      
      Call("POST", "/" + "account/close")
    }
  
    // @LINE:825
    def reopenSent: Call = {
      
      Call("GET", "/" + "account/reopen/sent")
    }
  
    // @LINE:824
    def reopenApply: Call = {
      
      Call("POST", "/" + "account/reopen/send")
    }
  
    // @LINE:823
    def reopen: Call = {
      
      Call("GET", "/" + "account/reopen")
    }
  
    // @LINE:12
    def info: Call = {
      
      Call("GET", "/" + "account/info")
    }
  
    // @LINE:815
    def profileApply: Call = {
      
      Call("POST", "/" + "account/profile")
    }
  
    // @LINE:812
    def deleteConfirm: Call = {
      
      Call("POST", "/" + "account/delete")
    }
  
    // @LINE:808
    def emailConfirm(token:String): Call = {
      
      Call("GET", "/" + "account/email/confirm/" + dynamicString(token))
    }
  
  }

  // @LINE:312
  object Learn {

  
    // @LINE:312
    def index: Call = {
      
      Call("GET", "/" + "learn")
    }
  
    // @LINE:313
    def score: Call = {
      
      Call("POST", "/" + "learn/score")
    }
  
    // @LINE:314
    def reset: Call = {
      
      Call("POST", "/" + "learn/reset")
    }
  
    // @LINE:315
    def indexLang(lang:Language): Call = {
      
      Call("GET", "/" + implicitly[PathBindable[Language]].unbind("lang", lang) + "/learn")
    }
  
  }

}
