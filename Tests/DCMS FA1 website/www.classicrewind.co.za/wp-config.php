<?php

// BEGIN iThemes Security - Do not modify or remove this line
// iThemes Security Config Details: 2
define( 'DISALLOW_FILE_EDIT', true ); // Disable File Editor - Security > Settings > WordPress Tweaks > File Editor
// END iThemes Security - Do not modify or remove this line

define( 'ITSEC_ENCRYPTION_KEY', 'eSFKa3QsZ1AuTDRNP3FRQFohZCleMTROZS9sZCFmbDdRfmRsS2xZTyhmdUVObVgqIzZ3VFE1eiRIMTg6LkludQ==' );

/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the website, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://developer.wordpress.org/advanced-administration/wordpress/wp-config/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'classicrewind' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', '' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '91RpH;n-{.M?`>5+~AbVav|Br:-)q,OkK[5es@ol%g2#/<pUbSJ88<KPD0ZUX<Gx' );
define( 'SECURE_AUTH_KEY',  'Z;SFY9^_<S2EkvY5*U^-I06Wqcf}:zNj(K?B0cFxB~E3YDef&~g^x|K ~Jv@yV(S' );
define( 'LOGGED_IN_KEY',    '1a1I+Z:b&G6fHA(Ki$(siW.V&`+:t zR5$&-j<`2ycHP`wk.G2pw t)?5ueC5`2f' );
define( 'NONCE_KEY',        '/J*lPAYl(#nah-gw25*ln>wK0v2j9y20%VzSWD)~YvFG>&aNNjUjW?hr5hk}PCN}' );
define( 'AUTH_SALT',        '9M8vNcqY#;HUfoa/r5Kv=!Z>lwS,Ue/nSn3;x`<Ebt7P&|j_t_EN[m2w!zZXje}O' );
define( 'SECURE_AUTH_SALT', '?z~qft4vI~wXinkrCua:1/qf~R^91O!2??b$p0SPofQ%*b0FYktEYV.Zn2Z$6Xx*' );
define( 'LOGGED_IN_SALT',   '+@ufWtbN}I1L-a/0yU}Il9X_f4&UWKU%s`p%PI,]j5[wv64<D:ht`@2d;TTBW0yc' );
define( 'NONCE_SALT',       'h_8!LNY2$yf<B:HJRfeI%K!4 +6I2a?!/cIO6&}PwgZiG!@-S<vy$,A)rJ,,C(4J' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://developer.wordpress.org/advanced-administration/debug/debug-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
