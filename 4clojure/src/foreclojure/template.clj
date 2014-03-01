(ns foreclojure.template
  (:require [noir.session              :as   session])
  (:use     [hiccup.core               :only [html]]
            [hiccup.page               :only [doctype]]
            [hiccup.element            :only [javascript-tag link-to]]
            [foreclojure.config        :only [config repo-url]]
            [foreclojure.utils         :only [page-attributes rendering-info login-url approver? can-submit? codemirror-themes get-theme]]
            [foreclojure.ring-utils    :only [static-url]]
            [foreclojure.version-utils :only [css js]]))



;; Global wrapping template
(defn html-doc [body]
  (let [attrs (rendering-info (page-attributes body))
        user (session/get :user)]
    (html
     (doctype :html)
     [:html
   [:head
      [:meta {:charset "utf-8"}]
      [:meta {:content "IE=edge,chrome=1", :http-equiv "X-UA-Compatible"}]
      [:title "4Clojure - Welcome!"]
      [:meta {:content "", :name "description"}]
      [:meta {:content "width=device-width, initial-scale=1.0", :name "viewport"}]
      [:link {:media "screen", :href "css/isotope.css", :type "text/css", :rel "stylesheet"}]
      [:link {:media "screen", :type "text/css", :href "js/fancybox/jquery.fancybox.css", :rel "stylesheet"}]
      [:link {:href "css/bootstrap.css", :rel "stylesheet"}]
      [:link {:href "css/bootstrap-theme.css", :rel "stylesheet"}]
      [:link {:href "css/style.css", :rel "stylesheet"}]
      [:link {:type "text/css", :rel "stylesheet", :href "/css/style__v2.0.0-rc1.css"}]
      [:link {:rel "alternate" :type "application/atom+xml" :title "Atom" :href "/problems/rss"}]
       [:link {:rel "shortcut icon" :href (static-url "favicon2.ico")}]
       (css "css/demo_table.css" "css/codemirror.css")
       (apply css (map #(format "css/theme/%s.css" %) codemirror-themes))
       (js "vendor/script/jquery-1.5.2.min.js" "vendor/script/jquery.dataTables.min.js" "vendor/script/jquery.flipCounter.1.1.pack.js" "vendor/script/jquery.easing.1.3.js" "vendor/script/jquery.dataTables.fnSetFilteringDelay.js")
       (js "script/codebox.js" "script/foreclojure.js")
       (js "vendor/script/codemirror-clojure-compressed.js")
       (js "vendor/script/detectmobilebrowser.js")
       (javascript-tag (format "CodeBox.theme = '%s';" (get-theme)))]
   [:body
      [:section {:class "appear", :id "header"}]
      [:div
         {:data-300 "line-height:60px; height:60px; background-color:rgba(0,0,0,1);", :data-0 "line-height:100px; height:100px; background-color:rgba(0,0,0,0.3);", :role "navigation", :class "navbar navbar-fixed-top"}
         [:div {:class "container"}
            [:div {:class "navbar-header"}
               [:button {:data-target ".navbar-collapse", :data-toggle "collapse", :class "navbar-toggle", :type "button"}
                  [:span {:class "fa fa-bars color-white"}]]
               [:h1
                  [:a {:data-300 "line-height:20px;", :data-0 "line-height:90px;", :href "index.html", :class "navbar-brand"}
                     [:img {:src "img/4Clo-Logo.png"}]]]]
            [:div {:class "navbar-collapse collapse"}

             [:ul {:data-300 "margin-top:5px;", :data-0 "margin-top:20px;", :class "nav navbar-nav"}
                  [:li {:class "active"}
                     [:a {:href "#"} "Home"]]
                  [:li
                     [:a {:href "#section-contribute"} "Contribute"]]
                  [:li
                     [:a {:href "/users"} "Top User"]]
                  [:li
                     [:a {:href "http://localhost:3001/problems"} "Problem List"]]
                  [:li
                     [:a {:href "#section-register"} "Register"]]
                  [:li
                     [:a {:href "http://tryclj.com/"} "REPL"]]
                  [:li]
                  [:li
                     [:a {:href "http://clojure.org/"} "Docs"]]
                  [:li]]]]]
        [:section {:class "featured"}
           [:div {:class "container"}
              [:h1
                 [:a {:data-300 "line-height:20px;", :data-0 "line-height:90px;", :href "index.html", :class "navbar-brand"}]]
              [:div {:class "row mar-bot40"}
                 [:div {:class "align-left"}
                    [:h2 {:class "slogan"} "Welcome to 4Clojure"]
                    [:p "4Clojure is a resource to help fledgling clojurians learn the language through interactive problems." [:br] "The first few problems are easy enough that even someone with no prior experience should find the learning curve forgiving." [:br] "See 'Help' for more information."]
                    [:br]
                    [:input {:data-msg "Please enter at least 4 chars", :data-rule "maxlen:4", :placeholder "Username", :id "username", :class "form-control", :name "username", :type "text"}]
                    [:input {:data-msg "Please enter at least 8 chars", :data-rule "maxlen:8", :placeholder "Password", :id "password", :class "form-control", :name "password", :type "text"}]
                    [:button {:class "btn btn-theme pull-left", :type "submit"} "LOGIN"]
                    [:br]
                    [:br]
                    [:p "Doesn't have account yet? " [:a {:href "#section-contact"} " Register "] " now!"]
                    [:img {:src "img/Facebook-Login.png"}]
                    [:img {:src "img/Twitter-Login.png"}]]]]]
        [:section {:class "section pad-bot30 bg-white", :id "section-contribute"}
           [:div {:class "container"}
              [:div {:class "align-center"}
                 [:h1 {:class "text-bold"} "Let's Contribute!"]
                 [:p"Is this site written in Clojure?Absolutely! This site was created using a variety of open source Clojure (and Java) libraries. In fact, the code for this site is itself open source. Once you've mastered the language, feel free to contribute something back to the community."]
                 [:br]
                 [:div {:id "github-banner"}
                        [:a {:href "https://github.com/4Clojure/4Clojure", :alt "Fork 4Clojure on Github!"} [:img {:src "img/ForkGitHub.png"}]]]]]]
      [:section {:data-stellar-background-ratio "0.5", :class "section", :id "testimonials"}
           [:div {:class "container"}
              [:div {:class "row"}
                 [:div {:class "col-lg-12"}
                    [:div {:class "align-center"}
                         [:img {:src "img/flipCounter-medium.png"}]
                         [:div {:class "testimonial pad-top40 pad-bot40 clearfix"}
                              [:h5 "Clojure approaches solving software problems from a different angle than classical object-oriented techniques, but it does so having been motivated by their fundamental strengths and shortcomings"]
                              [:br]
                              [:span {:class "author"} "— MICHAEL FOGUS " [:a {:href "#"} "http://www.drdobbs.com/architecture-and-design/the-clojure-philosophy/240150710"]]]]]]]]

      (javascript-tag
         "var _gaq = _gaq || [];
          _gaq.push(['_setAccount', 'UA-22844856-1']);
          _gaq.push(['_trackPageview']);

          (function() {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
          })();"
         )
    ]]
)))





;; Content templates
(defn content-page [{:keys [heading heading-note sub-heading main]}]
  (let [flash-message (session/flash-get :message)
        flash-error   (session/flash-get :error)]
    (list
     (when heading       [:div#heading      heading])
     (when heading-note  [:div#heading-note heading-note])
     (when sub-heading   [:div#sub-heading  sub-heading])
     (when flash-message [:div.message
                          [:span#flash-text flash-message]])
     (when flash-error   [:div.message
                          [:span#error-text flash-error]])
     (when main          [:div#main         main]))))

(defmacro def-page [page-name [& args] & code]
  `(defn ~page-name [~@args]
     (html-doc (do ~@code))))
