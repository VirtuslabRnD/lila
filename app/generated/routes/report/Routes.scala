// @GENERATOR:play-routes-compiler
// @SOURCE:conf/report.routes

package router
package report

import play.core.routing._

import play.api.mvc._


final class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Report_0: controllers.report.Report,
) extends GeneratedRouter {

  final val prefix: String = "/"
  def withPrefix(addPrefix: String): Routes = ???



  // @LINE:1
  private val controllers_report_Report_form0_route = Route("GET",
    PathPattern(List(StaticPart("report")))
  )

  // @LINE:2
  private val controllers_report_Report_create1_route = Route("POST",
    PathPattern(List(StaticPart("report")))
  )

  // @LINE:3
  private val controllers_report_Report_inboxForm2_route = Route("GET",
    PathPattern(List(StaticPart("report/inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:4
  private val controllers_report_Report_inboxCreate3_route = Route("POST",
    PathPattern(List(StaticPart("report/inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:5
  private val controllers_report_Report_flag4_route = Route("POST",
    PathPattern(List(StaticPart("report/flag")))
  )

  // @LINE:6
  private val controllers_report_Report_thanks5_route = Route("GET",
    PathPattern(List(StaticPart("report/thanks")))
  )

  // @LINE:7
  private val controllers_report_Report_list6_route = Route("GET",
    PathPattern(List(StaticPart("report/list")))
  )

  // @LINE:8
  private val controllers_report_Report_listWithFilter7_route = Route("GET",
    PathPattern(List(StaticPart("report/list/"), DynamicPart("room", """[^/]+""",true)))
  )

  // @LINE:9
  private val controllers_report_Report_inquiry8_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/inquiry")))
  )

  // @LINE:10
  private val controllers_report_Report_process9_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/process")))
  )

  // @LINE:11
  private val controllers_report_Report_xfiles10_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/xfiles")))
  )

  // @LINE:12
  private val controllers_report_Report_snooze11_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/snooze/"), DynamicPart("dur", """[^/]+""",true)))
  )

  // @LINE:13
  private val controllers_report_Report_currentCheatInquiry12_route = Route("GET",
    PathPattern(List(StaticPart("report/"), DynamicPart("user", """[^/]+""",true), StaticPart("/cheat-inquiry")))
  )


  val pathRouters: Map[String, PartialFunction[RequestHeader, Handler]] = Map(
    
      "report" -> {
        
          // @LINE:1
          case controllers_report_Report_form0_route(_) =>
            named("Report.form") {
              call { 
                  Report_0.form
              }
            }
        
          // @LINE:2
          case controllers_report_Report_create1_route(_) =>
            named("Report.create") {
              call { 
                  Report_0.create
              }
            }
        
          // @LINE:3
          case controllers_report_Report_inboxForm2_route(params) =>
            named("Report.inboxForm") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Report_0.inboxForm(username)
              }
            }
        
          // @LINE:4
          case controllers_report_Report_inboxCreate3_route(params) =>
            named("Report.inboxCreate") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Report_0.inboxCreate(username)
              }
            }
        
          // @LINE:5
          case controllers_report_Report_flag4_route(_) =>
            named("Report.flag") {
              call { 
                  Report_0.flag
              }
            }
        
          // @LINE:6
          case controllers_report_Report_thanks5_route(_) =>
            named("Report.thanks") {
              call { 
                  Report_0.thanks
              }
            }
        
          // @LINE:7
          case controllers_report_Report_list6_route(_) =>
            named("Report.list") {
              call { 
                  Report_0.list
              }
            }
        
          // @LINE:8
          case controllers_report_Report_listWithFilter7_route(params) =>
            named("Report.listWithFilter") {
              call(params.fromPath[String]("room", None)) { (room) =>
                  Report_0.listWithFilter(room)
              }
            }
        
          // @LINE:9
          case controllers_report_Report_inquiry8_route(params) =>
            named("Report.inquiry") {
              call(params.fromPath[String]("id", None)) { (id) =>
                  Report_0.inquiry(id)
              }
            }
        
          // @LINE:10
          case controllers_report_Report_process9_route(params) =>
            named("Report.process") {
              call(params.fromPath[ReportId]("id", None)) { (id) =>
                  Report_0.process(id)
              }
            }
        
          // @LINE:11
          case controllers_report_Report_xfiles10_route(params) =>
            named("Report.xfiles") {
              call(params.fromPath[ReportId]("id", None)) { (id) =>
                  Report_0.xfiles(id)
              }
            }
        
          // @LINE:12
          case controllers_report_Report_snooze11_route(params) =>
            named("Report.snooze") {
              call(params.fromPath[ReportId]("id", None), params.fromPath[String]("dur", None)) { (id, dur) =>
                  Report_0.snooze(id, dur)
              }
            }
        
          // @LINE:13
          case controllers_report_Report_currentCheatInquiry12_route(params) =>
            named("Report.currentCheatInquiry") {
              call(params.fromPath[UserStr]("user", None)) { (user) =>
                  Report_0.currentCheatInquiry(user)
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
