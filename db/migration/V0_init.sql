create table if not exists users
(
	id integer not null
		constraint users_pkey
			primary key,
	name varchar(40) not null,
	phone varchar,
	address varchar(100),
	password varchar(16) not null,
	email varchar(40) not null
);

create table if not exists cart
(
	id integer not null
		constraint cart_pkey
			primary key,
	client_id integer not null
		constraint cart_users_id_fk
			references users,
	total_price integer
);

create table if not exists goods
(
	id integer generated always as identity
		constraint goods_pkey
			primary key,
	name varchar(100) not null,
	category varchar(40) not null,
	price numeric not null,
	img varchar
);

create table if not exists orders
(
	id integer not null
		constraint orders_pkey
			primary key,
	goods_id integer not null
		constraint orders_goods_id_fk
			references goods,
	date date not null,
	client_id integer
		constraint fk_client
			references users,
	delivery boolean not null
);

create table if not exists cart_item
(
	cart_id integer not null
		constraint cart_item_cart_id_fk
			references cart,
	goods_id integer not null
        references goods,
	amount integer,
	constraint cart_item_pk_2
		primary key (cart_id, goods_id),
	constraint cart_item_pk
		unique (cart_id, goods_id)
);

create unique index if not exists cart_item_cart_id_uindex
	on cart_item (cart_id, goods_id);

create table if not exists order_item
(
	order_id integer not null
		    references orders,
	goods_id integer not null
            references goods,
	amount integer,
	constraint order_item_pk
		primary key (order_id, goods_id)
);

create unique index if not exists order_item_goods_id_uindex
	on order_item (order_id, goods_id);

create table if not exists roles
(
	id integer default 1 not null
		constraint user_category_pkey
			primary key,
	name_role varchar(40) not null
);

create table if not exists user_roles
(
    user_id integer not null
            references users,
    role_id integer not null
        references roles,
    constraint user_roles_pk
        primary key (user_id, role_id)
);

create unique index if not exists user_roles_role_id_uindex
	on user_roles (user_id, role_id);

