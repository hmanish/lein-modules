(defproject child "0.1.0-SNAPSHOT"
  :description "child"
  :parent [parent _ :relative-path "../pom.xml"]
  :dependencies [[x _]
                 [y _]
                 [scope _ :scope "pom"]
                 [z "1.2.3"]]
  :modules {:versions {parent "3.0"}})