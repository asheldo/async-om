(defproject atw-om/lein-template "0.0.1"
  :description "Clojure, all the way with Om, based on zaiste/atw-om"
  :url "https://github.com/asheldo/async-om"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/asheldo/async-om"}
  :signing {:gpg-key "andymsheldon@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :eval-in-leiningen true)
