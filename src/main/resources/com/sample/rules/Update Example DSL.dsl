[when]If car costs ${var}=$c : Car( carPrice == {var} )
[then]Apply Discount=$c.setCarPrice( 4500); update ($c);