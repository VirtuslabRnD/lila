// @GENERATOR:play-routes-compiler
// @SOURCE:conf/clas.routes

import play.api.mvc.{Call, PathBindable}
import play.core.routing.{dynamicString}



// @LINE:1
package routes {


  // @LINE:1
  object Clas {

  
    // @LINE:22
    def studentManyForm(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/many")
    }
  
    // @LINE:3
    def becomeTeacher: Call = {
      
      Call("POST", "/" + "class/become-teacher")
    }
  
    // @LINE:7
    def teacher(username:UserStr): Call = {
      
      Call("GET", "/" + "class/teacher/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:6
    def invitationAccept(id:ClasInviteId): Call = {
      
      Call("POST", "/" + "class/invitation/" + dynamicString(implicitly[PathBindable[ClasInviteId]].unbind("id", id)))
    }
  
    // @LINE:19
    def progress(id:ClasId, pk:PerfKey, days:Days): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/progress/" + dynamicString(implicitly[PathBindable[PerfKey]].unbind("pk", pk)) + "/" + dynamicString(implicitly[PathBindable[Days]].unbind("days", days)))
    }
  
    // @LINE:12
    def wallEdit(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/news/edit")
    }
  
    // @LINE:30
    def studentRelease(id:ClasId, username:UserStr): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/release")
    }
  
    // @LINE:4
    def create: Call = {
      
      Call("POST", "/" + "class/new")
    }
  
    // @LINE:21
    def studentCreate(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/new")
    }
  
    // @LINE:33
    def studentClosePost(id:ClasId, username:UserStr): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/close")
    }
  
    // @LINE:28
    def studentEdit(id:ClasId, username:UserStr): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/edit")
    }
  
    // @LINE:10
    def update(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:14
    def notifyStudents(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/notify")
    }
  
    // @LINE:35
    def studentMove(id:ClasId, username:UserStr): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/move")
    }
  
    // @LINE:9
    def edit(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/edit")
    }
  
    // @LINE:15
    def notifyPost(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/notifyPost")
    }
  
    // @LINE:36
    def studentMovePost(id:ClasId, username:UserStr, to:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/move/" + implicitly[PathBindable[ClasId]].unbind("to", to))
    }
  
    // @LINE:17
    def archive(id:ClasId, v:Boolean): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/archive" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:2
    def form: Call = {
      
      Call("GET", "/" + "class/new")
    }
  
    // @LINE:18
    def learn(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/progress/learn")
    }
  
    // @LINE:32
    def studentClose(id:ClasId, username:UserStr): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/close")
    }
  
    // @LINE:5
    def invitation(id:ClasInviteId): Call = {
      
      Call("GET", "/" + "class/invitation/" + dynamicString(implicitly[PathBindable[ClasInviteId]].unbind("id", id)))
    }
  
    // @LINE:26
    def studentArchive(id:ClasId, username:UserStr, v:Boolean): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/archive" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:23
    def studentManyCreate(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/many")
    }
  
    // @LINE:25
    def studentShow(id:ClasId, username:UserStr): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:27
    def studentResetPassword(id:ClasId, username:UserStr): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/reset-password")
    }
  
    // @LINE:16
    def students(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/students")
    }
  
    // @LINE:29
    def studentUpdate(id:ClasId, username:UserStr): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/edit")
    }
  
    // @LINE:11
    def wall(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/news")
    }
  
    // @LINE:1
    def index: Call = {
      
      Call("GET", "/" + "class")
    }
  
    // @LINE:13
    def wallUpdate(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/news/edit")
    }
  
    // @LINE:31
    def studentReleasePost(id:ClasId, username:UserStr): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/release")
    }
  
    // @LINE:34
    def invitationRevoke(id:ClasInviteId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasInviteId]].unbind("id", id) + "/invitation/revoke")
    }
  
    // @LINE:8
    def show(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id))
    }
  
    // @LINE:20
    def studentForm(id:ClasId): Call = {
      
      Call("GET", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/add")
    }
  
    // @LINE:24
    def studentInvite(id:ClasId): Call = {
      
      Call("POST", "/" + "class/" + implicitly[PathBindable[ClasId]].unbind("id", id) + "/student/invite")
    }
  
  }

}
