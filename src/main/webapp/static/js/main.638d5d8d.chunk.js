(this["webpackJsonpwbdv-su1-project-client-react"]=this["webpackJsonpwbdv-su1-project-client-react"]||[]).push([[0],{20:function(e,a,t){e.exports=t(33)},25:function(e,a,t){},26:function(e,a,t){e.exports=t.p+"static/media/logo.5d5d9eef.svg"},27:function(e,a,t){},33:function(e,a,t){"use strict";t.r(a);var n=t(0),r=t.n(n),l=t(18),c=t.n(l),s=(t(25),t(26),t(27),t(1)),o=t(2),i=t(4),m=t(3),u=t(5),d=t(6),p=function(){return fetch("http://localhost:8080/api/profile/seller",{method:"POST",credentials:"include"}).then((function(e){return e.json()}))},v=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={currentUser:{username:""}},e}return Object(o.a)(t,[{key:"componentDidMount",value:function(){var e=this;p().catch((function(e){})).then((function(a){a&&e.setState({currentUser:a})}))}},{key:"render",value:function(){return r.a.createElement("div",null,r.a.createElement("div",{className:"container-fluid"},r.a.createElement("nav",{className:"navbar fixed-top navbar-dark bg-dark"},r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeLogin",to:"/login"},"Login")),r.a.createElement("li",{className:"loginDivider"},"/"),r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeRegister",to:"/register"},"Register"))),r.a.createElement("div",{className:"navbar-brand mx-auto"},r.a.createElement("h3",null,"Student MarketPlace")),r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeSearch",to:"/search"},"Search"))))),r.a.createElement("div",null,r.a.createElement("nav",{className:"navbar navbar-dark bg-secondary homePageNav"},r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement("h3",{className:"homeCategory"},"Categories")),r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeLink",to:"/listings/product"},"Products")),r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeLink",to:"/listings/book"},"Books")),r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link homeLink",to:"/listings/service"},"Services")),r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link",to:"/listings/housing"},"Housing"))))))}}]),t}(r.a.Component),h=function(e){return fetch("https://amazon-price1.p.rapidapi.com/search?keywords="+e+"&marketplace=US",{method:"GET",headers:{"x-rapidapi-host":"amazon-price1.p.rapidapi.com","x-rapidapi-key":"7928a2dcbfmsh5d89e8852c7289fp10f848jsnf45f27536d87"}}).then((function(e){return e.json()}))},E=function(e){return fetch("https://amazon-price1.p.rapidapi.com/search?keywords="+e+"&marketplace=US",{method:"GET",headers:{"x-rapidapi-host":"amazon-price1.p.rapidapi.com","x-rapidapi-key":"7928a2dcbfmsh5d89e8852c7289fp10f848jsnf45f27536d87"}}).then((function(e){return e.json()}))},b=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={product:e.props.product},e}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("tr",{className:"detailsRow"},r.a.createElement("td",null,r.a.createElement("img",{className:"card-img-top",src:this.state.product.imageUrl})),r.a.createElement("td",null,this.state.product.title),r.a.createElement("td",null,this.state.product.price),r.a.createElement("td",null,this.state.product.rating),r.a.createElement("td",null,this.state.product.totalReviews),r.a.createElement("td",null,r.a.createElement("a",{href:"".concat(this.state.product.detailPageURL)},"Link")))}}]),t}(r.a.Component),f=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={product:e.props.product},e}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"card"},r.a.createElement("img",{className:"card-img-top",src:this.state.product.imageUrl}),r.a.createElement("div",{className:"card-body"},r.a.createElement("div",null,this.state.product.title),r.a.createElement("div",null,this.state.product.price),r.a.createElement(u.b,{to:"/details/".concat(this.state.product.ASIN)},r.a.createElement("button",{className:"btn btn-primary btn-sm"},"More Details"))))}}]),t}(r.a.Component),g=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){return Object(s.a)(this,t),a.apply(this,arguments)}return Object(o.a)(t,[{key:"render",value:function(){var e=this;return r.a.createElement("div",null,r.a.createElement("table",{className:"table detailsTable"},r.a.createElement("thead",{className:"detailsTableHeader"},r.a.createElement("tr",null,r.a.createElement("td",null,"Image"),r.a.createElement("td",null,"Title"),r.a.createElement("td",null,"Price"),r.a.createElement("td",null,"Rating"),r.a.createElement("td",null,"Total Reviews"),r.a.createElement("td",null,"Link To Product"))),r.a.createElement("tbody",null,this.props.product.map((function(a){return r.a.createElement(b,{product:a,key:e.props.product.ASIN})})))))}}]),t}(r.a.Component),y=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={product:[],productId:e.props.match.params.productId},e}return Object(o.a)(t,[{key:"componentDidMount",value:function(){var e=this;E(this.state.productId).then((function(a){return e.setState({product:a})}))}},{key:"render",value:function(){return r.a.createElement("div",null,r.a.createElement("nav",{className:"navbar fixed-top navbar-dark bg-dark"},r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link detailsPageSearchLink",to:"/search"},"Back To Search")),r.a.createElement("li",null,r.a.createElement("h3",{className:"navbar-brand mr-auto searchPageHeader"},"Details Page"))))),r.a.createElement("div",null,r.a.createElement(g,{product:this.state.product})))}}]),t}(r.a.Component),k=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){return Object(s.a)(this,t),a.apply(this,arguments)}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"container"},r.a.createElement("table",{className:"table searchResultTable"},r.a.createElement("thead",{className:"searchResultHeader"},r.a.createElement("tr",null,r.a.createElement("td",null,'Search Results For "',this.props.keyword,'"')))),r.a.createElement("div",{className:"row"},this.props.products.map((function(e){return r.a.createElement("div",{key:e.ASIN,className:"col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xl-2"},r.a.createElement(f,{product:e}))}))))}}]),t}(r.a.Component),N=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={keyword:"",products:[]},e.updateKeyWord=function(a){return e.setState((function(e){return{keyword:a}}))},e.searchProducts=function(a){h(a).then((function(a){return e.setState({products:a})}))},e}return Object(o.a)(t,[{key:"render",value:function(){var e=this;return r.a.createElement("div",null,r.a.createElement("div",{styles:{display:"inline-block"}},r.a.createElement("nav",{className:"navbar  fixed-top navbar-dark bg-dark"},r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link searchPageHomeLink",to:"/"},"Back To Home")),r.a.createElement("li",null,r.a.createElement("h3",{className:"navbar-brand mr-auto searchPageHeader"},"Search Page")))),r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",{className:"newCourseInput"},r.a.createElement("div",{className:"input-group"},r.a.createElement("input",{className:"form-control",placeholder:"Keyword",onChange:function(a){return e.updateKeyWord(a.target.value)},value:this.state.keyword}),r.a.createElement("div",{className:"input-group-append"},r.a.createElement("button",{onClick:function(){return e.searchProducts(e.state.keyword)},className:"btn btn-success"},"Search")))))))),r.a.createElement("div",null,r.a.createElement(k,{products:this.state.products,keyword:this.state.keyword})))}}]),t}(r.a.Component),w=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){return Object(s.a)(this,t),a.apply(this,arguments)}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("div",null,r.a.createElement(N,null))}}]),t}(r.a.Component),j=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={listings:e.props.listings},e}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"card"},r.a.createElement("div",{className:"card-body"},"Hi"))}}]),t}(r.a.Component),O=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){return Object(s.a)(this,t),a.apply(this,arguments)}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"container"},r.a.createElement("table",{className:"table searchResultTable"},r.a.createElement("thead",{className:"searchResultHeader"},r.a.createElement("tr",null,r.a.createElement("td",null,this.props.category," listings")))),r.a.createElement("div",{className:"row"},r.a.createElement(j,null)))}}]),t}(r.a.Component),P=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={listings:[],category:e.props.match.params.category},e}return Object(o.a)(t,[{key:"render",value:function(){var e=this;return r.a.createElement("div",null,r.a.createElement("div",{styles:{display:"inline-block"}},r.a.createElement("nav",{className:"navbar  fixed-top navbar-dark bg-dark"},r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link searchPageHomeLink",to:"/"},"Back To Home")),r.a.createElement("li",null,r.a.createElement("h3",{className:"navbar-brand mr-auto searchPageHeader"},"Listings Page")))),r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",{className:"newCourseInput"},r.a.createElement("div",{className:"input-group"},r.a.createElement("input",{className:"form-control",placeholder:"Keyword",onChange:function(a){return e.updateKeyWord(a.target.value)},value:this.state.keyword}),r.a.createElement("div",{className:"input-group-append"},r.a.createElement("button",{onClick:function(){return e.searchProducts(e.state.keyword)},className:"btn btn-success"},"Search")))))))),r.a.createElement("div",null,r.a.createElement(O,{category:this.state.category})))}}]),t}(r.a.Component),x=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={username:"",password:""},e.updateUsername=function(a){return e.setState((function(e){return{keyword:a}}))},e.updatePassword=function(a){return e.setState((function(e){return{keyword:a}}))},e.login=function(){fetch("http://localhost:8080/api/login",{body:JSON.stringify({username:e.state.username,password:e.state.password}),headers:{"content-type":"application/json"},method:"POST",credentials:"include"}).then((function(e){return e.json()})).catch((function(a){e.props.history.push("/login")})).then((function(a){a&&e.props.history.push("/profile")}))},e}return Object(o.a)(t,[{key:"render",value:function(){var e=this;return r.a.createElement("div",{className:"container-fluid"},r.a.createElement("div",{styles:{display:"inline-block"}},r.a.createElement("nav",{className:"navbar  fixed-top navbar-dark bg-dark"},r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link searchPageHomeLink",to:"/"},"Back To Home")),r.a.createElement("li",null,r.a.createElement("h3",{className:"navbar-brand mr-auto searchPageHeader"},"Login Page")))))),r.a.createElement("div",{className:"input-group loginPage"},r.a.createElement("label",{htmlFor:"username",className:"col-sm-2 col-form-label"},"Username "),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("input",{className:"form-control",placeholder:"Username",onChange:function(a){return e.updateUsername(a.target.value)},value:this.state.keyword})),r.a.createElement("label",{htmlFor:"password",className:"col-sm-2 col-form-label"},"Password "),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("input",{className:"form-control",placeholder:"Password",onChange:function(a){return e.updatePassword(a.target.value)},value:this.state.keyword})),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("button",{onClick:function(){return e.login()},className:"btn btn-primary"},"Login"))))}}]),t}(r.a.Component),C=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){var e;Object(s.a)(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return(e=a.call.apply(a,[this].concat(r))).state={username:"",password:""},e.updateUsername=function(a){return e.setState((function(e){return{keyword:a}}))},e.updatePassword=function(a){return e.setState((function(e){return{keyword:a}}))},e}return Object(o.a)(t,[{key:"render",value:function(){var e=this;return r.a.createElement("div",{className:"container-fluid"},r.a.createElement("div",{styles:{display:"inline-block"}},r.a.createElement("nav",{className:"navbar  fixed-top navbar-dark bg-dark"},r.a.createElement("div",null,r.a.createElement("ul",{className:"nav navbar-nav",style:{flexDirection:"row"}},r.a.createElement("li",null,r.a.createElement(u.b,{className:"nav-link searchPageHomeLink",to:"/"},"Back To Home")),r.a.createElement("li",null,r.a.createElement("h3",{className:"navbar-brand mr-auto searchPageHeader"},"Register Page")))))),r.a.createElement("div",{className:"input-group loginPage"},r.a.createElement("label",{htmlFor:"username",className:"col-sm-2 col-form-label"},"Username "),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("input",{className:"form-control",placeholder:"Username",onChange:function(a){return e.updateUsername(a.target.value)},value:this.state.keyword})),r.a.createElement("label",{htmlFor:"password",className:"col-sm-2 col-form-label"},"Password "),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("input",{className:"form-control",placeholder:"Password",onChange:function(a){return e.updatePassword(a.target.value)},value:this.state.keyword})),r.a.createElement("label",{htmlFor:"phone",className:"col-sm-2 col-form-label"},"Phone "),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("input",{className:"form-control",placeholder:"Phone",onChange:function(a){return e.updatePassword(a.target.value)},value:this.state.keyword})),r.a.createElement("div",{className:"col-sm-10"},r.a.createElement("button",{onClick:function(){return e.searchProducts(e.state.keyword)},className:"btn btn-primary"},"Register"))))}}]),t}(r.a.Component),S=function(e){Object(i.a)(t,e);var a=Object(m.a)(t);function t(){return Object(s.a)(this,t),a.apply(this,arguments)}return Object(o.a)(t,[{key:"render",value:function(){return r.a.createElement(u.a,null,r.a.createElement("div",null,r.a.createElement(d.a,{path:"/login",exact:!0,component:x}),r.a.createElement(d.a,{path:"/register",exact:!0,component:C}),r.a.createElement(d.a,{path:"/listings",exact:!0,component:P}),r.a.createElement(d.a,{path:"/listings/:category",exact:!0,component:P}),r.a.createElement(d.a,{path:"/",exact:!0,component:v}),r.a.createElement(d.a,{path:"/search",exact:!0,component:w}),r.a.createElement(d.a,{path:"/search/:keyword",exact:!0,component:w}),r.a.createElement(d.a,{exact:!0,path:"/details",component:y}),r.a.createElement(d.a,{path:"/details/:productId",component:y})))}}]),t}(r.a.Component);var H=function(){return r.a.createElement("div",{className:"App"},r.a.createElement(S,null))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));c.a.render(r.a.createElement(r.a.StrictMode,null,r.a.createElement(H,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[20,1,2]]]);
//# sourceMappingURL=main.638d5d8d.chunk.js.map