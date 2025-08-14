// @GENERATOR:play-routes-compiler
// @SOURCE:conf/appeal.routes

package router
package appeal

import play.core.routing._

import play.api.mvc._


final class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Appeal_0: controllers.appeal.Appeal,
) extends GeneratedRouter {

  final val prefix: String = "/"
  def withPrefix(addPrefix: String): Routes = ???



  // @LINE:1
  private val controllers_appeal_Appeal_home0_route = Route("GET",
    PathPattern(List(StaticPart("appeal")))
  )

  // @LINE:2
  private val controllers_appeal_Appeal_post1_route = Route("POST",
    PathPattern(List(StaticPart("appeal")))
  )

  // @LINE:3
  private val controllers_appeal_Appeal_landing2_route = Route("GET",
    PathPattern(List(StaticPart("appeal/landing")))
  )

  // @LINE:4
  private val controllers_appeal_Appeal_closedByTeacher3_route = Route("GET",
    PathPattern(List(StaticPart("appeal/closed-by-teacher")))
  )

  // @LINE:5
  private val controllers_appeal_Appeal_queue4_route = Route("GET",
    PathPattern(List(StaticPart("appeal/queue")))
  )

  // @LINE:6
  private val controllers_appeal_Appeal_show5_route = Route("GET",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:7
  private val controllers_appeal_Appeal_reply6_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:8
  private val controllers_appeal_Appeal_mute7_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mute")))
  )

  // @LINE:9
  private val controllers_appeal_Appeal_snooze8_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true), StaticPart("/snooze/"), DynamicPart("dur", """[^/]+""",true)))
  )

  // @LINE:10
  private val controllers_appeal_Appeal_sendToZulip9_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true), StaticPart("/send-to-zulip")))
  )


  val pathRouters: Map[String, PartialFunction[RequestHeader, Handler]] = Map(
    
      "appeal" -> {
        
          // @LINE:1
          case controllers_appeal_Appeal_home0_route(_) =>
            named("Appeal.home") {
              call { 
                  Appeal_0.home
              }
            }
        
          // @LINE:2
          case controllers_appeal_Appeal_post1_route(_) =>
            named("Appeal.post") {
              call { 
                  Appeal_0.post
              }
            }
        
          // @LINE:3
          case controllers_appeal_Appeal_landing2_route(_) =>
            named("Appeal.landing") {
              call { 
                  Appeal_0.landing
              }
            }
        
          // @LINE:4
          case controllers_appeal_Appeal_closedByTeacher3_route(_) =>
            named("Appeal.closedByTeacher") {
              call { 
                  Appeal_0.closedByTeacher
              }
            }
        
          // @LINE:5
          case controllers_appeal_Appeal_queue4_route(params) =>
            named("Appeal.queue") {
              call(params.fromQuery[Option[String]]("filter", Some(None))) { (filter) =>
                  Appeal_0.queue(filter)
              }
            }
        
          // @LINE:6
          case controllers_appeal_Appeal_show5_route(params) =>
            named("Appeal.show") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Appeal_0.show(username)
              }
            }
        
          // @LINE:7
          case controllers_appeal_Appeal_reply6_route(params) =>
            named("Appeal.reply") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Appeal_0.reply(username)
              }
            }
        
          // @LINE:8
          case controllers_appeal_Appeal_mute7_route(params) =>
            named("Appeal.mute") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Appeal_0.mute(username)
              }
            }
        
          // @LINE:9
          case controllers_appeal_Appeal_snooze8_route(params) =>
            named("Appeal.snooze") {
              call(params.fromPath[UserStr]("username", None), params.fromPath[String]("dur", None)) { (username, dur) =>
                  Appeal_0.snooze(username, dur)
              }
            }
        
          // @LINE:10
          case controllers_appeal_Appeal_sendToZulip9_route(params) =>
            named("Appeal.sendToZulip") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Appeal_0.sendToZulip(username)
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
