// @GENERATOR:play-routes-compiler
// @SOURCE:conf/clas.routes

package router
package clas

import play.core.routing._

import play.api.mvc._


final class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Clas_0: controllers.clas.Clas,
) extends GeneratedRouter {

  final val prefix: String = "/"
  def withPrefix(addPrefix: String): Routes = ???



  // @LINE:1
  private val controllers_clas_Clas_index0_route = Route("GET",
    PathPattern(List(StaticPart("class")))
  )

  // @LINE:2
  private val controllers_clas_Clas_form1_route = Route("GET",
    PathPattern(List(StaticPart("class/new")))
  )

  // @LINE:3
  private val controllers_clas_Clas_becomeTeacher2_route = Route("POST",
    PathPattern(List(StaticPart("class/become-teacher")))
  )

  // @LINE:4
  private val controllers_clas_Clas_create3_route = Route("POST",
    PathPattern(List(StaticPart("class/new")))
  )

  // @LINE:5
  private val controllers_clas_Clas_invitation4_route = Route("GET",
    PathPattern(List(StaticPart("class/invitation/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:6
  private val controllers_clas_Clas_invitationAccept5_route = Route("POST",
    PathPattern(List(StaticPart("class/invitation/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:7
  private val controllers_clas_Clas_teacher6_route = Route("GET",
    PathPattern(List(StaticPart("class/teacher/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:8
  private val controllers_clas_Clas_show7_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:9
  private val controllers_clas_Clas_edit8_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:10
  private val controllers_clas_Clas_update9_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:11
  private val controllers_clas_Clas_wall10_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news")))
  )

  // @LINE:12
  private val controllers_clas_Clas_wallEdit11_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news/edit")))
  )

  // @LINE:13
  private val controllers_clas_Clas_wallUpdate12_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news/edit")))
  )

  // @LINE:14
  private val controllers_clas_Clas_notifyStudents13_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/notify")))
  )

  // @LINE:15
  private val controllers_clas_Clas_notifyPost14_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/notifyPost")))
  )

  // @LINE:16
  private val controllers_clas_Clas_students15_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/students")))
  )

  // @LINE:17
  private val controllers_clas_Clas_archive16_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/archive")))
  )

  // @LINE:18
  private val controllers_clas_Clas_learn17_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/progress/learn")))
  )

  // @LINE:19
  private val controllers_clas_Clas_progress18_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/progress/"), DynamicPart("pk", """[^/]+""",true), StaticPart("/"), DynamicPart("days", """[^/]+""",true)))
  )

  // @LINE:20
  private val controllers_clas_Clas_studentForm19_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/add")))
  )

  // @LINE:21
  private val controllers_clas_Clas_studentCreate20_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/new")))
  )

  // @LINE:22
  private val controllers_clas_Clas_studentManyForm21_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/many")))
  )

  // @LINE:23
  private val controllers_clas_Clas_studentManyCreate22_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/many")))
  )

  // @LINE:24
  private val controllers_clas_Clas_studentInvite23_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/invite")))
  )

  // @LINE:25
  private val controllers_clas_Clas_studentShow24_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:26
  private val controllers_clas_Clas_studentArchive25_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/archive")))
  )

  // @LINE:27
  private val controllers_clas_Clas_studentResetPassword26_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reset-password")))
  )

  // @LINE:28
  private val controllers_clas_Clas_studentEdit27_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:29
  private val controllers_clas_Clas_studentUpdate28_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:30
  private val controllers_clas_Clas_studentRelease29_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/release")))
  )

  // @LINE:31
  private val controllers_clas_Clas_studentReleasePost30_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/release")))
  )

  // @LINE:32
  private val controllers_clas_Clas_studentClose31_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:33
  private val controllers_clas_Clas_studentClosePost32_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:34
  private val controllers_clas_Clas_invitationRevoke33_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/invitation/revoke")))
  )

  // @LINE:35
  private val controllers_clas_Clas_studentMove34_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/move")))
  )

  // @LINE:36
  private val controllers_clas_Clas_studentMovePost35_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/move/"), DynamicPart("to", """\w{8}""",false)))
  )


  val pathRouters: Map[String, PartialFunction[RequestHeader, Handler]] = Map(
    
      "class" -> {
        
          // @LINE:1
          case controllers_clas_Clas_index0_route(_) =>
            named("Clas.index") {
              call { 
                  Clas_0.index
              }
            }
        
          // @LINE:2
          case controllers_clas_Clas_form1_route(_) =>
            named("Clas.form") {
              call { 
                  Clas_0.form
              }
            }
        
          // @LINE:3
          case controllers_clas_Clas_becomeTeacher2_route(_) =>
            named("Clas.becomeTeacher") {
              call { 
                  Clas_0.becomeTeacher
              }
            }
        
          // @LINE:4
          case controllers_clas_Clas_create3_route(_) =>
            named("Clas.create") {
              call { 
                  Clas_0.create
              }
            }
        
          // @LINE:5
          case controllers_clas_Clas_invitation4_route(params) =>
            named("Clas.invitation") {
              call(params.fromPath[ClasInviteId]("id", None)) { (id) =>
                  Clas_0.invitation(id)
              }
            }
        
          // @LINE:6
          case controllers_clas_Clas_invitationAccept5_route(params) =>
            named("Clas.invitationAccept") {
              call(params.fromPath[ClasInviteId]("id", None)) { (id) =>
                  Clas_0.invitationAccept(id)
              }
            }
        
          // @LINE:7
          case controllers_clas_Clas_teacher6_route(params) =>
            named("Clas.teacher") {
              call(params.fromPath[UserStr]("username", None)) { (username) =>
                  Clas_0.teacher(username)
              }
            }
        
          // @LINE:8
          case controllers_clas_Clas_show7_route(params) =>
            named("Clas.show") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.show(id)
              }
            }
        
          // @LINE:9
          case controllers_clas_Clas_edit8_route(params) =>
            named("Clas.edit") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.edit(id)
              }
            }
        
          // @LINE:10
          case controllers_clas_Clas_update9_route(params) =>
            named("Clas.update") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.update(id)
              }
            }
        
          // @LINE:11
          case controllers_clas_Clas_wall10_route(params) =>
            named("Clas.wall") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.wall(id)
              }
            }
        
          // @LINE:12
          case controllers_clas_Clas_wallEdit11_route(params) =>
            named("Clas.wallEdit") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.wallEdit(id)
              }
            }
        
          // @LINE:13
          case controllers_clas_Clas_wallUpdate12_route(params) =>
            named("Clas.wallUpdate") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.wallUpdate(id)
              }
            }
        
          // @LINE:14
          case controllers_clas_Clas_notifyStudents13_route(params) =>
            named("Clas.notifyStudents") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.notifyStudents(id)
              }
            }
        
          // @LINE:15
          case controllers_clas_Clas_notifyPost14_route(params) =>
            named("Clas.notifyPost") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.notifyPost(id)
              }
            }
        
          // @LINE:16
          case controllers_clas_Clas_students15_route(params) =>
            named("Clas.students") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.students(id)
              }
            }
        
          // @LINE:17
          case controllers_clas_Clas_archive16_route(params) =>
            named("Clas.archive") {
              call(params.fromPath[ClasId]("id", None), params.fromQuery[Boolean]("v", None)) { (id, v) =>
                  Clas_0.archive(id, v)
              }
            }
        
          // @LINE:18
          case controllers_clas_Clas_learn17_route(params) =>
            named("Clas.learn") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.learn(id)
              }
            }
        
          // @LINE:19
          case controllers_clas_Clas_progress18_route(params) =>
            named("Clas.progress") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[PerfKey]("pk", None), params.fromPath[Days]("days", None)) { (id, pk, days) =>
                  Clas_0.progress(id, pk, days)
              }
            }
        
          // @LINE:20
          case controllers_clas_Clas_studentForm19_route(params) =>
            named("Clas.studentForm") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.studentForm(id)
              }
            }
        
          // @LINE:21
          case controllers_clas_Clas_studentCreate20_route(params) =>
            named("Clas.studentCreate") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.studentCreate(id)
              }
            }
        
          // @LINE:22
          case controllers_clas_Clas_studentManyForm21_route(params) =>
            named("Clas.studentManyForm") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.studentManyForm(id)
              }
            }
        
          // @LINE:23
          case controllers_clas_Clas_studentManyCreate22_route(params) =>
            named("Clas.studentManyCreate") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.studentManyCreate(id)
              }
            }
        
          // @LINE:24
          case controllers_clas_Clas_studentInvite23_route(params) =>
            named("Clas.studentInvite") {
              call(params.fromPath[ClasId]("id", None)) { (id) =>
                  Clas_0.studentInvite(id)
              }
            }
        
          // @LINE:25
          case controllers_clas_Clas_studentShow24_route(params) =>
            named("Clas.studentShow") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentShow(id, username)
              }
            }
        
          // @LINE:26
          case controllers_clas_Clas_studentArchive25_route(params) =>
            named("Clas.studentArchive") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None), params.fromQuery[Boolean]("v", None)) { (id, username, v) =>
                  Clas_0.studentArchive(id, username, v)
              }
            }
        
          // @LINE:27
          case controllers_clas_Clas_studentResetPassword26_route(params) =>
            named("Clas.studentResetPassword") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentResetPassword(id, username)
              }
            }
        
          // @LINE:28
          case controllers_clas_Clas_studentEdit27_route(params) =>
            named("Clas.studentEdit") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentEdit(id, username)
              }
            }
        
          // @LINE:29
          case controllers_clas_Clas_studentUpdate28_route(params) =>
            named("Clas.studentUpdate") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentUpdate(id, username)
              }
            }
        
          // @LINE:30
          case controllers_clas_Clas_studentRelease29_route(params) =>
            named("Clas.studentRelease") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentRelease(id, username)
              }
            }
        
          // @LINE:31
          case controllers_clas_Clas_studentReleasePost30_route(params) =>
            named("Clas.studentReleasePost") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentReleasePost(id, username)
              }
            }
        
          // @LINE:32
          case controllers_clas_Clas_studentClose31_route(params) =>
            named("Clas.studentClose") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentClose(id, username)
              }
            }
        
          // @LINE:33
          case controllers_clas_Clas_studentClosePost32_route(params) =>
            named("Clas.studentClosePost") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentClosePost(id, username)
              }
            }
        
          // @LINE:34
          case controllers_clas_Clas_invitationRevoke33_route(params) =>
            named("Clas.invitationRevoke") {
              call(params.fromPath[ClasInviteId]("id", None)) { (id) =>
                  Clas_0.invitationRevoke(id)
              }
            }
        
          // @LINE:35
          case controllers_clas_Clas_studentMove34_route(params) =>
            named("Clas.studentMove") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None)) { (id, username) =>
                  Clas_0.studentMove(id, username)
              }
            }
        
          // @LINE:36
          case controllers_clas_Clas_studentMovePost35_route(params) =>
            named("Clas.studentMovePost") {
              call(params.fromPath[ClasId]("id", None), params.fromPath[UserStr]("username", None), params.fromPath[ClasId]("to", None)) { (id, username, to) =>
                  Clas_0.studentMovePost(id, username, to)
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
