(this["webpackJsonpswitch-response-code-app"]=this["webpackJsonpswitch-response-code-app"]||[]).push([[0],{181:function(e,t,n){},182:function(e,t,n){},414:function(e,t,n){"use strict";n.r(t);var i=n(3),s=n(175),a=n.n(s);n(181),Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));var o=n(53),c=(n(182),n(14)),l=n(91),r=n(92),d=n(46),j=n(95),h=n(94),u=n(93),p=n.n(u),b=n.p+"static/media/loading.6197f8ed.gif",E=n(1),x=function(e){Object(j.a)(n,e);var t=Object(h.a)(n);function n(e){var i;return Object(l.a)(this,n),(i=t.call(this,e)).authenticate=function(){var e={responseCode:i.state.fields.responseCode,dE:i.state.fields.dE};console.log(e),p.a.request({method:"POST",data:e,url:"https://iso-data.herokuapp.com/api/getResponseMsg"}).then((function(e){i.setState({navigate:!0,loading:!0}),alert("Backend Processing Successful."),200===e.status&&(i.setState({navigate:!0,loading:!1}),i.setState({listdata:e.data.response,backendStatus:e.data.status}),console.log("Data---",e.data.response))})).catch((function(e){console.log(e),alert("Error Occurred. ",e)}))},i.state={navigate:!1,fields:{},errors:{},listdata:[],backendStatus:"",loading:!1},i.handleChange=i.handleChange.bind(Object(d.a)(i)),i.submitForm=i.submitForm.bind(Object(d.a)(i)),i}return Object(r.a)(n,[{key:"handleChange",value:function(e){var t=this.state.fields;t[e.target.name]=e.target.value,this.setState({fields:t})}},{key:"submitForm",value:function(e){if(e.preventDefault(),this.validateForm()){var t=this.state.fields;t.responseCode||(t.responseCode=""),t.dE||(t.dE=""),this.setState({fields:t}),this.authenticate()}}},{key:"validateForm",value:function(){var e=this.state.fields,t=!0;return e.responseCode||(t=!1,alert("Kindly Enter Response Code!")),e.dE||(t=!1,alert("Kindly Choose DE!"),this.state.fields.dE="DE-39"),this.setState({errors:{}}),t}},{key:"render",value:function(){this.state.navigate;var e=this.state.listdata.map((function(e){return Object(E.jsx)("li",{children:e})}));return Object(E.jsxs)("div",{style:{width:"500px",margin:"40px auto",padding:"50px auto",background:"linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)",minHeight:"200px",boxSizing:"border-box"},children:[Object(E.jsx)("div",{style:{padding:"10px 20px",textAlign:"center",color:"white",fontSize:"22px"},children:"Response Code Viewer"}),Object(E.jsxs)("div",{children:[Object(E.jsx)("div",{style:{fontSize:"12px",marginLeft:"350px"},children:Object(E.jsx)(o.b,{to:"/messageBreaker",children:"Go to Message Breaker"})}),Object(E.jsx)("div",{children:Object(E.jsxs)("div",{children:[Object(E.jsx)("label",{htmlFor:"responseCode",children:"Choose DataElements: \xa0"}),Object(E.jsxs)("select",{id:"dE",name:"dE",onChange:this.handleChange,children:[Object(E.jsx)("option",{value:"--",children:"-Data Element-"}),Object(E.jsx)("option",{value:"DE-4",children:"DE-4"}),Object(E.jsx)("option",{value:"DE-5",children:"DE-5"}),Object(E.jsx)("option",{value:"DE-6",children:"DE-6"}),Object(E.jsx)("option",{value:"DE-7",children:"DE-7"}),Object(E.jsx)("option",{value:"DE-8",children:"DE-8"}),Object(E.jsx)("option",{value:"DE-9",children:"DE-9"}),Object(E.jsx)("option",{value:"DE-10",children:"DE-10"}),Object(E.jsx)("option",{value:"DE-11",children:"DE-11"}),Object(E.jsx)("option",{value:"DE-12",children:"DE-12"}),Object(E.jsx)("option",{value:"DE-13",children:"DE-13"}),Object(E.jsx)("option",{value:"DE-14",children:"DE-14"}),Object(E.jsx)("option",{value:"DE-15",children:"DE-15"}),Object(E.jsx)("option",{value:"DE-16",children:"DE-16"}),Object(E.jsx)("option",{value:"DE-18",children:"DE-18"}),Object(E.jsx)("option",{value:"DE-19",children:"DE-19"}),Object(E.jsx)("option",{value:"DE-22",children:"DE-22"}),Object(E.jsx)("option",{value:"DE-23",children:"DE-23"}),Object(E.jsx)("option",{value:"DE-25",children:"DE-25"}),Object(E.jsx)("option",{value:"DE-28",children:"DE-28"}),Object(E.jsx)("option",{value:"DE-32",children:"DE-32"}),Object(E.jsx)("option",{value:"DE-33",children:"DE-33"}),Object(E.jsx)("option",{value:"DE-35",children:"DE-35"}),Object(E.jsx)("option",{value:"DE-39",children:"DE-37"}),Object(E.jsx)("option",{value:"DE-39",children:"DE-38"}),Object(E.jsx)("option",{value:"DE-39",children:"DE-39"}),Object(E.jsx)("option",{value:"DE-40",children:"DE-40"}),Object(E.jsx)("option",{value:"DE-41",children:"DE-41"}),Object(E.jsx)("option",{value:"DE-42",children:"DE-42"}),Object(E.jsx)("option",{value:"DE-43",children:"DE-43"}),Object(E.jsx)("option",{value:"DE-44",children:"DE-44"}),Object(E.jsx)("option",{value:"DE-45",children:"DE-45"}),Object(E.jsx)("option",{value:"DE-48",children:"DE-48"}),Object(E.jsx)("option",{value:"DE-49",children:"DE-49"}),Object(E.jsx)("option",{value:"DE-50",children:"DE-50"}),Object(E.jsx)("option",{value:"DE-51",children:"DE-51"}),Object(E.jsx)("option",{value:"DE-52",children:"DE-52"}),Object(E.jsx)("option",{value:"DE-55",children:"DE-55"}),Object(E.jsx)("option",{value:"DE-60",children:"DE-60"}),Object(E.jsx)("option",{value:"DE-61",children:"DE-61"}),Object(E.jsx)("option",{value:"DE-62",children:"DE-62"}),Object(E.jsx)("option",{value:"DE-63",children:"DE-63"}),Object(E.jsx)("option",{value:"DE-70",children:"DE-70"}),Object(E.jsx)("option",{value:"DE-90",children:"DE-90"}),Object(E.jsx)("option",{value:"DE-91",children:"DE-91"}),Object(E.jsx)("option",{value:"DE-95",children:"DE-95"}),Object(E.jsx)("option",{value:"DE-101",children:"DE-101"}),Object(E.jsx)("option",{value:"DE-102",children:"DE-102"}),Object(E.jsx)("option",{value:"DE-103",children:"DE-103"}),Object(E.jsx)("option",{value:"DE-104",children:"DE-104"}),Object(E.jsx)("option",{value:"DE-111",children:"DE-111"}),Object(E.jsx)("option",{value:"DE-119",children:"DE-119"}),Object(E.jsx)("option",{value:"DE-120",children:"DE-120"}),Object(E.jsx)("option",{value:"DE-121",children:"DE-121"}),Object(E.jsx)("option",{value:"DE-122",children:"DE-122"}),Object(E.jsx)("option",{value:"DE-123",children:"DE-123"}),Object(E.jsx)("option",{value:"DE-124",children:"DE-124"}),Object(E.jsx)("option",{value:"DE-125",children:"DE-125"}),Object(E.jsx)("option",{value:"DE-126",children:"DE-126"}),Object(E.jsx)("option",{value:"DE-127",children:"DE-127"})]}),"\xa0",Object(E.jsx)("input",{id:"responseCode",name:"responseCode",type:"text",onKeyUp:this.handleChange,required:!0})]})})]}),Object(E.jsxs)("div",{children:[Object(E.jsx)("div",{children:Object(E.jsx)("div",{children:Object(E.jsx)("button",{role:"button",style:{background:"linear-gradient(45deg, #FE6B6B 30%, #FF8E46 90%)",margin:"10px 0 0px 200px",borderRadius:"15px"},onClick:this.submitForm,children:"Submit"})})}),Object(E.jsxs)("div",{style:{color:"white",fontSize:"13px"},children:[this.state.loading&&Object(E.jsx)("img",{src:b}),Object(E.jsx)("ul",{children:e})]})]})]})}}]),n}(i.Component),D=function(e){Object(j.a)(n,e);var t=Object(h.a)(n);function n(e){var i;return Object(l.a)(this,n),(i=t.call(this,e)).authenticate=function(){var e={responseCode:i.state.fields.responseCode};console.log(e),p.a.request({method:"POST",data:e,url:"https://iso-data.herokuapp.com/api/getMessage"}).then((function(e){i.setState({navigate:!0,loading:!0}),console.log("check"+e.status),console.log("check"+e.responseCode),alert("Backend Processing Successful."),200===e.status&&(i.setState({navigate:!0,loading:!1}),i.setState({listdata:e.data.response,backendStatus:e.data.status}),console.log("Data---",e.data.response))})).catch((function(e){console.log(e),alert("Error Occurred. ",e)}))},i.state={navigate:!1,fields:{},errors:{},listdata:[],backendStatus:"",loading:!1},i.handleChange=i.handleChange.bind(Object(d.a)(i)),i.submitForm=i.submitForm.bind(Object(d.a)(i)),i}return Object(r.a)(n,[{key:"handleChange",value:function(e){var t=this.state.fields;t[e.target.name]=e.target.value,this.setState({fields:t})}},{key:"submitForm",value:function(e){if(e.preventDefault(),this.validateForm()){var t=this.state.fields;t.responseCode||(t.responseCode=""),t.dE||(t.dE=""),this.setState({fields:t}),this.authenticate()}}},{key:"validateForm",value:function(){var e=!0;return this.state.fields.responseCode||(e=!1,alert("Kindly Enter Response Code!")),this.setState({errors:{}}),e}},{key:"render",value:function(){this.state.navigate;var e=this.state.listdata.map((function(e){return Object(E.jsx)("li",{children:e})}));return Object(E.jsxs)("div",{style:{width:"500px",margin:"40px auto",padding:"50px auto",background:"linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)",minHeight:"200px",boxSizing:"border-box"},children:[Object(E.jsx)("div",{style:{padding:"10px 20px",textAlign:"center",color:"white",fontSize:"22px"},children:"Response Code Viewer"}),Object(E.jsx)("div",{children:Object(E.jsx)("div",{children:Object(E.jsxs)("div",{children:[Object(E.jsx)("div",{style:{fontSize:"12px",marginLeft:"350px"},children:Object(E.jsx)(o.b,{to:"/",children:"Go Back"})}),Object(E.jsx)("label",{htmlFor:"responseCode",children:"Enter Data: \xa0"}),"\xa0",Object(E.jsx)("input",{id:"responseCode",name:"responseCode",type:"text",onKeyUp:this.handleChange,required:!0})]})})}),Object(E.jsxs)("div",{children:[Object(E.jsx)("div",{children:Object(E.jsx)("div",{children:Object(E.jsx)("button",{role:"button",style:{background:"linear-gradient(45deg, #FE6B6B 30%, #FF8E46 90%)",margin:"10px 0 0px 200px",borderRadius:"15px"},onClick:this.submitForm,children:"Submit"})})}),Object(E.jsxs)("div",{style:{color:"white",fontSize:"13px"},children:[this.state.loading&&Object(E.jsx)("img",{src:b}),Object(E.jsx)("ul",{children:e})]})]})]})}}]),n}(i.Component);function v(){return Object(E.jsx)("main",{children:Object(E.jsxs)(c.c,{children:[Object(E.jsx)(c.a,{exact:!0,path:"/",component:x}),Object(E.jsx)(c.a,{exact:!0,path:"/messageBreaker",component:D})]})})}n(206);var O=function(){return Object(E.jsx)("div",{className:"app",children:Object(E.jsx)(v,{})})};a.a.render(Object(E.jsx)(o.a,{children:Object(E.jsx)(O,{})}),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[414,1,2]]]);
//# sourceMappingURL=main.8f37dd1d.chunk.js.map