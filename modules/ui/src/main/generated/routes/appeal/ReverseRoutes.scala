// @GENERATOR:play-routes-compiler
// @SOURCE:conf/appeal.routes

import play.api.mvc.{Call, PathBindable}
import play.core.routing.{dynamicString}



// @LINE:1
package routes {


  // @LINE:1
  object Appeal {

  
    // @LINE:6
    def show(username:UserStr): Call = {
      
      Call("GET", "/" + "appeal/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:3
    def landing: Call = {
      
      Call("GET", "/" + "appeal/landing")
    }
  
    // @LINE:2
    def post: Call = {
      
      Call("POST", "/" + "appeal")
    }
  
    // @LINE:8
    def mute(username:UserStr): Call = {
      
      Call("POST", "/" + "appeal/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/mute")
    }
  
    // @LINE:5
    def queue(filter:Option[String] = None): Call = {
      
      Call("GET", "/" + "appeal/queue" + play.core.routing.queryString(List(if(filter == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("filter", filter)))))
    }
  
    // @LINE:10
    def sendToZulip(username:UserStr): Call = {
      
      Call("POST", "/" + "appeal/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/send-to-zulip")
    }
  
    // @LINE:9
    def snooze(username:UserStr, dur:String): Call = {
      
      Call("POST", "/" + "appeal/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)) + "/snooze/" + dynamicString(dur))
    }
  
    // @LINE:4
    def closedByTeacher: Call = {
      
      Call("GET", "/" + "appeal/closed-by-teacher")
    }
  
    // @LINE:7
    def reply(username:UserStr): Call = {
      
      Call("POST", "/" + "appeal/" + dynamicString(implicitly[PathBindable[UserStr]].unbind("username", username)))
    }
  
    // @LINE:1
    def home: Call = {
      
      Call("GET", "/" + "appeal")
    }
  
  }

}
