{:servers ["irc.freenode.net"]        ; A list of servers.
 :prepends #{"@"}   ; The character you want for a prepend. Currently set to @
 :max-operations 3 ; The maximum number of operations that can be running at any given time.
 :pending-ops 0    ; The number of operations running right now
 :prefix-arrow "\u21D2 "
 :clojure {:eval-prefixes {:defaults ["->" "." "," ; prefixes in any channel
                                      #"&\|(.*?)(?=\|&|\|&|$)" ; stuff like &|this|&
                                      #"##(([^#]|#(?!#))+)\s*((##)?(?=.*##)|$)"]}}
 "irc.freenode.net" {:channels ["##tcrawley" "#immutant" "#torquebox"]
                     :bot-name "proddbot"
                     :plugins #{"clojure" "javadoc" "jruby" "jira" "greeting"}}
 :jira {"##tcrawley"
        {:regex #"fil(e|ing) a jira\\?"
         :url "https://issues.jboss.org/browse/IMMUTANT"}
        "#immutant"
        {:regex #"fil(e|ing) a jira\\?"
         :url "https://issues.jboss.org/browse/IMMUTANT"}
        "#torquebox"
        {:regex #"fil(e|ing) a jira\\?"
         :url "https://issues.jboss.org/browse/TORQUE"}}
 :greeting {:regex #"^ *morning[!]*$"
            :response "morning!"}}