USE soorotdb;
-- REGISTRO DE USUARIOS
INSERT INTO usuarios VALUES (null, "Dulce Carmona", "eclud_car_95@gmail.com", "Casd950825MDFRNL/09", "2381015478");
INSERT INTO usuarios VALUES (null, "Emilio Muñoz", "mrhemilio@outlook.com", "HotdogCostco$45", "5585248455");
INSERT INTO usuarios VALUES (null, "Fernando Bartolome", "fbartolomem.98@gmail.com", "Suki0712$", "5610921190");
INSERT INTO usuarios VALUES (null, "Uriel Medina", "urielmedina@ciencias.unam.mx", "Nabopo12.", "5613129854");
INSERT INTO usuarios VALUES (null, "Eduardo Esteva Sarralde", "eestevass@gmail.com", "Enero2001#", "5519135105");
-- REGISTRO DE PRODUCTOS
INSERT INTO productos VALUES (null, "Arnés", 1799, "Arnés de seguridad ergonómico para escalada deportiva.", "escalada", "https://images.arcteryx.com/F24/1350x1710/Skaha-Harness-Lampyre-Boxcar.jpg");
INSERT INTO productos VALUES (null, "Cuerda Dinámica", 3499, "Cuerda para absorber impactos y caídas en escalada.", "escalada", "https://www.teufelberger.com/media/catalog/product/cache/ad06d83191629f33f6df1b655e73fe3f/a/p/apex.jpg");
INSERT INTO productos VALUES (null, "Mosquetón con seguro", 349, "Mosquetón con cierre automático para mayor seguridad.", "escalada", "https://m.media-amazon.com/images/I/51JMBbFK-dL._AC_.jpg");
INSERT INTO productos VALUES (null, "Casco", 1299, "Casco resistente para proteger tu cabeza en todo momento.", "escalada", "https://m.media-amazon.com/images/I/61zWMe28UlL._AC_SL1500_.jpg");
INSERT INTO productos VALUES (null, "Gatas", 2199, "Zapatos de precisión y comodidad para escalar mejor.", "escalada", "https://contents.mediadecathlon.com/p2613846/1cr1/k$e33abc7dddd7a50e86c3b848a927624e/gatas-escalada-gris-cometa.jpg?format=auto&f=768x0");
-- REGISTRO DE ÓRDENES
INSERT INTO ordenes VALUES (null, "2025-02-14", 4000.50, 5);
INSERT INTO ordenes VALUES (null, "2024-10-16", 8900, 2);
INSERT INTO ordenes VALUES (null, "2025-01-05", 7400.50, 1);
INSERT INTO ordenes VALUES (null, "2024-10-21", 3000, 3);
INSERT INTO ordenes VALUES (null, "2024-12-20", 1250, 4);
-- REGISTRO DE ORDENES X PRODUCTOS
-- ORDEN DE 2 PRODUCTOS
INSERT INTO ordenes_has_productos VALUES (1, 1, 3);
INSERT INTO ordenes_has_productos VALUES (1, 2, 1);
-- ORDEN DE 3 PRODUCTOS
INSERT INTO ordenes_has_productos VALUES (2, 1, 1);
INSERT INTO ordenes_has_productos VALUES (2, 4, 1);
INSERT INTO ordenes_has_productos VALUES (2, 5, 1);
-- ORDEN DE 1 PRODUCTO
INSERT INTO ordenes_has_productos VALUES (3, 2, 1);
-- ORDEN DE 2 PRODUCTOS
INSERT INTO ordenes_has_productos VALUES (4, 3, 1);
INSERT INTO ordenes_has_productos VALUES (4, 2, 2);
-- ORDEN DE 1 PRODUCTO
INSERT INTO ordenes_has_productos VALUES (5, 1, 3);


SELECT * FROM usuarios;
SELECT * FROM productos;
SELECT * FROM ordenes;
SELECT * FROM ordenes_has_productos;


