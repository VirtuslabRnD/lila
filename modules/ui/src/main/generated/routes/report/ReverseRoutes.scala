// @GENERATOR:play-routes-compiler
// @SOURCE:conf/report.routes

import play.api.mvc.{Call, PathBindable}
import play.core.routing.{dynamicString}



// @LINE:1
package routes {


  // @LINE:1
  object Report {

  
    // @LINE:5
    def flag: Call = {
      
      Call("POST", "/" + "report/flag")
    }
  
    // @LINE:10
    def process(id:ReportId): Call = {
      
      Call("POST", "/" + "report/" + dynamicString(implicitly[PathBindable[ReportId]].unbind("id", id)) + "/process")
    }
  
    // @LINE:2
    def create: Call = {
      
      Call("POST", "/" + "report")
    }
  
    // @LINE:8
    def listWithFilter(room:String): Call = {
      
      Call("GET", "/" + "report/list/" + dynamicString(room))
    }
  
    // @LINE:4
    def inboxCreate(username:UserStr): Call = {
      
      Call("POST", "/" + "report/inbox/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:13
    def currentCheatInquiry(user:UserStr): Call = {
      
      Call("GET", "/" + "report/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("user", user)) + "/cheat-inquiry")
    }
  
    // @LINE:1
    def form: Call = {
      
      Call("GET", "/" + "report")
    }
  
    // @LINE:11
    def xfiles(id:ReportId): Call = {
      
      Call("POST", "/" + "report/" + dynamicString(implicitly[PathBindable[ReportId]].unbind("id", id)) + "/xfiles")
    }
  
    // @LINE:3
    def inboxForm(username:UserStr): Call = {
      
      Call("GET", "/" + "report/inbox/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:9
    def inquiry(id:String): Call = {
      
      Call("POST", "/" + "report/" + dynamicString(id) + "/inquiry")
    }
  
    // @LINE:7
    def list: Call = {
      
      Call("GET", "/" + "report/list")
    }
  
    // @LINE:6
    def thanks: Call = {
      
      Call("GET", "/" + "report/thanks")
    }
  
    // @LINE:12
    def snooze(id:ReportId, dur:String): Call = {
      
      Call("POST", "/" + "report/" + dynamicString(implicitly[PathBindable[ReportId]].unbind("id", id)) + "/snooze/" + dynamicString(dur))
    }
  
  }

}
