(this["webpackJsonpswitch-response-code-app"]=this["webpackJsonpswitch-response-code-app"]||[]).push([[0],{181:function(e,t,n){},182:function(e,t,n){},414:function(e,t,n){"use strict";n.r(t);var i=n(3),o=n(170),c=n.n(o);n(181),Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));var s=n(90),a=(n(182),n(14)),l=n(171),r=n(172),j=n(72),d=n(176),h=n(175),E=n(173),D=n.n(E),u=n.p+"static/media/loading.6197f8ed.gif",b=n(1),p=function(e){Object(d.a)(n,e);var t=Object(h.a)(n);function n(e){var i;return Object(l.a)(this,n),(i=t.call(this,e)).authenticate=function(){var e={responseCode:i.state.fields.responseCode,dE:i.state.fields.dE};console.log(e),D.a.request({method:"POST",data:e,url:"https://iso-data.herokuapp.com/api/getResponseMsg"}).then((function(e){i.setState({navigate:!0,loading:!0}),alert("Backend Processing Successful."),200===e.status&&(i.setState({navigate:!0,loading:!1}),i.setState({listdata:e.data.response,backendStatus:e.data.status}),console.log("Data---",e.data.response))})).catch((function(e){console.log(e),alert("Error Occurred. ",e)}))},i.state={navigate:!1,fields:{},errors:{},listdata:[],backendStatus:"",loading:!1},i.handleChange=i.handleChange.bind(Object(j.a)(i)),i.submitForm=i.submitForm.bind(Object(j.a)(i)),i}return Object(r.a)(n,[{key:"handleChange",value:function(e){var t=this.state.fields;t[e.target.name]=e.target.value,this.setState({fields:t})}},{key:"submitForm",value:function(e){if(e.preventDefault(),this.validateForm()){var t=this.state.fields;t.responseCode||(t.responseCode=""),t.dE||(t.dE=""),this.setState({fields:t}),this.authenticate()}}},{key:"validateForm",value:function(){var e=this.state.fields,t=!0;return e.responseCode||(t=!1,alert("Kindly Enter Response Code!")),e.dE||(t=!1,alert("Kindly Choose DE!"),this.state.fields.dE="DE-39"),this.setState({errors:{}}),t}},{key:"render",value:function(){this.state.navigate;var e=this.state.listdata.map((function(e){return Object(b.jsx)("li",{children:e})}));return Object(b.jsxs)("div",{className:"prelogin-page",children:[Object(b.jsx)("div",{className:"login-heading",children:Object(b.jsx)("h3",{children:"Response Code Viewer"})}),Object(b.jsx)("div",{className:"row",children:Object(b.jsxs)("div",{className:"col-12",children:[Object(b.jsxs)("div",{className:"ux-component",children:[Object(b.jsx)("label",{htmlFor:"responseCode",children:"Choose DataElements:"}),Object(b.jsxs)("select",{id:"dE",name:"dE",onChange:this.handleChange,children:[Object(b.jsx)("option",{value:"--",children:"-Data Element-"}),Object(b.jsx)("option",{value:"DE-4",children:"DE-4"}),Object(b.jsx)("option",{value:"DE-5",children:"DE-5"}),Object(b.jsx)("option",{value:"DE-6",children:"DE-6"}),Object(b.jsx)("option",{value:"DE-7",children:"DE-7"}),Object(b.jsx)("option",{value:"DE-8",children:"DE-8"}),Object(b.jsx)("option",{value:"DE-9",children:"DE-9"}),Object(b.jsx)("option",{value:"DE-10",children:"DE-10"}),Object(b.jsx)("option",{value:"DE-11",children:"DE-11"}),Object(b.jsx)("option",{value:"DE-12",children:"DE-12"}),Object(b.jsx)("option",{value:"DE-13",children:"DE-13"}),Object(b.jsx)("option",{value:"DE-14",children:"DE-14"}),Object(b.jsx)("option",{value:"DE-15",children:"DE-15"}),Object(b.jsx)("option",{value:"DE-16",children:"DE-16"}),Object(b.jsx)("option",{value:"DE-18",children:"DE-18"}),Object(b.jsx)("option",{value:"DE-19",children:"DE-19"}),Object(b.jsx)("option",{value:"DE-22",children:"DE-22"}),Object(b.jsx)("option",{value:"DE-23",children:"DE-23"}),Object(b.jsx)("option",{value:"DE-25",children:"DE-25"}),Object(b.jsx)("option",{value:"DE-28",children:"DE-28"}),Object(b.jsx)("option",{value:"DE-32",children:"DE-32"}),Object(b.jsx)("option",{value:"DE-33",children:"DE-33"}),Object(b.jsx)("option",{value:"DE-35",children:"DE-35"}),Object(b.jsx)("option",{value:"DE-39",children:"DE-37"}),Object(b.jsx)("option",{value:"DE-39",children:"DE-38"}),Object(b.jsx)("option",{value:"DE-39",children:"DE-39"}),Object(b.jsx)("option",{value:"DE-40",children:"DE-40"}),Object(b.jsx)("option",{value:"DE-41",children:"DE-41"}),Object(b.jsx)("option",{value:"DE-42",children:"DE-42"}),Object(b.jsx)("option",{value:"DE-43",children:"DE-43"}),Object(b.jsx)("option",{value:"DE-44",children:"DE-44"}),Object(b.jsx)("option",{value:"DE-45",children:"DE-45"}),Object(b.jsx)("option",{value:"DE-48",children:"DE-48"}),Object(b.jsx)("option",{value:"DE-49",children:"DE-49"}),Object(b.jsx)("option",{value:"DE-50",children:"DE-50"}),Object(b.jsx)("option",{value:"DE-51",children:"DE-51"}),Object(b.jsx)("option",{value:"DE-52",children:"DE-52"}),Object(b.jsx)("option",{value:"DE-55",children:"DE-55"}),Object(b.jsx)("option",{value:"DE-60",children:"DE-60"}),Object(b.jsx)("option",{value:"DE-61",children:"DE-61"}),Object(b.jsx)("option",{value:"DE-62",children:"DE-62"}),Object(b.jsx)("option",{value:"DE-63",children:"DE-63"}),Object(b.jsx)("option",{value:"DE-70",children:"DE-70"}),Object(b.jsx)("option",{value:"DE-90",children:"DE-90"}),Object(b.jsx)("option",{value:"DE-91",children:"DE-91"}),Object(b.jsx)("option",{value:"DE-95",children:"DE-95"}),Object(b.jsx)("option",{value:"DE-101",children:"DE-101"}),Object(b.jsx)("option",{value:"DE-102",children:"DE-102"}),Object(b.jsx)("option",{value:"DE-103",children:"DE-103"}),Object(b.jsx)("option",{value:"DE-104",children:"DE-104"}),Object(b.jsx)("option",{value:"DE-111",children:"DE-111"}),Object(b.jsx)("option",{value:"DE-119",children:"DE-119"}),Object(b.jsx)("option",{value:"DE-120",children:"DE-120"}),Object(b.jsx)("option",{value:"DE-121",children:"DE-121"}),Object(b.jsx)("option",{value:"DE-122",children:"DE-122"}),Object(b.jsx)("option",{value:"DE-123",children:"DE-123"}),Object(b.jsx)("option",{value:"DE-124",children:"DE-124"}),Object(b.jsx)("option",{value:"DE-125",children:"DE-125"}),Object(b.jsx)("option",{value:"DE-126",children:"DE-126"}),Object(b.jsx)("option",{value:"DE-127",children:"DE-127"})]}),Object(b.jsx)("input",{id:"responseCode",name:"responseCode",type:"text",onKeyUp:this.handleChange,required:!0})]}),Object(b.jsx)("div",{style:{color:"red",textAlign:"left",display:"block",fontSize:"0.8rem"},children:this.state.errors.username})]})}),Object(b.jsxs)("div",{className:"row",children:[Object(b.jsx)("div",{className:"col-12",children:Object(b.jsx)("div",{className:"form-footer",children:Object(b.jsx)("button",{role:"button",className:"button",onClick:this.submitForm,children:"Submit"})})}),Object(b.jsxs)("div",{children:[this.state.loading&&Object(b.jsx)("img",{src:u}),Object(b.jsx)("ul",{children:e})]})]}),Object(b.jsx)("div",{className:"vspacer50"})]})}}]),n}(i.Component);function v(){return Object(b.jsx)("main",{children:Object(b.jsx)(a.c,{children:Object(b.jsx)(a.a,{exact:!0,path:"/",component:p})})})}n(206);var O=function(){return Object(b.jsx)("div",{className:"app",children:Object(b.jsx)(v,{})})};c.a.render(Object(b.jsx)(s.a,{children:Object(b.jsx)(O,{})}),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[414,1,2]]]);
//# sourceMappingURL=main.97a98ac5.chunk.js.map