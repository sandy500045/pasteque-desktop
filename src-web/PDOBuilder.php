<?php

require_once(dirname(__FILE__) . "/config.php");

class PDOBuilder {

    public static function getPDO() {
        switch (Config::$db_type) {
        case 'mysql':
            $dsn = "mysql:dbname=" . Config::$database . ";host="
                   . Config::$host . ";port=" . Config::$port;
            try {
                return new PDO($dsn, Config::$user, Config::$password,
                               array(PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES \'UTF8\''));
            } catch (PDOException $e) {
                die("Connexion error " . $e);
            }
        default:
            die("Config error");
        }
    }

}

?>