// @GENERATOR:play-routes-compiler
// @SOURCE:conf/team.routes

package router
package team

import play.core.routing._

import play.api.mvc._


final class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Team_0: controllers.team.Team,
) extends GeneratedRouter {

  final val prefix: String = "/"
  def withPrefix(addPrefix: String): Routes = ???



  // @LINE:1
  private val controllers_team_Team_home0_route = Route("GET",
    PathPattern(List(StaticPart("team")))
  )

  // @LINE:2
  private val controllers_team_Team_form1_route = Route("GET",
    PathPattern(List(StaticPart("team/new")))
  )

  // @LINE:3
  private val controllers_team_Team_create2_route = Route("POST",
    PathPattern(List(StaticPart("team/new")))
  )

  // @LINE:4
  private val controllers_team_Team_mine3_route = Route("GET",
    PathPattern(List(StaticPart("team/me")))
  )

  // @LINE:5
  private val controllers_team_Team_leader4_route = Route("GET",
    PathPattern(List(StaticPart("team/leader")))
  )

  // @LINE:6
  private val controllers_team_Team_all5_route = Route("GET",
    PathPattern(List(StaticPart("team/all")))
  )

  // @LINE:7
  private val controllers_team_Team_requests6_route = Route("GET",
    PathPattern(List(StaticPart("team/requests")))
  )

  // @LINE:8
  private val controllers_team_Team_search7_route = Route("GET",
    PathPattern(List(StaticPart("team/search")))
  )

  // @LINE:9
  private val controllers_team_Team_autocomplete8_route = Route("GET",
    PathPattern(List(StaticPart("team/autocomplete")))
  )

  // @LINE:10
  private val controllers_team_Team_show9_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:11
  private val controllers_team_Team_join10_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/join")))
  )

  // @LINE:12
  private val controllers_team_Team_quit11_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/quit")))
  )

  // @LINE:13
  private val controllers_team_Team_requestForm12_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/new")))
  )

  // @LINE:14
  private val controllers_team_Team_requestCreate13_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/new")))
  )

  // @LINE:15
  private val controllers_team_Team_requestProcess14_route = Route("POST",
    PathPattern(List(StaticPart("team/-/request/process/"), DynamicPart("reqId", """[^/]+""",true)))
  )

  // @LINE:16
  private val controllers_team_Team_declinedRequests15_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/declined-requests")))
  )

  // @LINE:17
  private val controllers_team_Team_edit16_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:18
  private val controllers_team_Team_update17_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:19
  private val controllers_team_Team_kickForm18_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick")))
  )

  // @LINE:20
  private val controllers_team_Team_kick19_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick")))
  )

  // @LINE:21
  private val controllers_team_Team_blocklist20_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/blocklist")))
  )

  // @LINE:22
  private val controllers_team_Team_leaders21_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/leaders")))
  )

  // @LINE:23
  private val controllers_team_Team_permissions22_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/permissions")))
  )

  // @LINE:24
  private val controllers_team_Team_addLeader23_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/leaders")))
  )

  // @LINE:25
  private val controllers_team_Team_members24_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/members")))
  )

  // @LINE:26
  private val controllers_team_Team_close25_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:27
  private val controllers_team_Team_disable26_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/disable")))
  )

  // @LINE:28
  private val controllers_team_Team_tournaments27_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tournaments")))
  )

  // @LINE:29
  private val controllers_team_Team_pmAll28_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/pm-all")))
  )

  // @LINE:30
  private val controllers_team_Team_pmAllSubmit29_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/pm-all")))
  )

  // @LINE:31
  private val controllers_team_Team_subscribe30_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/subscribe")))
  )


  val pathRouters: Map[String, PartialFunction[RequestHeader, Handler]] = Map(
    
      "team" -> {
        
          // @LINE:1
          case controllers_team_Team_home0_route(params) =>
            named("Team.home") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Team_0.home(page)
              }
            }
        
          // @LINE:2
          case controllers_team_Team_form1_route(_) =>
            named("Team.form") {
              call { 
                  Team_0.form
              }
            }
        
          // @LINE:3
          case controllers_team_Team_create2_route(_) =>
            named("Team.create") {
              call { 
                  Team_0.create
              }
            }
        
          // @LINE:4
          case controllers_team_Team_mine3_route(_) =>
            named("Team.mine") {
              call { 
                  Team_0.mine
              }
            }
        
          // @LINE:5
          case controllers_team_Team_leader4_route(_) =>
            named("Team.leader") {
              call { 
                  Team_0.leader
              }
            }
        
          // @LINE:6
          case controllers_team_Team_all5_route(params) =>
            named("Team.all") {
              call(params.fromQuery[Int]("page", Some(1))) { (page) =>
                  Team_0.all(page)
              }
            }
        
          // @LINE:7
          case controllers_team_Team_requests6_route(_) =>
            named("Team.requests") {
              call { 
                  Team_0.requests
              }
            }
        
          // @LINE:8
          case controllers_team_Team_search7_route(params) =>
            named("Team.search") {
              call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
                  Team_0.search(text, page)
              }
            }
        
          // @LINE:9
          case controllers_team_Team_autocomplete8_route(_) =>
            named("Team.autocomplete") {
              call { 
                  Team_0.autocomplete
              }
            }
        
          // @LINE:10
          case controllers_team_Team_show9_route(params) =>
            named("Team.show") {
              call(params.fromPath[TeamId]("id", None), params.fromQuery[Int]("page", Some(1)), params.fromQuery[Boolean]("mod", Some(false))) { (id, page, mod) =>
                  Team_0.show(id, page, mod)
              }
            }
        
          // @LINE:11
          case controllers_team_Team_join10_route(params) =>
            named("Team.join") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.join(id)
              }
            }
        
          // @LINE:12
          case controllers_team_Team_quit11_route(params) =>
            named("Team.quit") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.quit(id)
              }
            }
        
          // @LINE:13
          case controllers_team_Team_requestForm12_route(params) =>
            named("Team.requestForm") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.requestForm(id)
              }
            }
        
          // @LINE:14
          case controllers_team_Team_requestCreate13_route(params) =>
            named("Team.requestCreate") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.requestCreate(id)
              }
            }
        
          // @LINE:15
          case controllers_team_Team_requestProcess14_route(params) =>
            named("Team.requestProcess") {
              call(params.fromPath[String]("reqId", None)) { (reqId) =>
                  Team_0.requestProcess(reqId)
              }
            }
        
          // @LINE:16
          case controllers_team_Team_declinedRequests15_route(params) =>
            named("Team.declinedRequests") {
              call(params.fromPath[TeamId]("id", None), params.fromQuery[Int]("page", Some(1))) { (id, page) =>
                  Team_0.declinedRequests(id, page)
              }
            }
        
          // @LINE:17
          case controllers_team_Team_edit16_route(params) =>
            named("Team.edit") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.edit(id)
              }
            }
        
          // @LINE:18
          case controllers_team_Team_update17_route(params) =>
            named("Team.update") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.update(id)
              }
            }
        
          // @LINE:19
          case controllers_team_Team_kickForm18_route(params) =>
            named("Team.kickForm") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.kickForm(id)
              }
            }
        
          // @LINE:20
          case controllers_team_Team_kick19_route(params) =>
            named("Team.kick") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.kick(id)
              }
            }
        
          // @LINE:21
          case controllers_team_Team_blocklist20_route(params) =>
            named("Team.blocklist") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.blocklist(id)
              }
            }
        
          // @LINE:22
          case controllers_team_Team_leaders21_route(params) =>
            named("Team.leaders") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.leaders(id)
              }
            }
        
          // @LINE:23
          case controllers_team_Team_permissions22_route(params) =>
            named("Team.permissions") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.permissions(id)
              }
            }
        
          // @LINE:24
          case controllers_team_Team_addLeader23_route(params) =>
            named("Team.addLeader") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.addLeader(id)
              }
            }
        
          // @LINE:25
          case controllers_team_Team_members24_route(params) =>
            named("Team.members") {
              call(params.fromPath[TeamId]("id", None), params.fromQuery[Int]("page", Some(1))) { (id, page) =>
                  Team_0.members(id, page)
              }
            }
        
          // @LINE:26
          case controllers_team_Team_close25_route(params) =>
            named("Team.close") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.close(id)
              }
            }
        
          // @LINE:27
          case controllers_team_Team_disable26_route(params) =>
            named("Team.disable") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.disable(id)
              }
            }
        
          // @LINE:28
          case controllers_team_Team_tournaments27_route(params) =>
            named("Team.tournaments") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.tournaments(id)
              }
            }
        
          // @LINE:29
          case controllers_team_Team_pmAll28_route(params) =>
            named("Team.pmAll") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.pmAll(id)
              }
            }
        
          // @LINE:30
          case controllers_team_Team_pmAllSubmit29_route(params) =>
            named("Team.pmAllSubmit") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.pmAllSubmit(id)
              }
            }
        
          // @LINE:31
          case controllers_team_Team_subscribe30_route(params) =>
            named("Team.subscribe") {
              call(params.fromPath[TeamId]("id", None)) { (id) =>
                  Team_0.subscribe(id)
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
