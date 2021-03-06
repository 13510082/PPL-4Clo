[:html {:class "no-js"}
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
      [:link {:type "text/css", :rel "stylesheet", :href "/css/style__v2.0.0-rc1.css"}]]
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
                     [:a {:href "index.html"} "Home"]]
                  [:li
                     [:a {:href "#section-contribute"} "Contribute"]]
                  [:li
                     [:a {:href "#section-user"} "Top User"]]
                  [:li
                     [:a {:href "#section-problems"} "Problem List"]]
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
      [:section {:class "section appear clearfix", :id "section-user"}
           [:div {:class "container"}
              [:div {:class "row mar-bot40"}
                 [:div {:class "col-md-offset-3 col-md-6"}
                     [:div {:class "section-header"}
                        [:h2 {:data-animation "bounceInUp", :class "section-heading animated"} "Top User"]
                            [:p "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet consectetur, adipisci velit, sed quia non numquam."]]]]
              [:div {:class "row align-center mar-bot40"} [:div {:class "col-md-3"} [:div {:class "team-member"} [:figure {:class "member-photo"} [:img {:alt "", :src "img/team/member1.jpg"}]] [:div {:class "team-detail"} [:h4 "Jason Doe"] [:span "User experiences"]]]] [:div {:class "col-md-3"} [:div {:class "team-member"} [:figure {:class "member-photo"} [:img {:alt "", :src "img/team/member2.jpg"}]] [:div {:class "team-detail"} [:h4 "Timothy Clark"] [:span "Web developer"]]]] [:div {:class "col-md-3"} [:div {:class "team-member"} [:figure {:class "member-photo"} [:img {:alt "", :src "img/team/member3.jpg"}]] [:div {:class "team-detail"} [:h4 "Vicky Tan"] [:span "Web designer"]]]] [:div {:class "col-md-3"} [:div {:class "team-member"} [:figure {:class "member-photo"} [:img {:alt "", :src "img/team/member4.jpg"}]] [:div {:class "team-detail"} [:h4 "Kevin Peterson"] [:span "UI designer"]]]]]]] [:section {:data-stellar-background-ratio "0.5", :class "section pad-top40 pad-bot40", :id "parallax1"} [:div {:class "container"} [:div {:class "align-center pad-top40 pad-bot40"} [:blockquote {:class "bigquote color-white"} "\"Simplicity, freedom to focus, empowerment, consistency, and clarity: Nearly every element of the Clojure programming language is designed to promote these goals\""] [:p {:class "color-white"} "Michael Fogus"]]]] [:section {:class "section appear clearfix", :id "section-problems"} [:div {:class "container"} [:div {:class "row mar-bot40"} [:div {:class "col-md-offset-3 col-md-6"} [:div {:class "section-header"} [:h2 {:data-animation "bounceInUp", :class "section-heading animated"} "Problem List"] [:p "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet consectetur, adipisci velit, sed quia non numquam."]]]] [:div {:class "row"} [:nav {:class "col-md-12 text-center", :id "filter"} [:ul [:li [:a {:data-filter "*", :class "current btn-theme btn-small", :href "#"} "All"]] [:li [:a {:data-filter ".webdesign", :class "btn-theme btn-small", :href "#"} "Web Design"]] [:li [:a {:data-filter ".photography", :class "btn-theme btn-small", :href "#"} "Photography"]] [:li [:a {:data-filter ".print", :class "btn-theme btn-small", :href "#"} "Print"]]]] [:div {:class "col-md-12"} [:div {:class "row"} [:div {:id "3", :class "portfolio-items isotopeWrapper clearfix"} [:article {:class "col-md-4 isotopeItem webdesign"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img1.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img1.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem photography"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img2.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img2.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem photography"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img3.jpg"}] " " [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img3.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem print"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img4.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img4.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem photography"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img5.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img5.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem webdesign"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img6.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img6.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem print"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img7.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img7.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem photography"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img8.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img8.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]] [:article {:class "col-md-4 isotopeItem print"} [:div {:class "portfolio-item"} [:img {:alt "", :src "img/portfolio/img9.jpg"}] [:div {:class "portfolio-desc align-center"} [:div {:class "folio-info"} [:h5 [:a {:href "#"} "Portfolio name"]] [:a {:class "fancybox", :href "img/portfolio/img9.jpg"} [:i {:class "fa fa-plus fa-2x"}]]]]]]]]]]]] [:section {:data-stellar-background-ratio "0.5", :class "section parallax", :id "parallax2"} [:div {:class "align-center pad-top40 pad-bot40"} [:blockquote {:class "bigquote color-black"} "\"Clojure was born out of frustration provoked in large part by the complexities of concurrent programming, complicated by the weaknesses of object-oriented programming in facilitating it.\" "] [:p {:class "color-white"} "Michael Fogus"]]] [:section {:class "section appear clearfix", :id "section-register"} [:div {:class "container"} [:div {:class "row mar-bot40"} [:div {:class "col-md-offset-3 col-md-6"} [:div {:class "section-header"} [:h2 {:data-animation "bounceInUp", :class "section-heading animated"} "Register"]]]] [:div {:class "row"} [:div {:class "col-md-8 col-md-offset-2"} [:div {:id "contact-form", :class "cform"} [:div {:id "sendmessage"} " You have been registered. Thank you!"] [:form {:class "contactForm", :role "form", :method "post", :action "contact/contact.php"} [:div {:class "form-group"} [:label {:for "name"} "Username"] [:input {:data-msg "Please enter at least 4 chars", :data-rule "maxlen:4", :placeholder "Userame", :id "name", :class "form-control", :name "name", :type "text"}] [:div {:class "validation"}]] [:div {:class "form-group"} [:label {:for "password"} "Password"] [:input {:data-msg "Please enter at least 7 chars", :data-rule "maxlen:7", :placeholder "Password", :id "password", :class "form-control", :name "password", :type "text"}] [:div {:class "validation"}]] [:div {:class "form-group"} [:label {:for "repeatpassword"} "Repeat Password"] [:input {:data-msg "Please enter at least 7 chars", :data-rule "maxlen:7", :placeholder "Repeat Password", :id "repeatpassword", :class "form-control", :name "repeatpassword", :type "text"}] [:div {:class "validation"}] " "] " " [:div {:class "form-group"} " " [:label {:for "email"} "Email"] " " [:input {:data-msg "Please enter a valid email", :data-rule "email", :placeholder "Email", :id "email", :name "email", :class "form-control", :type "email"}] " " [:div {:class "validation"}] " "] " " [:button {:class "btn btn-theme pull-left", :type "submit"} "Register"] " "] " "] " "] " "] " "] " "] " " [:section {:class "section footer", :id "footer"} " " [:div {:class "container"} " " [:div {:data-animation "animation", :data-andown "fadeIn", :class "row animated opacity mar-bot20"} " " [:div {:class "col-sm-12 align-center"} " " [:ul {:class "social-network social-circle"} " " [:li [:a {:title "Rss", :class "icoRss", :href "#"} [:i {:class "fa fa-rss"}]]] " " [:li [:a {:title "Facebook", :class "icoFacebook", :href "#"} [:i {:class "fa fa-facebook"}]]] " " [:li [:a {:title "Twitter", :class "icoTwitter", :href "#"} [:i {:class "fa fa-twitter"}]]] " " [:li [:a {:title "Google +", :class "icoGoogle", :href "#"} [:i {:class "fa fa-google-plus"}]]] " " [:li [:a {:title "Linkedin", :class "icoLinkedin", :href "#"} [:i {:class "fa fa-linkedin"}]]] " "]] " "] " " [:div {:class "row align-center copyright"} " " [:div {:class "col-sm-12"} [:p "Copyright © 2014 Amoeba - by " [:a {:href "http://bootstraptaste.com"} "Bootstraptaste"]]] " "] " "] " "] " " [:a {:class "scrollup", :href "#header"} [:i {:class "fa fa-chevron-up"}]] " " [:script {:src "js/modernizr-2.6.2-respond-1.1.0.min.js"}] " " [:script {:src "js/jquery.js"}] " " [:script {:src "js/jquery.easing.1.3.js"}] " " [:script {:src "js/bootstrap.min.js"}] " " [:script {:src "https://maps.googleapis.com/maps/api/js?key=AIzaSyASm3CwaK9qtcZEWYa-iQwHaGi3gcosAJc&sensor=false"}] " " [:script {:src "js/jquery.isotope.min.js"}] " " [:script {:src "js/jquery.nicescroll.min.js"}] " " [:script {:src "js/fancybox/jquery.fancybox.pack.js"}] " " [:script {:src "js/skrollr.min.js"}] [:script {:src "js/jquery.scrollTo-1.4.3.1-min.js"}] [:script {:src "js/jquery.localscroll-1.2.7-min.js"}] " " [:script {:src "js/stellar.js"}] " " [:script {:src "js/jquery.appear.js"}] " " [:script {:src "js/validate.js"}] " " [:script {:src "js/main.js"}]] " "]
