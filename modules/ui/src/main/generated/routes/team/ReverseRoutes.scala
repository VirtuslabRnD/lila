// @GENERATOR:play-routes-compiler
// @SOURCE:conf/team.routes

import play.api.mvc.{Call, PathBindable}
import play.core.routing.{dynamicString}



// @LINE:1
package routes {


  // @LINE:1
  object Team {

  
    // @LINE:18
    def update(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:19
    def kickForm(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/kick")
    }
  
    // @LINE:8
    def search(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "team/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:24
    def addLeader(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/leaders")
    }
  
    // @LINE:30
    def pmAllSubmit(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/pm-all")
    }
  
    // @LINE:3
    def create: Call = {
      
      Call("POST", "/" + "team/new")
    }
  
    // @LINE:23
    def permissions(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/permissions")
    }
  
    // @LINE:26
    def close(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/close")
    }
  
    // @LINE:15
    def requestProcess(reqId:String): Call = {
      
      Call("POST", "/" + "team/-/request/process/" + dynamicString(reqId))
    }
  
    // @LINE:4
    def mine: Call = {
      
      Call("GET", "/" + "team/me")
    }
  
    // @LINE:5
    def leader: Call = {
      
      Call("GET", "/" + "team/leader")
    }
  
    // @LINE:17
    def edit(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:13
    def requestForm(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/request/new")
    }
  
    // @LINE:11
    def join(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/join")
    }
  
    // @LINE:31
    def subscribe(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/subscribe")
    }
  
    // @LINE:1
    def home(page:Int = 1): Call = {
      
      Call("GET", "/" + "team" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:2
    def form: Call = {
      
      Call("GET", "/" + "team/new")
    }
  
    // @LINE:29
    def pmAll(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/pm-all")
    }
  
    // @LINE:22
    def leaders(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/leaders")
    }
  
    // @LINE:16
    def declinedRequests(id:TeamId, page:Int = 1): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/declined-requests" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:7
    def requests: Call = {
      
      Call("GET", "/" + "team/requests")
    }
  
    // @LINE:20
    def kick(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/kick")
    }
  
    // @LINE:10
    def show(id:TeamId, page:Int = 1, mod:Boolean = false): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(mod == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("mod", mod)))))
    }
  
    // @LINE:6
    def all(page:Int = 1): Call = {
      
      Call("GET", "/" + "team/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:9
    def autocomplete: Call = {
      
      Call("GET", "/" + "team/autocomplete")
    }
  
    // @LINE:14
    def requestCreate(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/request/new")
    }
  
    // @LINE:27
    def disable(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/disable")
    }
  
    // @LINE:12
    def quit(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/quit")
    }
  
    // @LINE:28
    def tournaments(id:TeamId): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/tournaments")
    }
  
    // @LINE:25
    def members(id:TeamId, page:Int = 1): Call = {
      
      Call("GET", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/members" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:21
    def blocklist(id:TeamId): Call = {
      
      Call("POST", "/" + "team/" + dynamicString(implicitly[PathBindable[TeamId]].unbind("id", id)) + "/blocklist")
    }
  
  }

}
