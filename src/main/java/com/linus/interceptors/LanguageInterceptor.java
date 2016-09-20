package com.linus.interceptors;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContext;

/**
 * 
 * @author lyan2
 */
public class LanguageInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse resp, Object handler, ModelAndView model)
			throws Exception {
		
		if (model == null) {
			return;
		}

		// Get lang from cookie "eBayCBTLang" and parameter "lang"
		RequestContext context = new RequestContext(request);
		Locale locale = context.getLocale();
		String lang = locale.getLanguage() + "_" + locale.getCountry();
		
		// zh_HK and zh_TW are the same, so we just use zh_HK.
		if (lang.equalsIgnoreCase("zh_TW")) {
			lang = "zh_HK";
		}

		if (model != null && model.hasView()) {
			String viewName = model.getViewName();
			
			// default locale is zh_CN
			if (viewName != null && !"zh_CN".equalsIgnoreCase(lang)	&& viewName.indexOf(lang) == -1) {
				viewName = lang + "/" + viewName;
				model.setViewName(viewName);
			}
		}
	}

}
