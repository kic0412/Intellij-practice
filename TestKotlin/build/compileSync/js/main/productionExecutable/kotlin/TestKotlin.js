(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'react-dom/client', 'react', '@emotion/css', './kotlin-kotlin-stdlib-js-ir.js', './kotlin-wrappers-kotlin-react-js-ir.js', './kotlin-wrappers-kotlin-react-dom-js-ir.js'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('react-dom/client'), require('react'), require('@emotion/css'), require('./kotlin-kotlin-stdlib-js-ir.js'), require('./kotlin-wrappers-kotlin-react-js-ir.js'), require('./kotlin-wrappers-kotlin-react-dom-js-ir.js'));
  else {
    if (typeof this['react-dom/client'] === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency 'react-dom/client' was not found. Please, check whether 'react-dom/client' is loaded prior to 'TestKotlin'.");
    }
    if (typeof react === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency 'react' was not found. Please, check whether 'react' is loaded prior to 'TestKotlin'.");
    }
    if (typeof this['@emotion/css'] === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency '@emotion/css' was not found. Please, check whether '@emotion/css' is loaded prior to 'TestKotlin'.");
    }
    if (typeof this['kotlin-kotlin-stdlib-js-ir'] === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency 'kotlin-kotlin-stdlib-js-ir' was not found. Please, check whether 'kotlin-kotlin-stdlib-js-ir' is loaded prior to 'TestKotlin'.");
    }
    if (typeof this['kotlin-wrappers-kotlin-react-js-ir'] === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency 'kotlin-wrappers-kotlin-react-js-ir' was not found. Please, check whether 'kotlin-wrappers-kotlin-react-js-ir' is loaded prior to 'TestKotlin'.");
    }
    if (typeof this['kotlin-wrappers-kotlin-react-dom-js-ir'] === 'undefined') {
      throw new Error("Error loading module 'TestKotlin'. Its dependency 'kotlin-wrappers-kotlin-react-dom-js-ir' was not found. Please, check whether 'kotlin-wrappers-kotlin-react-dom-js-ir' is loaded prior to 'TestKotlin'.");
    }
    root.TestKotlin = factory(typeof TestKotlin === 'undefined' ? {} : TestKotlin, this['react-dom/client'], react, this['@emotion/css'], this['kotlin-kotlin-stdlib-js-ir'], this['kotlin-wrappers-kotlin-react-js-ir'], this['kotlin-wrappers-kotlin-react-dom-js-ir']);
  }
}(this, function (_, $module$react_dom_client_y5z5eu, $module$react, $module$_emotion_css_2enn37, kotlin_kotlin, kotlin_org_jetbrains_kotlin_wrappers_kotlin_react, kotlin_org_jetbrains_kotlin_wrappers_kotlin_react_dom) {
  'use strict';
  //region block: imports
  var createRoot = $module$react_dom_client_y5z5eu.createRoot;
  var useState = $module$react.useState;
  var css = $module$_emotion_css_2enn37.css;
  var ensureNotNull = kotlin_kotlin.$_$.k;
  var create = kotlin_org_jetbrains_kotlin_wrappers_kotlin_react.$_$.b;
  var Unit_getInstance = kotlin_kotlin.$_$.a;
  var ReactHTML_getInstance = kotlin_org_jetbrains_kotlin_wrappers_kotlin_react_dom.$_$.a;
  var KMutableProperty0 = kotlin_kotlin.$_$.i;
  var THROW_ISE = kotlin_kotlin.$_$.j;
  var getLocalDelegateReference = kotlin_kotlin.$_$.d;
  var FC = kotlin_org_jetbrains_kotlin_wrappers_kotlin_react.$_$.a;
  //endregion
  //region block: pre-declaration
  //endregion
  function main() {
    var container = document.createElement('div');
    ensureNotNull(document.body).appendChild(container);
    var tmp = get_Welcome();
    var welcome = create(tmp, main$lambda);
    createRoot(container).render(welcome);
  }
  function main$lambda($this$create) {
    $this$create.name = 'Kotlin/JS';
    return Unit_getInstance();
  }
  function get_Welcome() {
    _init_properties_Welcome_kt__vt8fu8();
    return Welcome;
  }
  var Welcome;
  function Welcome$lambda($this$FC, props) {
    _init_properties_Welcome_kt__vt8fu8();
    var name$delegate = useState(props.name);
    var tmp$ret$2;
    // Inline function 'react.dom.html.ReactHTML.div' call
    var tmp0__get_div__2k2o9m = ReactHTML_getInstance();
    var tmp$ret$1;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = 'div';
    tmp$ret$1 = tmp$ret$0;
    tmp$ret$2 = tmp$ret$1;
    var tmp = tmp$ret$2;
    $this$FC.a1(tmp, Welcome$lambda$lambda(name$delegate));
    var tmp$ret$5;
    // Inline function 'react.dom.html.ReactHTML.input' call
    var tmp1__get_input__umcb5q = ReactHTML_getInstance();
    var tmp$ret$4;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp$ret$3;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$3 = 'input';
    tmp$ret$4 = tmp$ret$3;
    tmp$ret$5 = tmp$ret$4;
    var tmp_0 = tmp$ret$5;
    $this$FC.a1(tmp_0, Welcome$lambda$lambda_0(name$delegate));
    return Unit_getInstance();
  }
  function invoke$lambda($name$delegate) {
    _init_properties_Welcome_kt__vt8fu8();
    var tmp$ret$1;
    // Inline function 'react.StateInstance.getValue' call
    var tmp0_getValue = getLocalDelegateReference('name', KMutableProperty0, true, function () {
      return THROW_ISE();
    });
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = $name$delegate;
    tmp$ret$1 = tmp$ret$0[0];
    return tmp$ret$1;
  }
  function invoke$lambda_0($name$delegate, value) {
    _init_properties_Welcome_kt__vt8fu8();
    var tmp0_setValue = getLocalDelegateReference('name', KMutableProperty0, true, function () {
      return THROW_ISE();
    });
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = $name$delegate;
    return tmp$ret$0[1](value);
  }
  function Welcome$lambda$lambda($name$delegate) {
    return function ($this$invoke) {
      var tmp1_css = $this$invoke;
      var tmp$ret$12;
      // Inline function 'emotion.css.ClassName' call
      var tmp$ret$11;
      // Inline function 'kotlinx.js.jso' call
      var tmp$ret$10;
      // Inline function 'kotlin.apply' call
      var tmp$ret$0;
      // Inline function 'kotlinx.js.jso' call
      tmp$ret$0 = {};
      var tmp0_apply = tmp$ret$0;
      // Inline function 'kotlin.contracts.contract' call
      // Inline function 'Welcome.<anonymous>.<anonymous>.<anonymous>' call
      var tmp$ret$3;
      // Inline function 'csstype.px' call
      var tmp$ret$2;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = '5px';
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = tmp0_unsafeCast;
      tmp$ret$2 = tmp$ret$1;
      tmp$ret$3 = tmp$ret$2;
      tmp0_apply.padding = tmp$ret$3;
      var tmp$ret$6;
      // Inline function 'csstype.rgb' call
      var tmp$ret$5;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp1_unsafeCast = 'rgb(8,97,22)';
      var tmp$ret$4;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$4 = tmp1_unsafeCast;
      tmp$ret$5 = tmp$ret$4;
      tmp$ret$6 = tmp$ret$5;
      tmp0_apply.backgroundColor = tmp$ret$6;
      var tmp$ret$9;
      // Inline function 'csstype.rgb' call
      var tmp$ret$8;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp2_unsafeCast = 'rgb(56,246,137)';
      var tmp$ret$7;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$7 = tmp2_unsafeCast;
      tmp$ret$8 = tmp$ret$7;
      tmp$ret$9 = tmp$ret$8;
      tmp0_apply.color = tmp$ret$9;
      tmp$ret$10 = tmp0_apply;
      tmp$ret$11 = tmp$ret$10;
      tmp$ret$12 = css(tmp$ret$11);
      tmp1_css.className = tmp$ret$12;
      $this$invoke.z('Hello, ' + invoke$lambda($name$delegate));
      return Unit_getInstance();
    };
  }
  function Welcome$lambda$lambda$lambda($name$delegate) {
    return function (event) {
      invoke$lambda_0($name$delegate, event.target.value);
      return Unit_getInstance();
    };
  }
  function Welcome$lambda$lambda_0($name$delegate) {
    return function ($this$invoke) {
      var tmp1_css = $this$invoke;
      var tmp$ret$12;
      // Inline function 'emotion.css.ClassName' call
      var tmp$ret$11;
      // Inline function 'kotlinx.js.jso' call
      var tmp$ret$10;
      // Inline function 'kotlin.apply' call
      var tmp$ret$0;
      // Inline function 'kotlinx.js.jso' call
      tmp$ret$0 = {};
      var tmp0_apply = tmp$ret$0;
      // Inline function 'kotlin.contracts.contract' call
      // Inline function 'Welcome.<anonymous>.<anonymous>.<anonymous>' call
      var tmp$ret$3;
      // Inline function 'csstype.px' call
      var tmp$ret$2;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = '5px';
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = tmp0_unsafeCast;
      tmp$ret$2 = tmp$ret$1;
      tmp$ret$3 = tmp$ret$2;
      tmp0_apply.marginTop = tmp$ret$3;
      var tmp$ret$6;
      // Inline function 'csstype.px' call
      var tmp$ret$5;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp1_unsafeCast = '5px';
      var tmp$ret$4;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$4 = tmp1_unsafeCast;
      tmp$ret$5 = tmp$ret$4;
      tmp$ret$6 = tmp$ret$5;
      tmp0_apply.marginBottom = tmp$ret$6;
      var tmp$ret$9;
      // Inline function 'csstype.px' call
      var tmp$ret$8;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp2_unsafeCast = '14px';
      var tmp$ret$7;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$7 = tmp2_unsafeCast;
      tmp$ret$8 = tmp$ret$7;
      tmp$ret$9 = tmp$ret$8;
      tmp0_apply.fontSize = tmp$ret$9;
      tmp$ret$10 = tmp0_apply;
      tmp$ret$11 = tmp$ret$10;
      tmp$ret$12 = css(tmp$ret$11);
      tmp1_css.className = tmp$ret$12;
      $this$invoke.type = (/*union*/{button: 'button', checkbox: 'checkbox', color: 'color', date: 'date', datetimeLocal: 'datetime-local', email: 'email', file: 'file', hidden: 'hidden', image: 'image', month: 'month', number: 'number', password: 'password', radio: 'radio', range: 'range', reset: 'reset', search: 'search', submit: 'submit', tel: 'tel', text: 'text', time: 'time', url: 'url', week: 'week'}/*union*/).text;
      $this$invoke.value = invoke$lambda($name$delegate);
      $this$invoke.onChange = Welcome$lambda$lambda$lambda($name$delegate);
      return Unit_getInstance();
    };
  }
  var properties_initialized_Welcome_kt_8zgob6;
  function _init_properties_Welcome_kt__vt8fu8() {
    if (properties_initialized_Welcome_kt_8zgob6) {
    } else {
      properties_initialized_Welcome_kt_8zgob6 = true;
      Welcome = FC(Welcome$lambda);
    }
  }
  main();
  return _;
}));

//# sourceMappingURL=TestKotlin.js.map
