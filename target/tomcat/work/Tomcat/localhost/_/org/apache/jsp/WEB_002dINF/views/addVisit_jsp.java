/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-03 17:20:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addVisit_jsp extends org.apache.jasper.runtime.HttpJspBase
        implements org.apache.jasper.runtime.JspSourceDependent {

    private static final javax.servlet.jsp.JspFactory _jspxFactory =
            javax.servlet.jsp.JspFactory.getDefaultFactory();

    private static java.util.Map<java.lang.String, java.lang.Long> _jspx_dependants;

    static {
        _jspx_dependants = new java.util.HashMap<java.lang.String, java.lang.Long>(1);
        _jspx_dependants.put("/WEB-INF/views/./common/header.jspf", Long.valueOf(1656778020827L));
    }

    private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
    private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fclass_005fnobody;
    private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fclass_005fnobody;

    private javax.el.ExpressionFactory _el_expressionfactory;
    private org.apache.tomcat.InstanceManager _jsp_instancemanager;

    public java.util.Map<java.lang.String, java.lang.Long> getDependants() {
        return _jspx_dependants;
    }

    public void _jspInit() {
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
        _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
        _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
        _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
    }

    public void _jspDestroy() {
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
        _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fclass_005fnobody.release();
        _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fclass_005fnobody.release();
    }

    public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
            throws java.io.IOException, javax.servlet.ServletException {

        final javax.servlet.jsp.PageContext pageContext;
        javax.servlet.http.HttpSession session = null;
        final javax.servlet.ServletContext application;
        final javax.servlet.ServletConfig config;
        javax.servlet.jsp.JspWriter out = null;
        final java.lang.Object page = this;
        javax.servlet.jsp.JspWriter _jspx_out = null;
        javax.servlet.jsp.PageContext _jspx_page_context = null;


        try {
            response.setContentType("text/html;charset=UTF-8");
            pageContext = _jspxFactory.getPageContext(this, request, response,
                    null, true, 8192, true);
            _jspx_page_context = pageContext;
            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();
            _jspx_out = out;

            out.write('\r');
            out.write('\n');
            out.write("\r\n");
            out.write("\r\n");
            out.write("<!DOCTYPE html>\r\n");
            out.write("<html>\r\n");
            out.write("<head>\r\n");
            out.write("<meta charset=\"ISO-8859-1\">\r\n");
            out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
            out.write("<link rel=\"stylesheet\" href=\"src/main/resources/bootstrap/bootstrap-5.1.3-dist/css/bootstrap.min.css\" />\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("<title>add-pet-page</title>\r\n");
            out.write("</head>\r\n");
            out.write("<body class=\"container\">\r\n");
            out.write("<br><br>\r\n");
            out.write("<h3>New Visit:</h3>\r\n");
            out.write("<br>\r\n");
            out.write("<div class=\"row\">\r\n");
            out.write("    <div class=\"col-md-1\"></div>\r\n");
            out.write("        <div class=\"col\">\r\n");
            out.write("        <div class=\"container\">\r\n");
            out.write("        ");
            if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
                return;
            out.write("\r\n");
            out.write("        </div>\r\n");
            out.write("        </div>\r\n");
            out.write("        </div>\r\n");
            out.write("        </div>\r\n");
            out.write("    </body>\r\n");
            out.write("</html>");
        } catch (java.lang.Throwable t) {
            if (!(t instanceof javax.servlet.jsp.SkipPageException)) {
                out = _jspx_out;
                if (out != null && out.getBufferSize() != 0)
                    try {
                        out.clearBuffer();
                    } catch (java.io.IOException e) {
                    }
                if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
                else throw new ServletException(t);
            }
        } finally {
            _jspxFactory.releasePageContext(_jspx_page_context);
        }
    }

    private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
            throws java.lang.Throwable {
        javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
        javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
        //  form:form
        org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
        _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005fform_005f0.setParent(null);
        // /WEB-INF/views/addVisit.jsp(13,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/detail/${idOwner}/visitAdded/${idPet}", java.lang.String.class, (javax.servlet.jsp.PageContext) _jspx_page_context, null, false));
        // /WEB-INF/views/addVisit.jsp(13,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setMethod("POST");
        // /WEB-INF/views/addVisit.jsp(13,8) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setModelAttribute("visit");
        int[] _jspx_push_body_count_form_005fform_005f0 = new int[]{0};
        try {
            int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
            if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                    out.write("\r\n");
                    out.write("            <div class=\"row\">\r\n");
                    out.write("                <label class=\"col-md-3\"><strong>Date</strong>(MM/dd/YYYY)<strong>:</strong></label>\r\n");
                    out.write("                ");
                    if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
                        return true;
                    out.write("\r\n");
                    out.write("            </div><br>\r\n");
                    out.write("            <div class=\"row\">\r\n");
                    out.write("                <label class=\"col-md-3\"><strong>Description:</strong></label>\r\n");
                    out.write("                ");
                    if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
                        return true;
                    out.write("\r\n");
                    out.write("            </div><br>\r\n");
                    out.write("            <div class=\"row\">\r\n");
                    out.write("               <label class=\"col-md-2\"></label>\r\n");
                    out.write("               <span class=\"col-md-8\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class=\"btn btn-dark\" type=\"submit\">Add Visit</button></span>\r\n");
                    out.write("            </div>\r\n");
                    out.write("        ");
                    int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                } while (true);
            }
            if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return true;
            }
        } catch (java.lang.Throwable _jspx_exception) {
            while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
            _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
        } finally {
            _jspx_th_form_005fform_005f0.doFinally();
            _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
        }
        return false;
    }

    private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
            throws java.lang.Throwable {
        javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
        javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
        //  form:input
        org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
        _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
        // /WEB-INF/views/addVisit.jsp(16,16) null
        _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "col-md-8");
        // /WEB-INF/views/addVisit.jsp(16,16) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005finput_005f0.setPath("date");
        int[] _jspx_push_body_count_form_005finput_005f0 = new int[]{0};
        try {
            int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
            if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return true;
            }
        } catch (java.lang.Throwable _jspx_exception) {
            while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
            _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
        } finally {
            _jspx_th_form_005finput_005f0.doFinally();
            _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
        }
        return false;
    }

    private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
            throws java.lang.Throwable {
        javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
        javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
        //  form:textarea
        org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
        _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
        // /WEB-INF/views/addVisit.jsp(20,16) null
        _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", "col-md-8");
        // /WEB-INF/views/addVisit.jsp(20,16) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005ftextarea_005f0.setPath("description");
        int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[]{0};
        try {
            int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
            if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return true;
            }
        } catch (java.lang.Throwable _jspx_exception) {
            while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
            _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
        } finally {
            _jspx_th_form_005ftextarea_005f0.doFinally();
            _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
        }
        return false;
    }
}
