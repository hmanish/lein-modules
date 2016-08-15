(defproject lein-modules-bpk "0.3.12.bpk"
  :description "Similar to Maven multi-module projects, but less sucky"
  :url "https://github.com/hmanish/lein-modules.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :aliases {"all" ["do" "clean," "test," "install"]}
  :signing {:gpg-key "92439EF5"}
  :plugins [[lein-file-replace "0.1.0"]]
  :deploy-repositories {"releases" :clojars}
  :release-tasks
  [["vcs" "assert-committed"]
   ["change" "version" "leiningen.release/bump-version" "release"]

   ["file-replace" "README.md" "lein-modules \"" "\"]" "version"]

   ["vcs" "commit"]
   ["vcs" "tag"]
   ["deploy"]
   ["change" "version" "leiningen.release/bump-version"]
   ["vcs" "commit"]
   ["vcs" "push"]])
