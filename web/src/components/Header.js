import React from 'react'
import AppBar from '@mui/material/AppBar';
import { Button, Toolbar, Typography } from '@mui/material';
import {Link, useLocation} from 'react-router-dom'
import SportsTennisOutlinedIcon from '@mui/icons-material/SportsTennisOutlined';

export const Header = () => {
  const location = useLocation()

  return (
    <AppBar position="static">
        <Toolbar variant="dense">
            <SportsTennisOutlinedIcon />
            <Typography variant="h6" color="inherit" component="div" sx={{ ml: 1, flexGrow: 1 }}>
            Tennis Game
            </Typography>
            {location.pathname === '/board' && (
                <Link to='/'>
                  <Button sx={{ my: 2, color: 'white', display: 'block' }}>New Game</Button>
                </Link>
            )}
        </Toolbar>
    </AppBar>
  )
}
